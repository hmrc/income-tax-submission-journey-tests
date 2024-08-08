/*
 * Copyright 2023 HM Revenue & Customs
 *
 */

const fs = require('fs');

const { getAllFiles, getTemplateJson, writeJson } = require("./fileUtils")
const { postJSON } = require("./requests")

const getUserDetails = (nino) => {
    const userStr = getUser(nino)
    const mtditid = userStr.split(":")[1]
    const utr = userStr.split(":")[2]
    const desc = userStr.split(":")[4]
    return `{"nino":"${nino}", "mtditid":"${mtditid}", "utr":"${utr}", "description":"${desc}"}`
}

const getUser = (nino) => {
    const userStr = fs.readFileSync("src/test/resources/users.txt", { encoding: 'utf8', flag: 'r' })
    const users = userStr.split("\n")
    const foundUser = users.find(userLine => userLine.split(":")[0] == nino)
    if (!foundUser) throw new Error("user not found!")
    return foundUser
}

module.exports = {
    getUserDetails,
    getMTDITID: (nino) => {
        const userStr = getUser(nino)
        const mtditid = userStr.split(":")[1]
        return mtditid
    },
    checkArgs: (args) => {
        const ninoRegex = /(?![DFIQUV])[A-Z]{1}(?![DFIQUVO])[A-Z]{1}\d{6}[A-D]{1}/
        const forbiddenNinoPrefixes = ["BG", "GB", "KN", "NK", "NT", "TN", "ZZ"]

        if (!args[0]) {
            console.log("nino must be provided")
            process.exit(1)
        }

        if (!args[1]) {
            console.log("description must be provided")
            process.exit(1)
        }

        if (!ninoRegex.test(args[0]) || forbiddenNinoPrefixes.includes(args[0].substring(0,2))) {
            console.log("nino must have the correct format")
            console.log("https://confluence.tools.tax.service.gov.uk/pages/viewpage.action?pageId=155461250")
            process.exit(1)
        }
    },
    userExists: (nino) => {
        const userStr = fs.readFileSync("src/test/resources/users.txt", { encoding: 'utf8', flag: 'r' })
        const users = userStr.split("\n")
        const userFound = users.find(userLine => userLine.split(":")[0] == nino)
        return userFound ? true : false
    },
    randNumberGen: (length) => {
        const characters = '0123456789';
        const randomDigits = Array.from({ length }, () => characters.charAt(Math.floor(Math.random() * characters.length)));
        return randomDigits.join('');
    },
    uploadUserData: (nino) => {
        // upload user info
        const url = '/report-quarterly/income-and-expenses/view/test-only/add-user/proxy'
        postJSON(url, getUserDetails(nino), "add-user")

        // upload request stub files
        const allFiles = getAllFiles("src/test/resources/stub_data/DATA/")
        const filesToUpload = allFiles.filter(f => f.includes(nino))
        console.log("files matched nino: " + filesToUpload.length)

        filesToUpload.forEach(file => {
            const fileContents = fs.readFileSync(file, { encoding: 'utf8', flag: 'r' })
            const url = '/report-quarterly/income-and-expenses/view/test-only/stub-data/proxy'
            postJSON(url, fileContents, file)
        })
    },
    uploadSchema: (schemaId) => {
        const allFiles = getAllFiles("src/test/resources/stub_data/SCHEMAS/")
        const schemasToUpload = allFiles.filter(f => {
            const fileContents = fs.readFileSync(f, { encoding: 'utf8', flag: 'r' })
            const json = JSON.parse(fileContents)
            return json._id == schemaId})
        console.log("files matched schema: " + schemasToUpload.length)

        schemasToUpload.forEach(file => {
            const fileContents = fs.readFileSync(file, { encoding: 'utf8', flag: 'r' })
            const url = '/report-quarterly/income-and-expenses/view/test-only/stub-schema/proxy'
            postJSON(url, fileContents, file)
        })
    }
};