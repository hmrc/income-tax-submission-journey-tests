#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}

sbt clean -Dbrowser="${BROWSER}" -Denvironment="${ENV}" -Dbrowser.option.headless=true -Dbrowser.usePreviousVersion=true "testOnly uk.gov.hmrc.test.ui.specs* -- -n uk.gov.hmrc.test.ui.specs.tags.classTags.MVP" testReport