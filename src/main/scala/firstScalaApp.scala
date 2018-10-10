object firstScalaApp{
  def main(args: Array[String]): Unit = {
    rps(true)
  }

  def rps(player: Boolean) ={
    var playerWins = 0
    var aiWins = 0
    var playerRock = 0
    var playerPaper = 0
    var playerScissors = 0
    //var playerActions = scala.collection.mutable.ArrayBuffer.empty[Array[String]]

    var ai1Wins = 0
    var ai2Wins = 0
    if (player) {
      for (i <- 1 to 10) {
        val playerChoice = scala.io.StdIn.readLine("Enter your action a as string")
        val aiChoice = aiChoosePlayer(playerRock, playerPaper, playerScissors)


        (playerChoice, aiChoice) match {
          case ("Rock", "Scissors") => println("AI plays Scissors"); playerWins += 1; playerRock += 1; println("You win")
          case ("Scissors", "Paper") => println("AI plays Paper"); playerWins += 1; playerScissors += 1; println("You win")
          case ("Paper", "Rock") => println("AI plays Rock"); playerWins += 1; playerPaper += 1; println("You win")
          case ("Rock", "Rock") => println("AI plays Rock"); playerRock += 1; println("You draw")
          case ("Scissors", "Scissors") => println("AI plays Scissors"); playerScissors += 1; println("You draw")
          case ("Paper", "Paper") => println("AI plays Paper"); playerPaper += 1; println("You draw")
          case ("Rock", "Paper") => println("AI plays Paper"); aiWins += 1; playerRock += 1; println("You lose")
          case ("Scissors", "Rock") => println("AI plays Rock"); aiWins += 1; playerScissors += 1; println("You lose")
          case ("Paper", "Scissors") => println("AI plays Scissors"); aiWins += 1; playerPaper += 1; println("You lose")
          case _ => println("You're input was invalid, so you wasted a game, good job")
        }

      }
      println("You won " + playerWins + " time!")
    }
    else{
      for(i<- 1 to 15) {
        val aiChoice1 = aiChooseAI(playerRock, playerPaper, playerScissors)
        val aiChoice2 = aiChooseAI(playerRock, playerPaper, playerScissors)

        (aiChoice1, aiChoice2) match {
          case ("Rock", "Scissors") => println("AI 1 plays Rock"); println("AI 2 plays Scissors"); ai1Wins += 1;  println("AI 1 win")
          case ("Scissors", "Paper") => println("AI 1 plays Scissors"); println("AI 2 plays Paper"); ai1Wins += 1;  println("AI 1 win")
          case ("Paper", "Rock") => println("AI 1 plays Paper");println("AI 2 plays Rock"); ai1Wins += 1;  println("AI 1 win")
          case ("Rock", "Rock") => println("AI 1 plays Rock"); println("AI 2 plays Rock");  println("AI draw")
          case ("Scissors", "Scissors") => println("AI 1 plays Scissors"); println("AI 2 plays Scissors");  println("AI draw")
          case ("Paper", "Paper") => println("AI 1 plays Paper");println("AI 2 plays Paper");  println("AI draw")
          case ("Rock", "Paper") => println("AI 1 plays Rock"); println("AI 2 plays Paper"); ai2Wins += 1; println("AI 2 win")
          case ("Scissors", "Rock") => println("AI 1 plays Scissors"); println("AI 2 plays Rock"); ai2Wins += 1; println("AI 2 win")
          case ("Paper", "Scissors") => println("AI 1 plays Paper"); println("AI 2 plays Scissors"); ai2Wins += 1; println("AI 2 win")
        }

      }
      println("AI 1 won " + ai1Wins + " time!")
      println("AI 2 won " + ai2Wins + " time!")
    }


  }

  def aiChoosePlayer(rock: Int, paper: Int, scissors: Int): String ={
    val a = scala.util.Random
    val b = a.nextInt(9)
    b match{
      case 0 => "Rock"
      case 1 => "Paper"
      case 2 => "Scissors"
      case _ if rock>=paper && rock >= scissors => "Paper"
      case _ if paper>=rock && paper>= scissors => "Scissors"
      case _ => "Rock"
    }
  }

  def aiChooseAI(rock: Int, paper: Int, scissors: Int): String ={
    val a = scala.util.Random
    val b = a.nextInt(3)
    b match{
      case 0 => "Paper"
      case 1 => "Scissors"
      case 2 => "Rock"
    }
  }


}


