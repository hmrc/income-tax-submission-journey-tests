package uk.gov.hmrc.test.ui.specs

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.{BeforeAndAfterEach, GivenWhenThen}
import uk.gov.hmrc.selenium.webdriver.{Browser, ScreenshotOnFailure}

trait BaseSpec
  extends AnyFeatureSpec
    with GivenWhenThen
    with Matchers
    with BeforeAndAfterEach
    with Browser
    with ScreenshotOnFailure {

  override def beforeEach(): Unit =
    startBrowser()

  override def afterEach(): Unit =
    quitBrowser()

}