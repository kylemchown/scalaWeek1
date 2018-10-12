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

Blackjack(0,1)
Blackjack(22,21)
Blackjack(12,16)
Blackjack(24,12)
Blackjack(0,1)