package uk.gov.hmrc.test.ui.pages

import org.scalatest.wordspec.AnyWordSpecLike

class CommonElementsSpec extends AnyWordSpecLike {

  "elements" should {
    "not have duplicates" in {
      val common = new CommonElements {}
      val mapping = common.commonMapping
      val groupedByKey = mapping.groupBy(_._1)
      val duplicatedKeys = groupedByKey.filter { case (_, values) => values.size > 1 }.keys.toList

      // TODO There are many duplications already, I exclude it for now, but if they are coming from your repo please fix it
      val excludedAlreadyWrongLinks = List(
        "Balancing charge",
        "Check Your Answers",
        "Yes",
        "amount in pounds",
        "No UK insurance gains",
        "Zero-emission goods vehicle allowance",
        "Zero-emission car allowance",
        "yes, but permanent home is abroad",
        "amount",
        "No"
      )

      val actualToCheck = duplicatedKeys.filterNot(k => excludedAlreadyWrongLinks.contains(k))
      assert(actualToCheck.isEmpty)
    }
  }

}
