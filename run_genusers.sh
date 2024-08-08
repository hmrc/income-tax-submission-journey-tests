#!/bin/bash

userFile="src/test/resources/users.txt"

htmlheader="<!DOCTYPE NETSCAPE-Bookmark-file-1>
<!-- This is an automatically generated file. It will be read and overwritten. DO NOT EDIT! -->
<META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=UTF-8\">
<TITLE>Bookmarks</TITLE>
<H1>Bookmarks Menu</H1>
<DL>
    <DL> <DT>
            <H3>local</H3>
        </DT>"

 echo "$htmlheader"

get_individuals () {
	host=$1
	output_separator2 "Individuals"
	cat $userFile | while read line 
	do
	   # do something with $line here
	   if [ ! -z line ]
	   then
		   nino=$(echo $line | cut -d ":" -f 1)
		   mtdid=$(echo $line | cut -d ":" -f 2)
		   utr=$(echo $line | cut -d ":" -f 3)
		   env=$(echo $line | cut -d ":" -f 4)
		   label=$(echo $line | cut -d ":" -f 5)

		   # echo $nino:$mtdid:$utr
		   output_individual "$host"

		fi

	done
}

get_agents () {
	host=$1
	output_separator "Agents"
	cat $userFile | while read line 
	do
	   # do something with $line here
	   if [ ! -z line ]
	   then
		   nino=$(echo $line | cut -d ":" -f 1)
		   mtdid=$(echo $line | cut -d ":" -f 2)
		   utr=$(echo $line | cut -d ":" -f 3)
		   env=$(echo $line | cut -d ":" -f 4)
		   label=$(echo $line | cut -d ":" -f 5)

		   # echo $nino:$mtdid:$utr
		   # add agents

		   output_agent "$host"

		fi

	done
}

output_individual () {
	host=$1
	js="                <DT><A HREF=\"javascript:(function(){function%20AuthStubInd0(){ document.getElementById('redirectionUrl').value ='$host/report-quarterly/income-and-expenses/view?origin=BTA'; \
	document.getElementById('confidenceLevel').getElementsByTagName('option')[2].selected='selected';\
	document.getElementById('nino').value='$nino';\
	document.getElementById('enrolment[0].name').value='HMRC-MTD-IT';\
	document.getElementById('input-0-0-name').value='MTDITID';\
	document.getElementById('input-0-0-value').value='$mtdid';\
	document.getElementById('add-preset').click();\
	document.getElementById('input-4-0-value').value='$utr';\
	document.getElementById('submit').click()}AuthStubInd0();})();\" ADD_DATE="1631868044000">$nino $label</a></DT>"

	echo "$js"
}

output_agent () {
	host=$1
	agent="                <DT><A HREF=\"javascript:(function(){function%20AuthStubAgent8(){\
	let nino = '$nino';\
	let mtdid = '$mtdid';\
	let utr = '$utr';\
	document.getElementById('redirectionUrl').value = '$host/report-quarterly/income-and-expenses/view/test-only/stub-client/nino/' + nino + '/utr/' + utr;\
	document.getElementById('confidenceLevel').getElementsByTagName('option')[2].selected='selected';\
	document.getElementById('affinityGroupSelect').getElementsByTagName('option')[2].selected = 'selected';\
	document.getElementById('affinityGroupSelect').dispatchEvent(new Event('change'));\
	document.getElementById('enrolment[0].name').value = 'HMRC-AS-AGENT';\
	document.getElementById('input-0-0-name').value = 'AgentReferenceNumber';\
	document.getElementById('input-0-0-value').value = '1';\
	document.getElementById('js-add-delegated-enrolment').click();\
	document.getElementById('delegatedEnrolment[0].key').value = 'HMRC-MTD-IT';\
	document.getElementById('input-delegated-0-0-name').value = 'MTDITID';\
	document.getElementById('input-delegated-0-0-value').value = mtdid;\
	document.getElementById('delegatedEnrolment[0].delegatedAuthRule').value = 'mtd-it-auth';\
	document.getElementById('submit').click();\
	}AuthStubAgent8();})();\" ADD_DATE="1631868044000">$nino Agent $label</a></DT>"
	echo "$agent"
}

output_separator () {
	h3=$1
	echo "            </DL> <DT>
                <H3>$h3</H3>
            </DT>
            <DL>"
}

output_separator2 () {
		h3=$1
	echo "            <DL> <DT>
                <H3>$h3</H3>
            </DT>
            <DL>"
}


# individuals
get_individuals "http://localhost:9081"

# agents
get_agents "http://localhost:9081"


endLocal="
            </DL>
        </DL>"

echo "$endLocal"


#### STAGING

output_separator2 "Staging"

# individuals
get_individuals

# agents
get_agents


endStaging="
            </DL>
        </DL>
    </DL>"

echo "$endStaging"

