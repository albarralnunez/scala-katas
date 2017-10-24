

class Fibonacci {

  def getResult(index: Int): Int = index match {
    case 0 => 1
    case 1 => 1
    case _ => getResult(index - 1) + getResult(index - 2)
  }

}