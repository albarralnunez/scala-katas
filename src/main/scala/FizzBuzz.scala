class FizzBuzz {

  def getResult(number: Int): String = (number % 3, number % 5) match {
    case (0, 0) => "FizzBuzz"
    case (0, _) => "Fizz"
    case (_, 0) => "Buzz"
    case (_, _) => number.toString
  }

  def generate(from: Int, to: Int): IndexedSeq[String] =
    (from to to).map(getResult)


}
