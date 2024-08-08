#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}

echo
echo
echo "running stub data setup for V&C services"
echo "========================================================"

./run_setupStubData_local.sh


echo
echo
echo "running V&C tests"
echo "========================================================"
echo
sbt clean -Dbrowser="${BROWSER}" -Denvironment="${ENV}" -Dbrowser.option.headless=false "testOnly uk.gov.hmrc.test.ui.cucumber.runner.VCRunner" testReport