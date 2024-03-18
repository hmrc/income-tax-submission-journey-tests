#!/bin/bash

# Default values for parameters
ENV=${1:-local}
BROWSER=${2:-chrome}
MACHINE=${3:-pipeline} # Default value should be pipeline

sbt clean -Dbrowser="${BROWSER}" -Denvironment="${ENV}" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.PensionsRunner" testReport