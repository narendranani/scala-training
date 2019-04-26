package practice.basics

object IfElse {

  def init: Unit = {
    ifElse
    ternary
  }

  //    Case Class
  def ifElse(): Unit = {
    val num = 11
    if (num > 10)
      println(s"Number is greater than 10")
    else if (num < 20)
      println(s"Number is greater than 10 and less than 20")
    else
      println(s"Number is greater than 20")

    if (num > 10) {
      println(s"Number *10 = ${num * 10}")
    } else if (num == 0) {
      println("Number o is zero.")
      println("No need to buy donuts.")
    } else {
      println(s"Number of donuts to buy = $num")
    }
  }

  def ternary: Unit = {
    val num = 10
    val result = if (num > 10) (num * num) else num + num
    println(result)

  }


}
