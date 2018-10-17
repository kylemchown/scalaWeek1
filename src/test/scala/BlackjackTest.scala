
class BlackjackTest extends BaseTest{
    "Entering two numbers between 0 and 21" should "return the larger number" in {
      assertResult(15) {BlackJack.Blackjack(10,15)}
      assertResult(20) {BlackJack.Blackjack(20,15)}

    }

  "Entering one number between 0 and 21" should "return that number" in {
    BlackJack.Blackjack(25,15) should equal (15)
    BlackJack.Blackjack(13,-6) should equal (13)
  }

//  "Entering no numbers between 0 and 21" should "return 0" in {
//    BlackJack.Blackjack(25,-3) should equal (0)
//  }





}
