#!/bin/bash -e

WAIT_IN_SECONDS=30

EXPECTED_SERVICES=($(sm --showcmdfor INCOME_TAX_SUBMISSION_ALL | grep -v 'The parameters you provided\|\/bin\/'))

echo "About to start all the services in the INCOME_TAX_SUBMISSION_ALL profile. This might take a minute or so ..."
sm --start INCOME_TAX_SUBMISSION_ALL -r --wait 1200 --noprogress

echo "Waiting for ${WAIT_IN_SECONDS} seconds before checking all services ..."
sleep $WAIT_IN_SECONDS

STATUS_OUTPUT=$(sm -s)
echo $STATUS_OUTPUT

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

