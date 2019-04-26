package practice.basics

object Loops {
  def init{
    whileLoop
    doWhile
    forLoop
    forComprehension
    forEach

  }

  def whileLoop(): Unit = {
    print(s"\nwhileLoop: ")
    var n = 10
    while (n > 0) {
      print(s"$n -> ${n * n}")
      n -= 1
    }

  }

  def doWhile: Unit ={
    var num: Int = 0
    print("\ndoWhile: ")
    do {
      num += 1
      print(s"Number = $num ,")
    } while (num  < 5)
  }
  def forLoop(): Unit = {
    print(s"\nforLoop: ")
    for (i <- 1 to 10)
      print(s" $i")

    print(s"\nforLoop: ")
    for (i <- 1 until 10)
      print(s" $i")

    print(s"\nforLoop by : ")
    for (i: Int <- 1 to 10 by 2) {
      val j = i * i
      print(s" $i -> $j")
    }
    print(s"\nforLoop: ")
    val list: List[Any] = List("a", "b", "c", 10)
    for (i <- list) {
      print(s" $i, ")
    }
  }

  def forComprehension(): Unit = {
    print(s"\nforComprehension: ")
//    Multiple Generators separated by semicolon
    for (i <- 1 to 10; j <- 1 to 3) print(s" $i, $j")
    print(s"\nforComprehension: ")
    for (i <- 1 to 10; j = i - 1; k <- j to 3) print(s" $i, $k")
    print(s"\nforComprehension: ")
    for {i <- 1 to 10
         j = i - 1
         k <- j to 3} print(s" $i, $k")
//    Generator with condition. Note that the semicolon before the if is optional
    print(s"\nforComprehension: ")
    for (i <- 1 to 10; if i%2 == 0) print(s"$i")
//    yield
    print(s"\nforComprehension yield: ")
    for (i <- 1 to 10 ) yield print(s" ${i+3}")
    var j = 0
    val res = for (i <- 1 to 10 ) yield {  j= j+i}
    val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
    val sweeteningIngredients = for {
      ingredient <- donutIngredients
      if (ingredient == "sugar" || ingredient == "syrup")
    } yield ingredient
    println(s"\nsweeteningIngredients: $sweeteningIngredients")
  }

  def forEach: Unit ={
    val values: List[Any] = List(10, "Kohli", 23, "Dhoni")
    print("\nfor each: ")
    values.foreach(x => print(x+ ", "))
    print("\nfor each: ")
    values.foreach{
      x =>  val seq = (1 to 5)
        seq.foreach(num => print(x + num.toString+ ", "))
    }
  }
}