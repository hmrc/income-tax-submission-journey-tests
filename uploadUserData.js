/*
 * Copyright 2023 HM Revenue & Customs
 *
 */

const fs = require('fs')
const path = require('path')
const http = require('http');
const { getAllFiles } = require("./node/fileutils")
const { uploadUserData } = require("./node/utils")
const { postJSON } = require("./node/requests")

const args = process.argv.slice(2);
if (!args[0]) {
    console.log("nino must be provided")
    process.exit(1)
}

const nino = args[0]

uploadUserData(nino)

