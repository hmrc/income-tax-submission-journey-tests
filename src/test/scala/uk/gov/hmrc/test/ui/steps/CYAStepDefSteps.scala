package uk.gov.hmrc.test.ui.steps

import uk.gov.hmrc.test.ui.pages.CommonPage

object CYAStepDefSteps {

  // ^the user clicks on the change link in position (.*)$
  def whenTheUserClicksOnTheChangeLinkInPositionX(): Unit = {
    position: String =>
        CommonPage.clickBySelector(s"#main-content > div > div > dl > div:nth-child($position) > dd.govuk-summary-list__actions > a")
  }

  // ^the user clicks on the change (.*) benefit link in position (.*)$
  def whenTheUserClicksOnTheChangeXBenefitLinkInPositionX(section: String, position: String): Unit = {
    val sectionMaps = Map(
          "car" -> 2,
          "accommodation" -> 3,
          "travel" -> 4,
          "utilities" -> 5,
          "medical" -> 6,
          "income" -> 7,
          "reimbursed" -> 8,
          "assets" -> 9
        )

        CommonPage.clickBySelector(s"#main-content > div > div > dl:nth-of-type(${sectionMaps(section)}) > div:nth-child($position) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a")
  }

  // ^the status on the page is "(.*)"$
  def thenTheStatusOnThePageIsX(status: String): Unit = {
    val selector = CommonPage.load(status)
        CommonPage.elementExists(selector)
  }

  // ^the "(.*)" on the page displays "(.*)"$
  def thenTheXOnThePageDisplaysX(tag: String, status: String): Unit = {
    val selector = CommonPage.load(tag)
        val result = CommonPage.containsText(selector, status)
        assert(result, s"The value for '$tag' does not display '$status'")
  }

}
