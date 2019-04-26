package practice.basics

object Functions {
  def init(): Unit = {
    println(s"Functions: Regular func:${evenOdd(45)}")
    println(s"Functions: No return type: ${evenOddNoReturnKeyword(12)}")
    println(s"Functions: Lambda: ${evenOddLambda(142)}")
    println(s"Functions: Return type for recursive: ${fac(5)}")
    println(s"Functions: Return Nothing: ${returnNothing()}")
    println(s"Functions: Procedure: ${procedure("This is procedure")}")
    //    parentheses not required if there are args
    println(s"Functions: No parentheses${noParenthesesNoReturn}")
    println(s"Functions: No parentheses${noParenthesesReturn}")
    println(s"Functions: named args: ${named(x = 142)}")
    println(s"Functions: variable_args: ${variable_args(11, 52, 23, 14)}")
    //    Cannot pass sequence of values as range. If the sum function is called with one argument, that must be a single integer, not a range of integers
    //    println(s"Functions: Cannot pass sequence of values as range ${variable_args(1 to 5)}")
    //    So, the remedy is to tell the compiler that you want the parameter to be considered an argument sequence
    println(s"Functions: Pass parameter as arg sequence: ${variable_args(1 to 5: _*)}")
    multipleParameters(10)(20)
  }

  //Simple function - Must specify return type correctly

  def evenOdd(x: Int): String = {
    var state = ""
    if (x % 2 == 0) {
      state = "even"
    }
    else {
      state = "odd"
    }
    return state
  }

  //  Return keyword is not required

  def evenOddNoReturnKeyword(x: Int): String = {
    var state = ""
    if (x % 2 == 0) {
      state = "even"
    }
    else {
      state = "odd"
    }
    state
  }

  //  Return Nothing. Unit == Void
  def returnNothing(): Unit = {
    print("Return nothing")
  }

  //  '=' symbol is not required for unit return. In other words, if there is no '=' symbol the return type is Unit and these are called as Procedures
  def procedure(str: String) {
    val border = "-" * str.length + "--\n"
    println(border + "|" + str + "|\n" + border)

  }

  //  No parentheses without return type
  def noParenthesesNoReturn {
    println(s"Sum of 1, 2 is ${1 + 2}")
  }

  //  No parentheses with return type
  def noParenthesesReturn: Int = {
    val a = 1
    val b = 1
    return a + b
  }

  //  Lambda Function
  def evenOddLambda(x: Int) = if (x % 2 == 0) "even" else "odd"

  //  Return type for recursive
  def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

  //  Named arguments
  def named(x: Int = 100, y: Int = 20) = x + y

  //  Variable arguments
  def variable_args(args: Int*) = {
    var res = 0
    for (i <- args)
      res += i
    res
  }
  def multipleParameters(x: Int)(y: Int): Unit ={
  println(s"value x: $x")
  println(s"value y: $y")
  }
}