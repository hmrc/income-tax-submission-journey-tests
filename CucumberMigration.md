# Cucumber to ScalaTest Migration Guide

## Background
This repository holds all journey tests for the ITSA Submissions service. Some pipelines only run a subsection of the tests, using a particular Cucumber runner. For example, the pensions pipeline uses the UITestJob that runs `run_pensions_tests.sh`.

As this is a large repository, we can migrate these tests incrementally — one pipeline/script at a time. For example, `run_employment_tests.sh` runs all tests tagged with `@employment and not @ignore`.

## Prerequisites
This migration uses *converter/injector* scripts already provided. Read the full guidance [here](https://confluence.tools.tax.service.gov.uk/pages/viewpage.action?pageId=1161101366&spaceKey=PT&title=Cucumber%2Bto%2BScalaTests%2Bmigration).

> **Note:** Because all features use shared pages and steps, *Step 2: Convert Step Definitions* and *Step 3: Convert Page Objects* do not need to be run again — they have already been converted.

## Example
`run_tests.sh` has already been migrated. See tests tagged with `@MVP` for reference.

## Instructions

1. **Select a run script/pipeline to migrate.**
   - E.g. find all feature files with `@employment`; these will be your target features.
2. **Run *Step 1: Convert Feature Files*** on all target features. Choose a temporary output location.
3. **Run *Step 4: Inject Step Definitions into Specs*.** Set the output to `src/test/scala/uk/gov/hmrc/test/ui/specs` or a subpackage.
4. **Review and correct the injected steps/methods**, and add tags (see [Tips](#tips) below).
5. **Verify the migrated specs are a 1-to-1 conversion.** Keep any comments to ensure no loss of in-progress work.
6. **Ensure all new tests run successfully:**
   - see `run_test.sh`
7. **Update the target job in build-jobs** to remove Cucumber items.

## Tips

### Steps that will need manual intervention

1. **Login step:** `When("the user logs into the service with the following details")`
   - Use `givenTheUserLogsIntoTheServiceWithTheFollowingDetails()`
   - Create reusable `UserLogin` instances within each spec, using the original feature file for data.

2. **Page redirects:** Eg. `Then("the user should be redirected to <page title> page")`
   - These will likely use the correct converted method but will be missing the string parameter (the page title).
   - Recommended: use Copilot inline suggestions in VS Code to fill these in (does not use credits). Or ask Copilot to write a script to do this.

### Tags
- ScalaTest tags are applied at the **scenario level**. To tag an entire feature/class (as in Cucumber feature files), use or create new tags under `specs/tags/classTags`.

## Cucumber Runners
| Runner                | Tags                          |
|-----------------------|-------------------------------|
| Employment Runner     | `"@employment and not @ignore"` |
| Pensions Runner       | `"@pensions and not @ignore"`    |
| Property Runner       | `"@property and not @ignore"`                             |
| SelfEmployment Runner | `"@SelfEmployment and not @ignore"`                             |
| TailoringBeta Runner  | `"@TYR_private_beta and not @ignore"`                             |
| Tailoring Runner      | `"@TYR and not @ignore and not @about_you_private_beta"`                             |
| VC Runner             | `"@V&C and not @ignore"`                             |
| Wip Runner            | `"@wip and not @ignore"`                             |

