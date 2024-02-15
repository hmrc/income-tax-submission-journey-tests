#!/bin/bash

# Default values for parameters
ENV=${1:-local}
BROWSER=${2:-chrome}
MACHINE=${3:-pipeline} # Default value should be pipeline

# Setting up the driver based on browser selection
case $BROWSER in
    chrome)
        DRIVER="-Dwebdriver.chrome.driver=/usr/local/bin/chromedriver"
        ;;
    firefox)
        DRIVER="-Dwebdriver.gecko.driver=/usr/local/bin/geckodriver"
        ;;

esac

# Running tests
sbt -Dbrowser=$BROWSER -Denvironment=$ENV $DRIVER "testOnly uk.gov.hmrc.test.ui.cucumber.runner.PensionsRunner"
