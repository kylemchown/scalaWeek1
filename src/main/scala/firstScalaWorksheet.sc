println("Hello")

val tast = "Hello World!"

println(tast)

def tost(a: String): Unit = {
  tast
}

tost("Butt")



def inf(a: Any) = {
  a.getClass.getSimpleName
}

inf(23)
inf("asd")
inf(true)

def end(a: String, b:Int) ={
  var c = a.length
  c = c - b
  a.substring(c)
}

end("Boogie", 2)

def string2(a: String, b: String, c: Char, d: Char) ={
  val e = a + b
  e.replace(c,d)
}

string2("Ha", "llo", 'a', 'e')

def sum(a: Int, b:Int, c:Boolean) ={
  if(a == 0)
    b
  else if(b == 0)
    a
  else if(c)
    a+b
  else
    a*b
}

sum(1,2, true)
sum(1,2, false)
sum(1,0, false)
sum(0,2, false)