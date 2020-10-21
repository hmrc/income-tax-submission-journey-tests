package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By
import org.scalatest.matchers.should.Matchers

trait CommonElements extends BasePage with Matchers{

  def load(key: String): By =
    elements(key)

  val elements: Map[String, By] = Map(
    //Common Elements
    "yes"                  -> By.id("yes_no_yes"),
    "no"                   -> By.id("yes_no_no"),
    "save and continue"    -> By.cssSelector("#main-content > div > div > form > button.govuk-button.govuk-\!-margin-right-1"),
    "provide updates"      -> By.cssSelector("#main-content > div > div > main > div > a"),
    "continue"             -> By.id("continue"),

    //Dividends Elements
    "dividends"                 -> By.cssSelector("#main-content > div > div > main > div > ol > li:nth-child(1) > ol > li:nth-child(4) > span.app-task-list__task-name > a"),
    "UK dividends amount"       -> By.id("dividend-uk-amount") ,
    "UK other dividends amount" -> By.id("other-dividend-uk-amount")

    //Interest Elements

  )
}
