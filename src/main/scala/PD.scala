object PD {

  def main(args: Array[String]): Unit = {
    rps(player = false, 1)
  }

  def rps(player: Boolean, noiseLevel: Int): Unit = {
    var playerPrev = "C"
    val points = Array(0,0)
    val aiStrat = scala.util.Random.nextInt(5)
    var playerBetray = false

    val ai1Strat = scala.util.Random.nextInt(5)
    println("AI 1 : Strategy " + ai1Strat)
    val ai2Strat = scala.util.Random.nextInt(5)
    println("AI 2 : Strategy " + ai2Strat)
    var ai1Betray = false
    var ai2Betray = false
    var ai1Prev = "C"
    var ai2Prev = "C"
    val aipoints = Array(0,0)

    if (player) {
      (1 to 5).foreach { i =>
        val playerChoice = scala.io.StdIn.readLine("Enter your action as a string").capitalize
        val aiChoice = aiChoosePlayer(playerPrev, aiStrat, playerBetray)


        (playerChoice, aiChoice) match {
          case ("C", "C") => println("AI cooperates")
            points(0) += 3
            points(1) += 3
            playerPrev = "C"
            println("You both cooperated")
          case ("C", "B") => println("AI betrays")
            points(0) += 1
            points(1) += 5
            playerPrev = "C"
            println("You were betrayed")
          case ("B", "C") => println("AI cooperates")
            points(0) += 5
            points(1) += 1
            playerPrev = "B"
            playerBetray = true
            println("You betrayed the AI")
          case ("B", "B") => println("AI betrays")
            points(0) += 2
            points(1) += 2
            playerPrev = "B"
            playerBetray = true
            println("You both betray")
          case _ => println("You're input was invalid, so you wasted a game, good job")
        }

      }
      println("You got " + points(0) + " points!")
      println("The AI got " + points(1) + " points!")
    }
    else {
      (1 to 100).foreach { i =>
        val aiChoice1 = aiChooseAI(ai2Prev, ai1Strat, ai2Betray, noiseLevel - 1)
        val aiChoice2 = aiChooseAI(ai1Prev, ai2Strat, ai1Betray, noiseLevel - 1)

        (aiChoice1, aiChoice2) match {
          case ("C", "C") => println("AI 1 Cooperates")
            println("AI 2 Cooperates")
            aipoints(0) += 4
            aipoints(1) += 4
            ai1Prev = "C"
            ai2Prev = "C"
            println("You both cooperated")
          case ("C", "B") => println("AI 1 Cooperates")
            println("AI 2 Betrays")
            aipoints(0) += 1
            aipoints(1) += 5
            ai1Prev = "C"
            ai2Prev = "B"
            ai2Betray = true
            println("You were betrayed")
          case ("B", "C") => println("AI 1 Betrays")
            println("AI 2 Cooperates")
            aipoints(0) += 5
            aipoints(1) += 1
            ai1Prev = "B"
            ai2Prev = "C"
            ai1Betray = true
            println("You betrayed the AI")
          case ("B", "B") => println("AI 1 Betrays")
            println("AI 2 Betrays")
            aipoints(0) += 2
            aipoints(1) += 2
            ai1Prev = "B"
            ai2Prev = "B"
            ai1Betray = true
            ai2Betray = true
            println("You both betray")
          case _ => println("You're input was invalid, so you wasted a game, good job")
        }

      }
      println("AI 1 got " + aipoints(0) + " points!")
      println("AI 2 got " + aipoints(1) + " points!")

    }


  }


  def aiChoosePlayer(playerPrev: String, aiStrat: Int, playerBetray: Boolean): String = {

    aiStrat match {
      case 0 => "B"
      case 1 => "C"
      case 2 => playerPrev
      case 3 if true => "B"
      case 3 => "C"
      case 4 if scala.util.Random.nextInt(2) == 0 => "C"
      case 4 => "B"
    }
  }

  def aiChooseAI(oppPrev: String, strat:Int, oppBetray: Boolean, noiseLevel: Int): String={
    val a = strat match{
      case 0 => "B"
      case 1 => "C"
      case 2 => oppPrev
      case 3 if true => "B"
      case 3 => "C"
      case 4 if scala.util.Random.nextInt(2) == 0 => "C"
      case 4 => "B"
    }
    val noise = scala.util.Random.nextInt(9)
    a match{
      case "C" if noise <= noiseLevel => "B"
      case "B" if noise <= noiseLevel => "C"
      case _ => a
    }
  }
}