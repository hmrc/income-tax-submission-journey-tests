#!/bin/bash

# Default values for parameters
ENV=${1:-local}
BROWSER=${2:-chrome}

# Default value should be pipeline
MACHINE=${3:-pipeline}

# Database configuration
DB_NAME="income-tax-self-employment"
FRONT_END_DB_NAME="income-tax-self-employment-frontend"
STATE_COLLECTION="journey-state"
ANSWERS_COLLECTION="journey-answers"
MONGODB_CONTAINER="mongodb"
USER_ANSWERS_COLLECTION="user-answers"

# Function to drop a MongoDB collection
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

# Dropping collections based on machine type
if [ "$MACHINE" = "pipeline" ]; then
    mongo $FRONT_END_DB_NAME --eval "db['$USER_ANSWERS_COLLECTION'].drop()"
    mongo $DB_NAME --eval "db['$ANSWERS_COLLECTION'].drop()"
    mongo $DB_NAME --eval "db['$STATE_COLLECTION'].drop()"
elif [ "$MACHINE" != "pipeline" ]; then
    drop_collection $DB_NAME $STATE_COLLECTION $MONGODB_CONTAINER
    drop_collection $DB_NAME $ANSWERS_COLLECTION $MONGODB_CONTAINER
fi

# Setting up the driver based on browser selection
case $BROWSER in
    chrome)
        DRIVER="-Dwebdriver.chrome.driver=/usr/local/bin/chromedriver"
        ;;
    firefox)
        DRIVER="-Dwebdriver.gecko.driver=/usr/local/bin/geckodriver"
        ;;
    *)
        echo "Unsupported browser: $BROWSER"
        exit 1
        ;;
esac

# Running tests
sbt -Dbrowser=$BROWSER -Denvironment=$ENV $DRIVER "testOnly uk.gov.hmrc.test.ui.cucumber.runner.SelfEmploymentRunner"
