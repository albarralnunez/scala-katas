import org.scalatest._


class FizzBuzzTest extends FlatSpec with Matchers with BeforeAndAfter {


  var fizzBuzz: FizzBuzz = _

  before {
    fizzBuzz = new FizzBuzz
  }

  it should "Fizz if is divisible only by 3" in {
    fizzBuzz.getResult(3) should be ("Fizz")
    fizzBuzz.getResult(6) should be ("Fizz")
  }

  it should "Buzz if is divisible only by 5" in {
    fizzBuzz.getResult(5) should be ("Buzz")
    fizzBuzz.getResult(10) should be ("Buzz")
  }

  it should "Buzz if is divisible only by 15" in {
    fizzBuzz.getResult(15) should be ("FizzBuzz")
    fizzBuzz.getResult(30) should be ("FizzBuzz")
  }

  it should "return all fizzBuzz problem until n" in {
    fizzBuzz.generate(1, 15).toList  should equal(List("1", "2", "Fizz", "4", "Buzz",
      "Fizz", "7", "8", "Fizz", "Buzz",
      "11", "Fizz", "13", "14", "FizzBuzz"))

  }

}
