#!/bin/bash -e

EXPECTED_SERVICES=($(sm --showcmdfor INCOME_TAX_SUBMISSION_ALL | grep -v 'The parameters you provided\|\/bin\/'))
STATUS_OUTPUT=$(sm -s)
for SERVICE in "${EXPECTED_SERVICES[@]}";
do
  echo "$STATUS_OUTPUT" | grep -q "$SERVICE"
  if [ $? != 0 ]; then
    echo "$SERVICE doesn't seem to have started"
    exit 1
  else
     echo "$SERVICE seems to have been successfully started"
  fi
done

echo "INCOME_TAX_SUBMISSION_ALL passed status check"

