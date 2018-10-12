def rps(player: Boolean): Unit ={


  var playerWins = 0
  var aiWins = 0
  var playerRock = 0
  var playerPaper = 0
  var playerScissors = 0
  var playerChoice = scala.io.StdIn.readLine("augfdhsvddvfddf")


  var aiChoice = aiChoose(playerRock, playerPaper, playerScissors)

  (playerChoice, aiChoice) match{
    case ("Rock", "Scissors") => playerWins+=1; println("You win")
    case ("Scissors", "Paper") => playerWins+=1; println("You win")
    case ("Paper", "Rock") => playerWins+=1; println("You win")
    case _ => println("You don't win")
  }


}

def aiChoose(rock: Int, paper: Int, scissors: Int): String ={
  (rock, paper, scissors) match{
    case _ if rock>=paper && rock >= scissors => "Rock"
    case _ if paper>=rock && paper>= scissors => "Paper"
    case _ => "Scissors"
  }
}

rps(true)