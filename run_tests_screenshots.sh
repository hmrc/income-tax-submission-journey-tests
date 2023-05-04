#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}
DRIVER=

if [ "$BROWSER" = "chrome" ]; then
    DRIVER="-Dwebdriver.chrome.driver=/usr/local/bin/chromedriver"
elif [ "$BROWSER" = "firefox" ]; then
    DRIVER="-Dwebdriver.gecko.driver=/usr/local/bin/geckodriver"
fi

sbt -Dbrowser=$BROWSER -Denvironment=$ENV -Dscreenshots=true $DRIVER "testOnly uk.gov.hmrc.test.ui.cucumber.runner.ScreenshotRunner"
