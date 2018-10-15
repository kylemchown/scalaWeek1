object RPS{
  def main(args: Array[String]): Unit = {
    rps(false)
  }

  def rps(player: Boolean): Unit ={

    val wins = Array(0,0)
    val choices = Array(0,0,0)
    //var playerActions = scala.collection.mutable.ArrayBuffer.empty[Array[String]]

    val aiwins = Array(0,0)
    if (player) {
      for (i <- 1 to 10) {
        val playerChoice = scala.io.StdIn.readLine("Enter your action as a string").toLowerCase.capitalize
        val aiChoice = aiChoosePlayer(choices(0), choices(1), choices(2))


        (playerChoice, aiChoice) match {
          case ("Rock", "Scissors") => println("AI plays Scissors")
            wins(0) += 1
            choices(0) += 1
            println("You win")
          case ("Scissors", "Paper") => println("AI plays Paper")
            wins(0) += 1
            choices(2) += 1
            println("You win")
          case ("Paper", "Rock") => println("AI plays Rock")
            wins(0) += 1
            choices(1) += 1
            println("You win")
          case ("Rock", "Rock") => println("AI plays Rock")
            choices(0) += 1
            println("You draw")
          case ("Scissors", "Scissors") => println("AI plays Scissors")
            choices(2) += 1
            println("You draw")
          case ("Paper", "Paper") => println("AI plays Paper")
            choices(1) += 1
            println("You draw")
          case ("Rock", "Paper") => println("AI plays Paper")
            wins(1) += 1
            choices(0) += 1
            println("You lose")
          case ("Scissors", "Rock") => println("AI plays Rock")
            wins(1) += 1
            choices(2) += 1
            println("You lose")
          case ("Paper", "Scissors") => println("AI plays Scissors")
            wins(1) += 1
            choices(1) += 1
            println("You lose")
          case _ => println("You're input was invalid, so you wasted a game, good job")
        }

      }
      println("You won " + wins(0) + " time!")
    }
    else{
      for(i<- 1 to 50) {
        val aiChoice1 = aiChooseAI()
        val aiChoice2 = aiChooseAI()

        (aiChoice1, aiChoice2) match {
          case ("Rock", "Scissors") => println("AI 1 plays Rock")
            println("AI 2 plays Scissors")
            aiwins(0) += 1
            println("AI 1 win")
          case ("Scissors", "Paper") => println("AI 1 plays Scissors")
            println("AI 2 plays Paper")
            aiwins(0) += 1
            println("AI 1 win")
          case ("Paper", "Rock") => println("AI 1 plays Paper")
            println("AI 2 plays Rock")
            aiwins(0) += 1
            println("AI 1 win")
          case ("Rock", "Rock") => println("AI 1 plays Rock")
            println("AI 2 plays Rock")
            println("AI draw")
          case ("Scissors", "Scissors") => println("AI 1 plays Scissors")
            println("AI 2 plays Scissors")
            println("AI draw")
          case ("Paper", "Paper") => println("AI 1 plays Paper")
            println("AI 2 plays Paper")
            println("AI draw")
          case ("Rock", "Paper") => println("AI 1 plays Rock")
            println("AI 2 plays Paper")
            aiwins(1) += 1
            println("AI 2 win")
          case ("Scissors", "Rock") => println("AI 1 plays Scissors")
            println("AI 2 plays Rock")
            aiwins(1) += 1
            println("AI 2 win")
          case ("Paper", "Scissors") => println("AI 1 plays Paper")
            println("AI 2 plays Scissors")
            aiwins(1) += 1
            println("AI 2 win")
        }

      }
      println("AI 1 won " + aiwins(0) + " time!")
      println("AI 2 won " + aiwins(1) + " time!")

    }


  }


  def aiChoosePlayer(rock: Int, paper: Int, scissors: Int): String ={
    val b = scala.util.Random.nextInt(9)
    b match{
      case 0 => "Rock"
      case 1 => "Paper"
      case 2 => "Scissors"
      case _ if rock>=paper && rock >= scissors => "Paper"
      case _ if paper>=rock && paper>= scissors => "Scissors"
      case _ => "Rock"
    }
  }

  def aiChooseAI(): String ={
    val b = scala.util.Random.nextInt(3)
    b match{
      case 0 => "Paper"
      case 1 => "Scissors"
      case 2 => "Rock"

    }
  }


}


