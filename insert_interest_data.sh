#!/usr/bin/env bash

#-----Interest GET Stub Data-----

curl -X POST -H "Content-Type: application/json" \
    -d '{
    "uri": "/income-tax/income-sources/nino/AA000003A?incomeSourceType=interest-from-uk-banks&taxYear=2022",
    "method": "GET",
    "status": 200,
    "response": [
        {
            "incomeSourceId": "first",
            "incomeSourceName": "Halifax",
            "identifier": "AA000003A",
            "incomeSourceType": "interest-from-uk-banks"
        },
        {
            "incomeSourceId": "second",
            "incomeSourceName": "Nationwide",
            "identifier": "AA000003A",
            "incomeSourceType": "interest-from-uk-banks"
        },
        {
            "incomeSourceId": "third",
            "incomeSourceName": "Monzo",
            "identifier": "AA000003A",
            "incomeSourceType": "interest-from-uk-banks"
        },
        {
            "incomeSourceId": "fourth",
            "incomeSourceName": "TSB Account",
            "identifier": "AA000003A",
            "incomeSourceType": "interest-from-uk-banks"
        }
    ]
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
    "uri": "/income-tax/nino/AA000003A/income-sources/savings/annual/2022?incomeSourceId=first",
    "method": "GET",
    "status": 200,
    "response":{
        "savingsInterestAnnualIncome": [
            {
                "incomeSourceId": "first",
                "untaxedUkInterest": 4000
            }
        ]
    }
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
    "uri": "/income-tax/nino/AA000003A/income-sources/savings/annual/2022?incomeSourceId=second",
    "method": "GET",
    "status": 200,
    "response":{
        "savingsInterestAnnualIncome": [
            {
                "incomeSourceId": "second",
                "untaxedUkInterest": 4000
            }
        ]
    }
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
    "uri": "/income-tax/nino/AA000003A/income-sources/savings/annual/2022?incomeSourceId=third",
    "method": "GET",
    "status": 200,
    "response":{
        "savingsInterestAnnualIncome": [
            {
                "incomeSourceId": "third",
                "taxedUkInterest": 4000
            }
        ]
    }
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
    "uri": "/income-tax/nino/AA000003A/income-sources/savings/annual/2022?incomeSourceId=fourth",
    "method": "GET",
    "status": 200,
    "response":{
        "savingsInterestAnnualIncome": [
            {
                "incomeSourceId": "fourth",
                "taxedUkInterest": 4000
            }
        ]
    }
}' \
http://localhost:9303/setup/data

#-----Interest POST Stub Data-----

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000003A/income-source/savings/annual/2022",
	"method":"POST",
	"status":200,
	"response": {
	    "transactionReference": "0123456789123459"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/income-sources/nino/AA000003A",
	"method":"POST",
	"status":200,
	"response": {
	    "incomeSourceId": "first"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA123457A/income-source/savings/annual/2022",
	"method":"POST",
	"status":200,
	"response": {
	    "transactionReference": "0123456789123321"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/income-sources/nino/AA123457A",
	"method":"POST",
	"status":200,
	"response": {
	    "incomeSourceId": "Tesco Bank"
	}
}' \
http://localhost:9303/setup/data