#!/bin/bash -e

WAIT_AFTER_STOPPING_IN_SECONDS=10

echo "About to stop all the services in the INCOME_TAX_SUBMISSION_ALL profile ..."

sm -s
sm --stop INCOME_TAX_SUBMISSION_ALL

echo "Waiting for ${WAIT_AFTER_STOPPING_IN_SECONDS} seconds before checking the running services ..."
sleep $WAIT_AFTER_STOPPING_IN_SECONDS

sm -s

echo "... done."

