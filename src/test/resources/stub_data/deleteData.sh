#!/usr/bin/env bash

ENVIRONMENT=${1}

case ${1} in
[dD][eE][vV])
  host="https://www.development.tax.service.gov.uk/report-quarterly/income-and-expenses/view/test-only"
  ;;
[qQ][aA])
  host="https://www.qa.tax.service.gov.uk/report-quarterly/income-and-expenses/view/test-only"
  ;;
[sS][tT][aA][gG][iI][nN][gG])
  host="https://www.staging.tax.service.gov.uk/report-quarterly/income-and-expenses/view/test-only"
  ;;
[lL][oO][cC][aA][lL])
  host="http://localhost:9081/report-quarterly/income-and-expenses/view/test-only"
  ;;
esac

# Delete existing data
echo "Deleting any existing data from the stub via income-tax-view-change-frontend..."
curl -f -s -S -X "DELETE" ${host}/all-schemas/proxy
curl -f -s -S -X "DELETE" ${host}/all-data/proxy
curl -f -s -S -X "DELETE" ${host}/delete-all-users/proxy
echo "An attempt to delete the stub schemas and data via income-tax-view-change-frontend has been made."


## TODO: On actual implementation, decide whether to include data setup at the end here in staging environment
## TODO: since there isn't much reason to want the staging database to be empty