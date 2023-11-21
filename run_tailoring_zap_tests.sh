#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}
PRIVATEBETA=${3:-false}
DRIVER=

if [ "$BROWSER" = "chrome" ]; then
    DRIVER="-Dwebdriver.chrome.driver=/usr/local/bin/chromedriver"
elif [ "$BROWSER" = "firefox" ]; then
    DRIVER="-Dwebdriver.gecko.driver=/usr/local/bin/geckodriver"
fi

if [ "$PRIVATEBETA" = "true" ]; then
    sbt -Dbrowser=$BROWSER -Denvironment=$ENV $DRIVER "testOnly uk.gov.hmrc.test.ui.cucumber.runner.TailoringBetaRunner"
elif [ "$PRIVATEBETA" = "false" ]; then
    sbt -Dbrowser=$BROWSER -Denvironment=$ENV $DRIVER "testOnly uk.gov.hmrc.test.ui.cucumber.runner.TailoringRunner"
fi
