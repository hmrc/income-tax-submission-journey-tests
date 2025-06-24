# income-tax-submission-journey-tests
UI test suite for the `<Income Tax Submission Services>` using UITestRunner and `<Cucumber>`.

## Running the tests
Prior to executing the tests ensure you have:
 - Installed [MongoDB](https://docs.mongodb.com/manual/installation/)
 - Installed/configured [service manager](https://github.com/hmrc/sm2)

This can be found in the [developer handbook](https://docs.tax.service.gov.uk/mdtp-handbook/documentation/developer-set-up/)

### Before running the app
Run the following command to start services locally:

    sudo mongod (If not already running)
    sm2 --start INCOME_TAX_SUBMISSION_ALL

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
./run_tests.sh <environment> <browser>

#### Running the tests against a test environment

To run the tests against an environment set the corresponding `host` environment property as specified under
 `<env>.host.services` in the [application.conf](/src/test/resources/application.conf). 

For example, to execute the `run_tests.sh` script against QA  environment using Chrome remote-webdriver

    ./run_tests.sh qa chrome

### Tailor your return journey
If you wish to test the tailoring steps only, there is another label called 'tailorReturnFlows'. Please note that the service manager profile INCOME_TAX_TAILOR_RETURNS_ALL should be used for running these tests otherwise certain scenarios will fail.
Run these tests with the following arguments

* Argument `<environment>` must be `local`, `qa` or `staging`.
* Argument `<browser>` must be `chrome`, `edge` or `firefox`.
* Argument `<PrivateBeta>` must be `true` or `false`.

```bash
./run_tailoring_tests.sh <environment> <browser> <PrivateBeta>
```

#### Taking screenshots of a journey

1. Add the `@screenshots` tag to all features or scenarios you want to take screenshots of
2. Execute `run_tests_screenshots.sh` to take screenshots of a journey.
3. Screenshots will be saved as `target/screenshots/{scenario}/{timestamp} - {page title}.png`. The timestamp ensures that the images are not overwritten.

If you need to capture screenshots for a Welsh translation, it is advisable to create a specific feature which triggers 
all error messages throughout the journey, so the Welsh Language Unit can QA all content.

> Note: Old screenshots will be deleted at the start of each run, so ensure you have taken copies before running the tests again.

## Running Test Integrated with V&C services 
Run the following V&C services:

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
InYear = Current tax year i.e 25-26
EOY = previous tax year i.e 24-25

### Further documentation
 N/A

## Licence
N/A