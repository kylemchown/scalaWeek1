class TooHotTest extends BaseTest{
  "Entering a num between 60 and 90 and isSummer being false" should "return true" in {
    TooHot.tooHot(77, false) should equal (true)

  }

  "Entering a num not between 60 and 90 and isSummer being false" should "return false" in {
    TooHot.tooHot(99, false) should equal (false)
    TooHot.tooHot(59, false) should equal (false)
  }

  "Entering a num between 60 and 100 and isSummer being true" should "return true" in {
    TooHot.tooHot(99, true) should equal (true)
  }

  "Entering a num not between 60 and 100 and isSummer being true" should "return false" in {
    TooHot.tooHot(101, true) should equal (false)
    TooHot.tooHot(59, true) should equal (false)
  }





}