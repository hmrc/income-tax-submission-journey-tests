#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}
PRIVATEBETA=${3:-false}

if [ "$PRIVATEBETA" = "true" ]; then
    sbt clean -Dbrowser="${BROWSER}" -Denvironment="${ENV}" -Dbrowser.option.headless=false "testOnly uk.gov.hmrc.test.ui.cucumber.runner.TailoringBetaRunner" testReport
elif [ "$PRIVATEBETA" = "false" ]; then
    sbt clean -Dbrowser="${BROWSER}" -Denvironment="${ENV}" -Dbrowser.option.headless=false "testOnly uk.gov.hmrc.test.ui.cucumber.runner.TailoringRunner" testReport
fi