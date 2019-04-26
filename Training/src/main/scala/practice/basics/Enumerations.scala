package practice.basics

object Enumerations extends Enumeration {
  val Glazed = Value("Glazed")
  val Strawberry = Value("Strawberry")
  val Plain = Value("Plain")
  val Vanilla = Value("Vanilla")
//  Can set the id for value and the values are sorted based on this id
  val Tasty = Value(11, "Tasty")

  println(s"Vanilla Donut string value = ${Enumerations.Vanilla} -> ${Enumerations.Vanilla.id}")
  println(s"Enumerations values = ${Enumerations.values}")
  println(s"Tasty id = ${Enumerations.Tasty.id}")
}