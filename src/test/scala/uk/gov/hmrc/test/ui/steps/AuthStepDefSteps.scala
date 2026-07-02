package uk.gov.hmrc.test.ui.steps

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.pages.AuthLoginPage._
import uk.gov.hmrc.test.ui.pages.CommonPage
import uk.gov.hmrc.test.ui.pages.CommonPage.replaceTaxYear

import java.time.Year

object AuthStepDefSteps {

  val currentYear = Year.now().getValue.toString

  // ^the user logs into the service with the following details$
  private def getValue(data: Seq[Map[String, String]], key: String): String =
    data.flatMap(_.get(key)).headOption.getOrElse("")
  def givenTheUserLogsIntoTheServiceWithTheFollowingDetails(): Unit = {
  }
  // ^the user logs into the service with the following details$
  def givenTheUserLogsIntoTheServiceWithTheFollowingDetails(data: Seq[Map[String, String]]): Unit = {
    val redirectUrl        = replaceTaxYear(getValue(data, "Redirect url"))
    val credentialStrength = getValue(data, "Credential Strength")
    val confidenceLevel    = getValue(data, "Confidence Level")
    val affinityGroup      = getValue(data, "Affinity Group")
    val niNumber           = getValue(data, "Nino")
    val enrolmentKeyOne    = getValue(data, "Enrolment Key 1")
    val identifierNameOne  = getValue(data, "Identifier Name 1")
    val identifierValueOne = getValue(data, "Identifier Value 1")
    val enrolmentKeyTwo    = getValue(data, "Enrolment Key 2")
    val identifierNameTwo  = getValue(data, "Identifier Name 2")
    val identifierValueTwo = getValue(data, "Identifier Value 2")

    getRedirectUrl.sendKeys(CommonPage.url + redirectUrl)
    selectCredentialStrength(credentialStrength)
    selectConfidenceLevel(confidenceLevel)
    selectAffinityGroup(affinityGroup)
    getNino.sendKeys(niNumber)
    getEnrolmentKeyOne.sendKeys(enrolmentKeyOne)
    getIdentifierNameOne.sendKeys(identifierNameOne)
    getIdentifierValueOne.sendKeys(identifierValueOne)
    getEnrolmentKeyTwo.sendKeys(enrolmentKeyTwo)
    getIdentifierNameTwo.sendKeys(identifierNameTwo)
    getIdentifierValueTwo.sendKeys(identifierValueTwo)
    if (affinityGroup.contains("Agent")) {
      Driver.instance.findElement(By.cssSelector("#js-add-delegated-enrolment")).click()
      getDelegatedEnrolmentKey.sendKeys(getValue(data, "Delegated Enrolment Key"))
      getDelegatedIdentifierName.sendKeys(getValue(data, "Delegated Identifier Name"))
      getDelegatedIdentifierValue.sendKeys(getValue(data, "Delegated Identifier Value"))
      getDelegatedAuthRule.sendKeys(getValue(data, "Delegated Auth Rule"))
    }
    Driver.instance.findElement(By.cssSelector("#submit")).click()
  }

}