#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}

sbt clean -Dbrowser="${BROWSER}" -Denvironment="${ENV}" -Dbrowser.option.headless=true -Dbrowser.bidi=false -Dbrowser.usePreviousVersion=true -Dsecurity.assessment=false "testOnly uk.gov.hmrc.test.ui.specs* -- -n uk.gov.hmrc.test.ui.specs.tags.MVP" testReport

