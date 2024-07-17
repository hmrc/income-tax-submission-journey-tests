/*
 * Copyright 2023 HM Revenue & Customs
 *
 */

const { addCredits1553, addObligations1330, addBusinessDetails1171IF, addCalcData } = require("./node/addDataUtils")
const { randNumberGen, userExists,  checkArgs,
           uploadUserData, getMTDITID } = require("./node/utils")
const { appendToFile } = require("./node/fileUtils")

// slice off user args
const args = process.argv.slice(2);
checkArgs(args)

const dataPath = "src/test/resources/stub_data/DATA"
const templatePath = "src/test/resources/stub_data_template/DATA"

// step 1 add user to file
const nino = args[0]
const description = args[1]
const userAlreadyExists = userExists(nino)
const mtdItId = userAlreadyExists ? getMTDITID(nino) : "XTIT" + randNumberGen(11)
const firstTaxYear = 2017

if (userExists(nino)) {
    console.warn("WARNING: user already exists, data will be overwritten..")
} else {
    const utr = randNumberGen(10)
    const userLine = `${nino}:${mtdItId}:${utr}::${description}\n`
    console.log("creating user: " + userLine)
    appendToFile("src/test/resources/users.txt", userLine)
}

// step 2
addObligations1330(nino)

// step 3: Generate business details for mtdItId and nino calls: set year of migration to 2010
addBusinessDetails1171IF(nino, mtdItId)

// add credits
addCredits1553(nino)

// add calc data 1885
addCalcData(nino, firstTaxYear)

// upload data
uploadUserData(nino)