package practice.basics

import scala.util.Random

object PatternMatching {
  def init{
    pattern_matching
    matchTest(3)
  }

  //  Pattern matching
  def pattern_matching: Unit = {
    val n = Random.nextInt(10)
    val res = n match {
      case 0 => "zero"
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case _ => "many"
    }
    println(s"pattern_matching: $n, $res")
    val priceOfDonut: Any = 2.50
    val priceType = priceOfDonut match {
      case price: Int => "Int"
      case price: Float => "Float"
      case price: Double => "Double"
      case price: String => "String"
      case price: Boolean => "Boolean"
      case price: Char => "Char"
      case price: Long => "Long"
//      case _ => "donno"
    }
    println(s"Price type is $priceType")
  }


  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }


}
