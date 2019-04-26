package practice.basics

object InputOutput {
  def init(): Unit = {
    readUserInput
    stringInterpolation
    escapeCharacters
  }

  def readUserInput(): Unit = {
    import scala.io.StdIn._
    //    Same line
    print("Enter input: ")
    val num = readInt()
    val str = readLine("Enter user name: ")
    //    New line
    println("values are:", num, str)
  }

  def stringInterpolation(): Unit = {
    //  s  String Interpolator
    //    Access Variables in a String Literal
    val title1 = "Play"
    val title2 = "Scala"
    print("stringInterpolation: Book($title1 2 for $title2)")
    print(s"stringInterpolation: Book($title1 2 for $title2)")
    //    Access Object Fields in a String Literal
    class Person(val firstName: String, val lastName: String)
    val person1 = new Person("Ram", "Posa")
    println(s"stringInterpolation: Person fullname: $person1.firstName $person1.lastName")
    println(s"stringInterpolation: Person fullname: ${person1.firstName} ${person1.lastName}")

    //    Can assign to variable also
    val str = s"title2: $title2"
    println(str)
    //  f  String Interpolator
    var itemPrice = 10.5
    println(s"stringInterpolation: Item Price : $itemPrice")
    println(s"stringInterpolation: Item Price : $itemPrice%.2f")
    println(f"stringInterpolation: Item Price : $itemPrice%.2f")

    //    raw String Interpolator
    val itemName = "Laptop"
    itemPrice = 499.99
    println(s"stringInterpolation: Item Details: \n Name: $itemName \t Price : $itemPrice%.2f")
    println(raw"stringInterpolation: Item Details: \n Name: $itemName \t Price : $itemPrice%.2f")
  }

  def escapeCharacters(): Unit = {
    println("\nStep 3: Using triple quotes \"\"\" to escape characters")
    val donutJson: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
    println(s"donutJson3 = $donutJson")
    //    Creating multi-line text using stripMargin
    val donutJson1: String =
      """
        |{
        |"donut_name":"Glazed Donut",
        |"taste_level":"Very Tasty",
        |"price":2.50
        |}
      """
    println(donutJson1)
    val donutJson2: String =
      """
        |{
        #"donut_name":"Glazed Donut",
        |"taste_level":"Very Tasty",
        |"price":2.50
        |}
      """.stripMargin
    println(donutJson2)
    val donutJson3: String =
      """
        #{
        #"donut_name":"Glazed Donut",
        #"taste_level":"Very Tasty",
        #"price":2.50
        #}
      """.stripMargin('#')
    println(donutJson3)

  }
}