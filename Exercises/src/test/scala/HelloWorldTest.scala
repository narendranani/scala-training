import org.scalatest.FunSuite

class HelloWorldTest extends FunSuite {
  test("Main.HelloWorld"){
    assert(Main.HelloWorld() === "Hello, World!")
  }
}
