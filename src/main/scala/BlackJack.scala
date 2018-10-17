object BlackJack {
  def Blackjack(a: Int, b: Int)={
    if((a>21 || a<1) && (b>21 || b<1)){
      0
    }
    else if (a>21 || a<1)
      b
    else if (b>21 || b<1)
      a
    else
      Array(a,b).reduceLeft(_ max _)

  }
}
