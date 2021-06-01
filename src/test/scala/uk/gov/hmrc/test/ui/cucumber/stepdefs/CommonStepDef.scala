/*
 * Copyright 2021 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.CommonPage

class CommonStepDef extends BaseStepDef {

  val serviceName = "Update and submit an Income Tax Return"
  val govUkExtension = "GOV.UK"

  Then("""^the user should be redirected to the "(.*)" page$""") { (title: String) =>
    driver.getTitle should be(s"$title - $serviceName - $govUkExtension")
  }

  When("""^the user clicks on the (.*) link$""") { linkName: String =>
    CommonPage.clickOnLink(linkName)
  }

  When("""^the user selects the (.*) radio button$""") { radioButtonBoolean: String =>
    CommonPage.clickOnRadioButton(radioButtonBoolean)
  }

  When("""^the user clicks the (.*) button$""") { buttonTitle: String =>
    CommonPage.clickOnButton(buttonTitle)
  }

  When("""^the user selects the (.*) field and enters a value of (.*)$""") { (valueTextBox: String, value: String) =>
    CommonPage.enterValue(valueTextBox, value)
  }

  Then( """^the user should see the correct (.*) url$""") { ( url: String) =>
    val expectedUrl: (String, String) = url match {
      case "Accessibility Statement" => ("Accessibility statement", "/accessibility-statement/income-tax-submission")
      case "sign out" => ("Sign out", "/income-through-software/return/sign-out")
      case "personal income sign out" => ("Sign out", "/income-through-software/return/personal-income/sign-out")
      case "View estimation" => ("View estimation", "/income-through-software/return/2022/calculate")
      case "Authorise you as an agent" => ("authorise you as their agent (opens in new tab)", "https://www.gov.uk/guidance/client-authorisation-an-overview")
      case _ => fail("Invalid url input parameter")
    }
    driver.findElement(By.linkText(expectedUrl._1)).getAttribute("href") should include (expectedUrl._2)
  }

  Then("""^user navigates to the untaxed interest page$""") { () =>
    driver.navigate().to("http://localhost:9308/income-through-software/return/personal-income/2022/interest/untaxed-uk-interest")
  }

  Then("""^user navigates to the current page with tax year "(.*)"$""") { (taxYear: Int) =>
    val currentUrl = driver.getCurrentUrl
    val newUrl = currentUrl.replace("2022", s"$taxYear")
    driver.navigate().to(newUrl)
  }

  Then("""^I navigate to the home page$""") { () =>
    driver.navigate().to("https://www.instagram.com/")
  }

  Then("""^I click the accept all button""") { () =>
    driver.findElement(By.cssSelector("button.bIiDR")).click()
  }

  Then("""^I enter my username""") { () =>
    driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input")).clear()
    driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input")).sendKeys("joey-boi-2k9@hotmail.co.uk")
  }

  Then("""^I enter my password""") { () =>
    driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(2) > div > label > input")).clear()
    driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(2) > div > label > input")).sendKeys("Wrekin5!")
  }

  Then("""^I click the login button""") { () =>
    driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(3) > button > div")).click()
  }

  Then("""^I wait""") { () =>
    Thread.sleep(5000)
  }

  Then("""^I click the not now button""") { () =>
    driver.findElement(By.cssSelector("#react-root > section > main > div > div > div > div > button")).click()
  }

  Then("""^I click the second not now button""") { () =>
    driver.findElement(By.cssSelector("body > div.RnEpo.Yx5HN > div > div > div > div.mt3GC > button.aOOlW.HoLwm")).click()
  }

  Then("""^I navigate to the JMOORE page$""") { () =>
    driver.navigate().to("https://www.instagram.com/jmooregaming/")
  }

  Then("""^I save the first follower""") { () =>
    for (a <- 1 to 100){
      val f = {
        if (isDisplayedId(a)) {
          driver.findElement(By.cssSelector(s"div.PZuss > li:nth-child($a) > div > div:nth-child(2) > div > div> div> span > a")).getAttribute("title")
        }
      }
      println(f)
    }
  }

  def findById(number: Int) = driver.findElement(By.cssSelector(s"div.PZuss > li:nth-child($number) > div > div:nth-child(2) > div> div> div> span> a"))


  def isDisplayedId(number: Int, timeOutInSeconds: Int = 10): Boolean = {
    val endTime = System.currentTimeMillis + timeOutInSeconds * 1000
    while (System.currentTimeMillis < endTime) {
      try {
        if (findById(number).isDisplayed && findById(number).isEnabled) {
          return true
        }
      } catch {
        case _: Throwable => false
      }
      Thread.sleep(100)
    }
    false
  }

}
