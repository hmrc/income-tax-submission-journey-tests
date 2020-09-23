
#!/bin/bash

ZAP_PORT=11000

function isListening(){ echo "$(lsof -Pi :$1 -sTCP:LISTEN -t)"; }

function check(){
    if [ -z $(isListening $2) ]; then
        echo "> [ERROR] $1 (port $2) isn't running"; exit 1
    fi
}

# check if zap is not running
if [ -z $(isListening ${ZAP_PORT}) ]; then
    echo "> starting Zap"

    MACOS_ZAP="/Applications/OWASP ZAP.app/Contents/Java/zap.sh"
    LINUX_ZAP="/usr/bin/owasp-zap"
    if [ "$ZAP" == "" ]; then
        if [ -x "$MACOS_ZAP" ]; then
           ZAP="$MACOS_ZAP"
        elif [ -x "$LINUX_ZAP" ]; then
           ZAP="$LINUX_ZAP"
        fi
    fi
    if [ "$ZAP" == "" ]; then
        echo Could not find Zap >&2
        echo Tried $MACOS_ZAP >&2
        echo Also tried $LINUX_ZAP >&2
        echo If Zap is not installed please install it >&2
        echo If Zap is installed please teach the $0 script how to find it >&2
        exit 1
    fi

    "$ZAP" -daemon -port ${ZAP_PORT} -config api.disablekey=true &

    # wait for it to init
    while ! $(curl -sSf localhost:${ZAP_PORT} &> /dev/null)
    do
        echo "> Waiting for proxy to start..."
        sleep 2
    done
    sleep 2
fi