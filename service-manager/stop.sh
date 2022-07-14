#!/bin/bash -e

echo "About to stop all the services in the INCOME_TAX_SUBMISSION_ALL profile ..."

sm -s
sm --stop INCOME_TAX_SUBMISSION_ALL
sm -s

echo "... done."

