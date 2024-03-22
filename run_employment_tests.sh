#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}

sbt clean -Dbrowser="${BROWSER}" -Denvironment="${ENV}" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.EmploymentRunner" testReport