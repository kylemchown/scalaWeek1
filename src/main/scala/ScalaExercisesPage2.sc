

def iteration(a: String, b: Int)={
  for(i<- 1 to b){
    println(a)
  }
}

iteration("Hello", 3)

def iteration2(a:String, b:Int)={
  for(i<-1 to b; j<-1 to b){
    if(j==b)
      println(a)
    else
      print(a)
  }
}

iteration2("Haa", 4)

def fizzbuzz(a: String, b:String, c: Int)={
  for(i<-1 to c){
    if(i%3 == 0 && i%5==0)
      println(a+b)
    else if(i%3==0)
      println(a)
    else if(i%5==0)
      println(b)
    else
      println(i)
  }
}

fizzbuzz("fizz", "buzz", 15)

def recursion(a:String, b: Int): Unit={
  if (b==0){

  }
  else{
    recursion(a, b-1)
    println(a)
  }
}

recursion("Hello", 3)

//I know recursion2 isn't right but work with me here

def recursion2(a:String, b:Int, c:Int, d:Int): Unit={
  if(b==0){

  }
  else if(c==0){
    recursion2(a, b-1, d, d)
  }
  else if(c==1) {
    println(a)
    recursion2(a, b, c - 1, d)
  }
  else {
    print(a)
    recursion2(a, b, c - 1, d)
  }
}

recursion2("h",4,4,4)



def fizzbuzzRecurs(a:String, b:String, c:Int): Unit ={
  if(c == 0){

  }
  else if(c%3 == 0 && c%5==0) {
    fizzbuzzRecurs(a, b, c - 1)
    println(a + b)
  }
  else if(c%3==0) {
    fizzbuzzRecurs(a, b, c - 1)
    println(a)
  }
  else if(c%5==0) {
    fizzbuzzRecurs(a, b, c - 1)
    println(b)
  }
  else {
    fizzbuzzRecurs(a, b, c - 1)
    println(c)
  }
}

fizzbuzzRecurs("fizz", "buzz", 15)



def patternMatching1(a:Int, b:Int, c:Boolean)={
  c match{
    case false if a==0 => b
    case false if b==0 => a
    case false if a==0 & b==0 => 0
    case true => a+b
    case false => a*b

  }
}

patternMatching1(2,6,false)




def patternMatching2(a: Any)={
  var b = 1
  var c = 2
  var d = (1,1)

  a match{
    case a: Array[Int] if a.size >= 2 => b = a(0); c = a(1); Array(c,b)
    case a: Tuple2[Int, Int] => val(b,c) = a; d = (c,b); d
    case a: List[Int] if a.size >= 2 => b = a.head; c=a.tail.head; val e = (c,b); e
    case _ => println("Not valid")
  }
}

patternMatching2((123,321))

def functional1()={
  var a = java.util.TimeZone.getAvailableIDs
  var b = scala.collection.mutable.ArrayBuffer.empty[Array[String]]
  for (i<-a){
    var c = i.split("/")
    b += c
  }
  var d = b.filter(_.size > 1)
  var e = scala.collection.mutable.ArrayBuffer.empty[String]
  for (i<-d){
    e += i(1)
  }
  e

}

def functionalRedo()={
  java.util.TimeZone.getAvailableIDs.map(element => element.split("/")).filter(_.size>1)
}
//var e = scala.collection.mutable.ArrayBuffer.empty[String]
//var q = java.util.TimeZone.getAvailableIDs.filter(_.size >1).foreach(e += _.split("/")(1) )
//e

functional1()

functionalRedo()



