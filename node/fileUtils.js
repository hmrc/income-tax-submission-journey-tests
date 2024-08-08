/*
 * Copyright 2023 HM Revenue & Customs
 *
 */
const fs = require('fs');
const path = require('path')

const getAllFiles = (dirPath, arrayOfFiles = []) => {
   files = fs.readdirSync(dirPath)

   files.forEach(function(file) {
     if (fs.statSync(dirPath + "/" + file).isDirectory()) {
       arrayOfFiles = getAllFiles(dirPath + "/" + file, arrayOfFiles)
     } else {
       arrayOfFiles.push(path.join(__dirname + "/../", dirPath, "/", file))
     }
   })

   return arrayOfFiles
 }

module.exports = {
     appendToFile: (fileName, data) => {
         fs.writeFileSync(fileName, data, { encoding: 'utf8', flag: 'a' })
     },
     writeJson: (destFile, object) => {
         fs.writeFileSync(destFile, JSON.stringify(object, null, 2), { encoding: 'utf8', flag: 'w' })
         console.log("CREATED: " + destFile)
     },
     getTemplateJson: (templatePath) => {
         const templateJson = fs.readFileSync(templatePath, { encoding: 'utf8', flag: 'r' })
         const object = JSON.parse(templateJson)
         return object
     },
     getAllFiles
}

