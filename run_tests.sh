#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}
DRIVER=

if [ "$BROWSER" = "chrome" ]; then
    DRIVER="-Dwebdriver.chrome.driver=/opt/homebrew/bin/chromedriver"
elif [ "$BROWSER" = "firefox" ]; then
    DRIVER="-Dwebdriver.gecko.driver=/usr/local/bin/geckodriver"
fi

sbt -Dbrowser=$BROWSER -Denvironment=$ENV $DRIVER "testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner"

