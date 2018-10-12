def uniSum(a: Int, b: Int, c: Int)={
  var output = 0
  if(a==b&&b==c){
    output = 0
  }
  else if (a==b || b==c || c==a) {
    if (a == b) {
      output = c
    }
    else if (b == c) {
      output = a
    }
    else {
      output = b
    }
  }
  else{
    output = a+b+c


  }
  output
}

//def uniSum2(a:Int, b:Int, c:Int)={
//  a match{
//
//  }
//}

uniSum(234,234,234)