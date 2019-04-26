package practice.basics

object Tuples {
  def init {
    tuples
  }

  def tuples: Unit = {
    var kohli = Tuple2("Kohli", 18)
    println(s"${kohli._1} jersy number is ${kohli._2}")
    //    Max 22 allowed
    val values = (1, 2, 3, 4, 'f', 4, 657, 78, 3, 67, 56, 567, 657, 6, 567, 5476, 5, 5476, 567, 3, 67, 6)
    println(values, values.getClass)

    val india = ("kohli", "Dhoni", "Rohit")
    val sa = ("ABD", "Amla", "Faf")
    val sl = ("Sangakkara", "Tharanga", "Dilshan")
    val players = List(india, sa, sl)
    players.foreach {
      tuple =>
        tuple match {
          case ("kohli", "Dhoni", "Rohit") => println("These are Indian players"); india
          case d if d._1 == "ABD" => println("These are SouthAfrican players"); sa
          case _ => println("These are Srilanka players"); sl
        }
        println(s"players: $tuple")
    }
  }

}