def Blackjack(a: Int, b: Int)={
  var output = 0
  if((a>21 || a<1) && (b>21 || b<1)){
    output = 0
  }
  else if ((a>21 || a<1))
    output = b
  else if ((b>21 || b<1))
    output = a
  else
    output = Array(a,b).reduceLeft(_ max _)

  output
}

Blackjack(0,1)
Blackjack(22,21)
Blackjack(12,16)
Blackjack(24,12)
Blackjack(0,1)