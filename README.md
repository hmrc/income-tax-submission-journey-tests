# App name 
income-tax-submission-journey-tests
UI test suite for the `<Income Tax Submission Service>` using WebDriver and `<Cucumber>`.

## Running the tests
Prior to executing the tests ensure you have:
 - Docker - to run a Chrome or Firefox browser inside a container
 - Installed [MongoDB](https://docs.mongodb.com/manual/installation/) 
 - Installed/configured [service manager](https://github.com/hmrc/service-manager).  

### Before running the app
Run the following command to start services locally:

    sudo mongod (If not already running)
    sm --start INCOME_TAX_SUBMISSION_ALL -r

Alternatively you can use [these scripts](./service-manager); for example:

``` 
./service-manager/start.sh
```

``` 
./service-manager/stop.sh
```

We recommend that you leave your computer alone (as much as possible) while running these; also to close any high memory applications like IntelliJ.

And for the service-under-test, you may want to increase the network call timeout, like so:

``` 
sbt -Dplay.akka.http.server.request-timeout=90s run
```

Finally, remember where the log files are:

``` 
tail -f /var/tmp/*_LOCAL/logs/stdout.txt
```

### Running the test suite
Then execute the `run_tests.sh` script:
./run_tests.sh <environment> <browser-driver>

## Running tests against a containerised browser - on a developer machine

The script `./run_browser_with_docker.sh` can be used to start a Chrome or Firefox container on a developer machine. 
The script requires `remote-chrome` or `remote-firefox` as an argument.

Read more about the script's functionality [here](run-browser-with-docker.sh).

To run against a containerised Chrome browser:

```bash
./run_tests.sh local remote-chrome
```

`./run-browser-with-docker.sh` is **NOT** required when running in a CI environment. 

#### Running the tests against a test environment

To run the tests against an environment set the corresponding `host` environment property as specified under
 `<env>.host.services` in the [application.conf](/src/test/resources/application.conf). 

For example, to execute the `run_tests.sh` script against QA  environment using Chrome remote-webdriver

    ./run_tests.sh qa chrome

## Running ZAP tests

We now run our zap tests to the following implementation - https://github.com/hmrc/dast-config-manager/blob/master/README.md#running-zap-locally

For ease of use, this setup has been wrapped in the `run_zap_tests.sh` shell script. Please ensure you have Docker set up to be able to run this.

#### Tagging tests for ZAP

It is not required to proxy every journey test via ZAP. The intention of proxying a test through ZAP is to expose all the
 relevant pages of an application to ZAP. So tagging a subset of the journey tests or creating a 
 single ZAP focused journey test is sufficient.

#### Configuring the browser to proxy via ZAP 

Setting the system property `zap.proxy=true` configures the browser specified in `browser` property to proxy via ZAP. 
This is achieved using [webdriver-factory](https://github.com/hmrc/webdriver-factory#proxying-trafic-via-zap).  

#### Executing a ZAP test

The shell script `run_zap_tests.sh` is available to execute ZAP tests. 

For example, to execute ZAP tests locally using a Chrome browser

```
./run_zap_test.sh local chrome
```

#### Taking screenshots of a journey

1. Add the `@screenshots` tag to all features or scenarios you want to take screenshots of
2. Execute `run_tests_screenshots.sh` to take screenshots of a journey.
3. Screenshots will be saved as `target/screenshots/{scenario}/{timestamp} - {page title}.png`. The timestamp ensures that the images are not overwritten.

If you need to capture screenshots for a Welsh translation, it is advisable to create a specific feature which triggers 
all error messages throughout the journey, so the Welsh Language Unit can QA all content.

> Note: Old screenshots will be deleted at the start of each run, so ensure you have taken copies before running the tests again.

### Running tests using BrowserStack
If you would like to run your tests via BrowserStack from your local development environment please refer to the [webdriver-factory](https://github.com/hmrc/webdriver-factory/blob/master/README.md/#user-content-running-tests-using-browser-stack) project.

## [Installing local driver binaries](#install-driver-binaries)

This project supports UI test execution using Firefox (Geckodriver) and Chrome (Chromedriver) browsers. 

See the `drivers/` directory for some helpful scripts to do the installation work for you.  They should work on both Mac and Linux by running the following command:

    ./installGeckodriver.sh <operating-system> <driver-version>
    or
    ./installChromedriver <operating-system> <driver-version>

- *<operating-system>* defaults to **linux64**, however it also supports **macos**
- *<driver-version>* defaults to **0.21.0** for Gecko/Firefox, and the latest release for Chrome.  You can, however, however pass any version available at the [Geckodriver](https://github.com/mozilla/geckodriver/tags) or [Chromedriver](http://chromedriver.storage.googleapis.com/) repositories.

**Note 1:** *You will need to ensure that you have a recent version of Chrome and/or Firefox installed for the later versions of the drivers to work reliably.*

**Note 2** *These scripts use sudo to set the right permissions on the drivers so you will likely be prompted to enter your password.*

## Running Test Integrated with V&C services 
**TO DO:** *Run the following V&C services.*

     sm2 --start MATCHING_STUB
     sm2 --start CITIZEN_DETAILS
     sm2 --start BTA_STUBS
     sm2 --start BT_ACCOUNT
     sm2 --start INCOME_TAX_VIEW_CHANGE_DYNAMIC_STUB
     sm2 --start INCOME_TAX_VIEW_CHANGE_FRONTEND
     sm2 --start INCOME_TAX_VIEW_CHANGE

### Dynamic Data Generation (new nodeJS method):
Install NodeJS using brew, if you don't have it already:

    brew install node
then

    node genuser.js AA123456A "description of user"

This would generate default data for the user AA123456A with required obligations, business data, payment history and calcs.

### Load/Reload stub data locally
    ./run_setupStubData_local.sh

### Load/Reload Staging Data
    ./run_setupStubData_staging.sh

### Running V&C Tests
    ./run_v_and_c_tests.sh

### Delete itvc-stub and income-tax-view-change-frontend Mongo databases locally
    ./run_deleteStubData_local.sh

### Delete itvc-stub and income-tax-view-change-frontend Mongo databases staging
    ./run_deleteStubData_staging.sh
## Nomenclature
InYear = Current tax year i.e 24-25
EOY = previous tax year i.e 23-24
### Further documentation
 N/A
## Licence
N/A