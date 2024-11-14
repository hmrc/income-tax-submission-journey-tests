#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}
DRIVER_PATH=/usr/local/bin/chromedriver

sbt -Dlogback.configurationFile=logback.xml -Dbrowser=$BROWSER -Denvironment=$ENV -Dscreenshots=false -Dbrowser.option.headless=false 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.WipRunner'