#!/usr/bin/env bash

ENVIRONMENT=${1}
FAIL_FAST=${2:-true}

GREEN='\033[0;32m'
RED='\033[0;31m'
NC='\033[0m'


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

# All Users
echo
echo
echo "Loading Users from src/test/resources/stubData/users"
echo "========================================================"
echo

userFile="src/test/resources/users.txt"
	cat $userFile | while read line
	do
	   # do something with $line here
	   if [ ! -z line ]
	   then
		   nino=$(echo $line | cut -d ":" -f 1)
		   mtdid=$(echo $line | cut -d ":" -f 2)
		   utr=$(echo $line | cut -d ":" -f 3)
		   env=$(echo $line | cut -d ":" -f 4)
		   label=$(echo $line | cut -d ":" -f 5)

      # post to FE/Mongo. Data is stored in income-tax-view-change-frontend mongo database's user collection
       curl -f -s -S -o /dev/null -H "Content-Type:application/json" -d "{\"nino\":\"${nino}\", \"mtditid\":\"${mtdid}\", \"utr\":\"${utr}\", \"description\":\"${label}\"}" ${host}/add-user/proxy
       if [ $? -ne 0 ]; then
         echo -e "${RED}Failed to load user to user collection: ${nino}${NC}"
       else
         echo -e "${GREEN}Successfully loaded user to user collection: ${nino}${NC}"
       fi

		 fi

	done

# Upload Schema
echo
echo
echo "Loading Schemas from src/test/resources/stubData/schemas"
echo "========================================================"
echo

allSchemas=$(find src/test/resources/stub_data/SCHEMAS -type f -name '*.json')

for schema in ${allSchemas}; do
  curl -f -s -S -o /dev/null -H "Content-Type:application/json" -d @${schema} ${host}/stub-schema/proxy
  if [ $? -ne 0 ]; then
    echo -e "${RED}Failed to load schema: ${schema}${NC}"
    if [ "${FAIL_FAST}" = true ]; then
      echo -e "Stub data setup failed for ${schema}. Please check the schema and try again."
      exit 1
    fi
  else
    echo -e "${GREEN}Successfully Loaded ${schema}${NC}"
  fi
done

## Upload Data
echo
echo
echo "Loading Data from src/test/resources/stubData/data"
echo "=================================================="
echo

allData=$(find src/test/resources/stub_data/DATA/ -type f -name '*.json')

for data in ${allData}; do
  curl -f -s -S -o /dev/null -H "Content-Type:application/json" -d @${data} ${host}/stub-data/proxy
  if [ $? -ne 0 ]; then
    echo -e "${RED}Failed to load data: ${data}${NC}"
    if [ "${FAIL_FAST}" = true ]; then
      echo -e "Stub data setup failed for ${data}. Please check the stubbed response matches the schema requirements and try again."
      exit 1
    fi
  else
    echo -e "${GREEN}Successfully Loaded ${data}${NC}"
  fi
done
