def tooHot(temp: Int, isSummer: Boolean)={
  isSummer match{
    case true if temp >60 && temp< 100 => true
    case false if temp>60 && temp<90 => true
    case _ => false
  }
}

tooHot(60,isSummer = false)
tooHot(61,isSummer = false)
tooHot(89,isSummer = false)
tooHot(90,isSummer = false)
tooHot(60,isSummer = true)
tooHot(61,isSummer = true)
tooHot(99,isSummer = true)
tooHot(100,isSummer = true)