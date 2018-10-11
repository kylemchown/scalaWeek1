object firstScalaObject {

  def main(args: Array[String]): Unit = {
    rps(false)
  }

  def rps(player: Boolean) = {
    var playerPrev = "C"
    var playerPoints = 0
    var aiPoints = 0
    val a = scala.util.Random
    val aiStrat = a.nextInt(5)
    var playerBetray = false

    val ai1Strat = a.nextInt(5)
    val ai2Strat = a.nextInt(5)
    var ai1Betray = false
    var ai2Betray = false
    var ai1Prev = "C"
    var ai2Prev = "C"
    var ai1Points = 0
    var ai2Points = 0

    if (player) {
      for (i <- 1 to 5) {
        val playerChoice = scala.io.StdIn.readLine("Enter your action a as string")
        val aiChoice = aiChoosePlayer(playerPrev, aiStrat, playerBetray)


        (playerChoice, aiChoice) match {
          case ("C", "C") => println("AI cooperates"); playerPoints += 3; aiPoints += 3; playerPrev = "C"; println("You both cooperated")
          case ("C", "B") => println("AI betrays"); playerPoints += 1; aiPoints += 5;playerPrev = "C";  println("You were betrayed")
          case ("B", "C") => println("AI cooperates"); playerPoints += 5; aiPoints += 1;playerPrev = "B";playerBetray = true; println("You betrayed the AI")
          case ("B", "B") => println("AI betrays"); playerPoints += 2; aiPoints += 2;playerPrev = "B";playerBetray = true; println("You both betray")
          case _ => println("You're input was invalid, so you wasted a game, good job")
        }

      }
      println("You got " + playerPoints + " points!")
      println("The AI got " + aiPoints + " points!")
    }
    else {
      for (i <- 1 to 100) {
        val aiChoice1 = aiChooseAI(ai2Prev, ai1Strat, ai2Betray)
        val aiChoice2 = aiChooseAI(ai1Prev, ai2Strat, ai1Betray)

        (aiChoice1, aiChoice2) match {
          case ("C", "C") => println("AI 1 Cooperates"); println("AI 2 Cooperates"); ai1Points += 3; ai2Points += 3; ai1Prev = "C"; ai2Prev = "C"; println("You both cooperated")
          case ("C", "B") => println("AI 1 Cooperates"); println("AI 2 Betrays"); ai1Points += 1; ai2Points += 5;ai1Prev = "C"; ai2Prev = "B"; ai2Betray = true;  println("You were betrayed")
          case ("B", "C") => println("AI 1 Betrays"); println("AI 2 Cooperates"); ai1Points += 5; ai2Points += 1;ai1Prev = "B"; ai2Prev = "C"; ai1Betray = true; println("You betrayed the AI")
          case ("B", "B") => println("AI 1 Betrays"); println("AI 2 Betrays"); ai1Points += 2; ai2Points += 2;ai1Prev = "B"; ai2Prev = "B"; ai1Betray = true; ai2Betray = true; println("You both betray")
          case _ => println("You're input was invalid, so you wasted a game, good job")
        }

      }
      println("AI 1 got " + ai1Points + " points!")
      println("AI 2 got " + ai2Points + " points!")
    }


  }


  def aiChoosePlayer(playerPrev: String, aiStrat: Int, playerBetray: Boolean): String = {

    aiStrat match {
      case 0 => "B"
      case 1 => "C"
      case 2 => playerPrev
      case 3 if playerBetray == true => "B"
      case 3 => "C"
      case 4 if scala.util.Random.nextInt(2) == 0 => "C"
      case 4 => "B"
    }
  }

  def aiChooseAI(oppPrev: String, strat:Int, oppBetray: Boolean)={
    strat match{
      case 0 => "B"
      case 1 => "C"
      case 2 => oppPrev
      case 3 if oppBetray == true => "B"
      case 3 => "C"
      case 4 if scala.util.Random.nextInt(2) == 0 => "C"
      case 4 => "B"
    }
  }
}