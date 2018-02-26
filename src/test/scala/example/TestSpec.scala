package example

import org.scalatest._

class TestSpec extends FlatSpec with Matchers {
  "The Test object" should "say hello" in {
    Test.greeting shouldEqual "hello"
  }
}