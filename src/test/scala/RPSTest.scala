import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

class RPSTest extends FeatureSpec with GivenWhenThen with Matchers {
    feature("AI choices against player"){
      scenario("Player has played Rock the most"){
        Given("Input variables with rock as the highest")
        val r = 10
        val p = 5
        val s = 2

        When("The random effect isn't triggered")
        val r1 = new scala.util.Random(4).nextInt(100)

        Then("The string \"Paper\" is returned")

        RPS.aiChoosePlayer(r,p,s) should be ("Paper")
      }
    }
}
