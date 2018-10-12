def tooHot(temp: Int, isSummer: Boolean)={
  isSummer match{
    case true if temp >60 && temp< 100 => true
    case false if temp>60 && temp<90 => true
    case _ => false
  }
}

tooHot(60,false)
tooHot(61,false)
tooHot(89,false)
tooHot(90,false)
tooHot(60,true)
tooHot(61,true)
tooHot(99,true)
tooHot(100,true)