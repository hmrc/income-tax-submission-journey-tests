#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}
DRIVER=

if [ "$BROWSER" = "chrome" ]; then
    DRIVER="-Dwebdriver.chrome.driver=/usr/local/bin/chromedriver"
elif [ "$BROWSER" = "firefox" ]; then
    DRIVER="-Dwebdriver.gecko.driver=/usr/local/bin/geckodriver"
fi

sh insert-data.sh
sbt -Dbrowser=$BROWSER -Denvironment=$ENV $DRIVER "testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner"
curl -X DELETE http://localhost:9303/setup/all-data
