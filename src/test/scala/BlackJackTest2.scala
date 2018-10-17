import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

class BlackJackTest2 extends FeatureSpec with GivenWhenThen with Matchers{
    feature("Blackjack Testing"){
      scenario("Two numbers in range"){
        Given("Two numbers")
        val a = 4
        val b = 6

        When("the numbers are both between 0 and 21")
        (a<22&&a>0) should be {true}


        Then("the function returns the higher number")
        BlackJack.Blackjack(4,6) should be (6)

      }
    }
}
