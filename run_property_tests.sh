#!/bin/bash
# Default values for parameters
ENV=${1:-local}
BROWSER=${2:-chrome}
MACHINE=${3:-pipeline} # Default value should be pipeline

# Database configuration
DB_NAME="income-tax-property"
ANSWERS_COLLECTION="journey-answers"
MONGODB_CONTAINER="mongodb"



# Function to drop a MongoDB collection on your local machine
drop_collection() {
    local db_name=$1
    local collection_name=$2
    local container=$3
    local output=$(docker exec $container mongo --host localhost --port 27017 $db_name --eval "db['$collection_name'].drop()" 2>&1)

    if [[ $output == *"true"* ]]; then
        echo "Collection $collection_name in $db_name dropped successfully."
    else
        echo "Failed to drop collection $collection_name in $db_name. Error: $output"
    fi
}

# Dropping collections based on if test is ran on the pipeline remote machine or not
if [ "$MACHINE" = "pipeline" ]; then

    # Use curl to send the request to test API endpoint
    RESPONSE_BODY=$(curl -s -X POST "$URL" -H "$HEADER")
    RESPONSE_CODE=$?
    echo "Response from API: $RESPONSE_BODY"

    # Check the HTTP status code
    if [ "$RESPONSE_CODE" -eq 204 ]; then
        echo "Success"

    else
        echo "Error: HTTP status $RESPONSE_CODE"
        # this will retry up to 5 times with a 30 seconds delay, timeout for each request is 30 seconds
        curl --retry 5 --retry-delay 10 --max-time 30 -X POST "$URL" -H "$HEADER" -d "$DATA"
    fi

elif [ "$MACHINE" != "pipeline" ]; then
        drop_collection $DB_NAME $ANSWERS_COLLECTION $MONGODB_CONTAINER
    fi

sbt clean -Dbrowser="${BROWSER}" -Denvironment="${ENV}" -Dbrowser.option.headless=false "testOnly uk.gov.hmrc.test.ui.cucumber.runner.PropertyRunner" testReport
