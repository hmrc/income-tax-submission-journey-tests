#!/usr/bin/env bash

#-----Dividends GET Stub Data-----

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000001A/income-source/dividends/annual/2022",
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
	"uri": "/income-tax/nino/AA000002A/income-source/dividends/annual/2022",
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
	"uri": "/income-tax/nino/AA000003A/income-source/dividends/annual/2022",
	"method":"GET",
	"status":200,
	"response": {
        "ukDividends": 46985.99,
        "otherUkDividends": 15071993.01
	}
}' \
http://localhost:9303/setup/data

#-----Dividends POST Stub Data-----

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000001A/income-source/dividends/annual/2022",
	"method":"POST",
	"status":200,
	"response": {
        "transactionReference": "0123456789123456"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000002A/income-source/dividends/annual/2022",
	"method":"POST",
	"status":200,
	"response": {
        "transactionReference": "0123456789123457"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/AA000003A/income-source/dividends/annual/2022",
	"method":"POST",
	"status":200,
	"response": {
	    "transactionReference": "0123456789123458"
	}
}' \
http://localhost:9303/setup/data
