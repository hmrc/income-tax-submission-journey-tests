/*
 * Copyright 2023 HM Revenue & Customs
 *
 */

const fs = require('fs');

const dataPath = "src/test/resources/stub_data/DATA"
const templatePath = "src/test/resources/stub_data_template/DATA"
const { getAllFiles, getTemplateJson, writeJson } = require("./fileutils")

const yearOfMigration = "2020"

const startYear = 2019;
const numberOfYears = 5;

const dateRanges = Array.from({ length: numberOfYears }, (_, i) => {
    const fromYear = startYear + i;
    const toYear = fromYear + 1;
    return {
        from: `${fromYear}-04-06`,
        to: `${toYear}-04-05`
    };
});

const addBusinessDetails1171IF = (nino, mtdItId) => {
          // 1171 v2 (IF platform) files
          const businessDetailsIF = getTemplateJson(`${templatePath}/IF_API1171_business_details/default_multiple_businesses_and_properties.json`)
          businessDetailsIF.response.taxPayerDisplayResponse.yearOfMigration = yearOfMigration
          businessDetailsIF._id = `/registration/business-details/mtdId/${mtdItId}`
          businessDetailsIF.response.taxPayerDisplayResponse.nino = nino
          businessDetailsIF.response.taxPayerDisplayResponse.mtdId = mtdItId
          writeJson(`${dataPath}/IF_API1171_business_details/${nino}.json`, businessDetailsIF)

          // nino call for agent login
          businessDetailsIF._id = `/registration/business-details/nino/${nino}`
          writeJson(`${dataPath}/IF_API1171_business_details_nino_call/${nino}.json`, businessDetailsIF)
      }

module.exports = {
    addObligations1330StatusO: (nino) => {
            const obligations = getTemplateJson(`${templatePath}/DES_API1330_obligations/default_multiple_obligations.json`);
            obligations._id = `/enterprise/obligation-data/nino/${nino}/ITSA?status=O`;
            writeJson(`${dataPath}/DES_API1330_obligations/${nino}.json`, obligations, null, 2);
        },
        addObligations1330ForPeriod: (nino) => {
            dateRanges.forEach(range => {
                const obligations = getTemplateJson(`${templatePath}/DES_API1330_obligations/default_multiple_obligations.json`);
                obligations._id = `/enterprise/obligation-data/nino/${nino}/ITSA?from=${range.from}&to=${range.to}`;
                writeJson(`${dataPath}/DES_API1330_obligations/${nino}_${range.to.split('-')[0]}.json`, obligations, null, 2);
            });
        },
    addBusinessDetails1171IF: (nino, mtdItId) => {
        addBusinessDetails1171IF(nino, mtdItId)
    },
addCredits1553: (nino) => {
        const template = getTemplateJson(`${templatePath}/DES_API1553_get_financial_details/default_with_credits.json`);
        dateRanges.forEach(({ from, to }) => {
            const fds = { ...template };
            fds._id = fds._id
                .replace("$NINO$", nino)
                .replace("$DATEFROM$", from)
                .replace("$DATETO$", to);
            writeJson(`${dataPath}/DES_API1553_get_financial_details/${nino}_${to.split('-')[0]}.json`, fds, null, 2);
        });
    },
    addCalcData: (nino, firstTaxYear) => {
        const getCalcId = (nino, taxYear) => {
            const matchChars = `${nino.charAt(0)}${nino.charAt(7)}`.toLowerCase()
            return `041f7e4d-87d9-4d4a-a296-3cfbdf${taxYear}${matchChars}`
        }
        const getRequestUrl = (taxYear) => {
            const calcId = getCalcId(nino, taxYear)
            if (taxYear >= 2024) {
              const taxRange = `${(taxYear - 1).toString().substring(2,4)}-${taxYear.toString().substring(2,4)}`
              return `/income-tax/view/calculations/liability/${taxRange}/${nino}/${calcId}`
            } else {
              return `/income-tax/view/calculations/liability/${nino}/${calcId}`
            }
        }
        const getCurrentTaxYear = () => {
            const currentDate = new Date()
            const currentYear = currentDate.getFullYear()
            return currentDate > new Date(currentYear + "-04-05") ? currentYear + 1 : currentYear
        }
        const endTaxYear = getCurrentTaxYear()
        const taxYears = Array.from({length: (endTaxYear - (firstTaxYear - 1))}, (v, k) => k + firstTaxYear)
        taxYears.forEach(taxYear => {
            const template1523 = `${templatePath}/DES_API1523_Get_Calculation_Data/default_calc_min.json`
            const template1885 = `${templatePath}/IF_API1885_Get_Calculation_Data/default_calc_min.json`
            const template = getTemplateJson(taxYear >= 2024 ? template1885 : template1523)
            template._id = getRequestUrl(taxYear)
            template.response.metadata.calculationId = getCalcId(nino, taxYear)
            const apiPrefix = (taxYear >= 2024) ? "IF_API1885" : "DES_API1523"
            writeJson(`${dataPath}/${apiPrefix}_Get_Calculation_Data/${nino}_${taxYear}.json`, template)
        })
    }
}
