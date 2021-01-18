#!/usr/bin/env bash
curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000001A/income-source/dividends/annual/2020",
	"method":"GET",
	"status":200,
	"response": {
    "ukDividends": 55844806400.99,
  	"otherUkDividends": 60267421355.99
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000002A/income-source/dividends/annual/2020",
	"method":"GET",
	"status":200,
	"response": {
    "ukDividends": 750.50,
  	"otherUkDividends": 225.25
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000003A/income-source/dividends/annual/2020",
	"method":"GET",
	"status":200,
	"response": {
    "ukDividends": 46985.99,
  	"otherUkDividends": 15071993.01
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000001A/income-source/dividends/annual/2020",
	"method":"POST",
	"status":200,
	"response": {
		  "string": "ok"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000002A/income-source/dividends/annual/2020",
	"method":"POST",
	"status":200,
	"response": {
		  "string": "ok"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000003A/income-source/dividends/annual/2020",
	"method":"POST",
	"status":200,
	"response": {
		  "string": "ok"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
    "uri": "/income-tax/income-sources/nino/AA000003A?incomeSourceType=interest-from-uk-banks&taxYear=2020",
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
    "uri": "/income-tax/income-sources/nino/AA000003A?incomeSourceType=savings&taxYear=2020&incomeSourceId=first",
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
    "uri": "/income-tax/income-sources/nino/AA000003A?incomeSourceType=savings&taxYear=2020&incomeSourceId=second",
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
    "uri": "/income-tax/income-sources/nino/AA000003A?incomeSourceType=savings&taxYear=2020&incomeSourceId=third",
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
    "uri": "/income-tax/income-sources/nino/AA000003A?incomeSourceType=savings&taxYear=2020&incomeSourceId=fourth",
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