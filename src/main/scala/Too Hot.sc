def tooHot(temp: Int, isSummer: Boolean)={
  isSummer match{
    case true if temp >60 && temp< 100 => true
    case false if temp>60 && temp<90 => true
    case _ => false
  }
}

tooHot(50,false)