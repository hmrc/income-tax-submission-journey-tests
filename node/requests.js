/*
 * Copyright 2023 HM Revenue & Customs
 *
 */

const http = require('http');

 module.exports = {
     postJSON: (url, data, fileName) => {
         var postOptions = {
           host: 'localhost',
           port: '9081',
           path: url,
           method: 'POST',
           headers: {
               'Content-Type': 'application/json',
               'Content-Length': Buffer.byteLength(data)
           }
         };

         // Set up the request
         var req = http.request(postOptions, (res) => {
           res.setEncoding('utf8');
           if (res.statusCode == 200) {
               console.log("uploaded: " + fileName)
           } else {
                console.log("error:" + res.statusCode + " - " + fileName)
           }
         });
         req.write(data);
         req.end();
     }
 }