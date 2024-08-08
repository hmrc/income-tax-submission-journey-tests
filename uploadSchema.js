/*
 * Copyright 2023 HM Revenue & Customs
 *
 */

const fs = require('fs')
const path = require('path')
const http = require('http');
const { getAllFiles } = require("./node/fileutils")
const { uploadSchema } = require("./node/utils")
const { postJSON } = require("./node/requests")

const args = process.argv.slice(2);
if (!args[0]) {
    console.log("schemaId/name must be provided")
    process.exit(1)
}

const schemaId = args[0]

uploadSchema(schemaId)

