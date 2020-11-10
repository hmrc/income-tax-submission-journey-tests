curl -X POST -H "Content-Type: application/json" \
    -d '{
	"_id": "/income-tax/nino/1234567891/income-source/dividends/annual/2020",
	"method":"GET",
	"status":200,
	"response": {
    "ukDividends": 55844806400.99,
  	"otherUkDividends": 60267421355.99
	}
}' \
http://localhost:9303/setup/data