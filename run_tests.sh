#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-firefox}
# default to firefox as chrome's autofill hides bugs to do with incorrectly empty fields, see eg: SASS-4898 and SASS-4966
DRIVER=

if [ "$BROWSER" = "chrome" ]; then
    DRIVER="-Dwebdriver.chrome.driver=/usr/local/bin/chromedriver"
elif [ "$BROWSER" = "firefox" ]; then
    DRIVER="-Dwebdriver.gecko.driver=/usr/local/bin/geckodriver"
fi

if [ "$SERVICE" = "income-tax-tailor-return-frontend" ]; then
  RUNNER="testOnly uk.gov.hmrc.test.ui.cucumber.runner.TailoringRunner"
else
  RUNNER="testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner"
fi

sbt -Dbrowser=$BROWSER -Denvironment=$ENV $DRIVER $RUNNER
