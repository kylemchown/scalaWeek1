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

def uniSum2(a:Int, b:Int, c:Int)={
  (a,b,c) match{
    case (_,`a`,`a`) => 0
    case (_,`a`,_) => c
    case (_,_,`a`)=> b
    case (_,_,`b`)=> a
    case _ => a + b + c
  }
}

uniSum(234,234,234)
uniSum2(1243,1243,1243)