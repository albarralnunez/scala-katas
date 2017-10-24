import org.scalatest._


class FibonacciTest extends FlatSpec with Matchers with BeforeAndAfter {


  var fibonacci: Fibonacci = _

  before {
    fibonacci = new Fibonacci
  }

  it should "return 0 or 1 if index is 1" in {
    fibonacci.getResult(0) should be (1)
    fibonacci.getResult(1) should be (1)
  }

  it should "return fibonacci number at index" in {
    fibonacci.getResult(2) should be (2)
    fibonacci.getResult(3) should be (3)
    fibonacci.getResult(4) should be (5)
    fibonacci.getResult(5) should be (8)
    fibonacci.getResult(6) should be (13)
    fibonacci.getResult(7) should be (21)

  }

}
