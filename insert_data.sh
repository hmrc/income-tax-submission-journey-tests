#!/usr/bin/env bash
curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/1234567891/income-source/dividends/annual/2020",
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
	"uri": "/income-tax/nino/1234567892/income-source/dividends/annual/2020",
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
	"uri": "/income-tax/nino/1234567893/income-source/dividends/annual/2020",
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
	"uri": "/income-tax/nino/1234567890/income-source/dividends/annual/2020",
	"method":"POST",
	"status":200,
	"response": {
	  "string": "ok"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/1234567891/income-source/dividends/annual/2020",
	"method":"POST",
	"status":200,
	"response": {
		  "string": "ok"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/1234567892/income-source/dividends/annual/2020",
	"method":"POST",
	"status":200,
	"response": {
		  "string": "ok"
	}
}' \
http://localhost:9303/setup/data

curl -X POST -H "Content-Type: application/json" \
    -d '{
	"uri": "/income-tax/nino/1234567893/income-source/dividends/annual/2020",
	"method":"POST",
	"status":200,
	"response": {
		  "string": "ok"
	}
}' \
http://localhost:9303/setup/data
