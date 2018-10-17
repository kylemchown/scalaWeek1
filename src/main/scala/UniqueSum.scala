object UniqueSum {
  def uniSum(a:Int, b:Int, c:Int)={
    (a,b,c) match{
      case (_,`a`,`a`) => 0
      case (_,`a`,_) => c
      case (_,_,`a`)=> b
      case (_,_,`b`)=> a
      case _ => a + b + c
    }
  }
}
