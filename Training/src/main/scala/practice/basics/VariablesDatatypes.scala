package practice.basics

object VariablesDatatypes {

  def init {
    mutableImmutable
    assignment
    declaration
    datatypes
    convertDataTypes
  }

  def mutableImmutable: Unit ={
//    Type inference - Scala compiler is smart enough to figure out that the data type of the literal
    var mutable = "My value can be changed"
    mutable = "Changed my value"
    val immutable = "My value can not change"
//    immutable = ""
  }
  //  wildcard operator - Useful when you don't know the value of your variable immediately
  var outside: String = _

  def declaration: Unit = {
    //  Local variables must be initialized i.e the variables declared in the function must be initialized
    //    var canNot: String = _
    outside = "Nothing"
    println(s"declaration: $outside")
  }

  def assignment(): Unit = {
    val a = 10
    var b = 20
    b = a + b
    println(a.+(b))
    val c = {
      val d = b * 10; val e = d + a; e - d
    }
    println(s"assignment: $c")
  }

  def datatypes: Unit = {
    val donutsBought: Int = 5
    val bigNumberOfDonuts: Long = 100000000L
    val smallNumberOfDonuts: Short = 1
    val priceOfDonut: Double = 2.50
    val donutPrice: Float = 2.50f
    val donutStoreName: String = "allaboutscala Donut Store"
    //    val donutByte: Byte = 0xa
    val donutFirstLetter: Char = 'D'
    val nothing: Unit = ()
  }

  def convertDataTypes: Unit ={
    val num: Int = 19
    val str: String = num.toString
    println(str, str.getClass)
    val convertNum: Int = str.toInt
    println(convertNum, convertNum.getClass)
    val float: Float = convertNum.toFloat
    println(float, float.getClass)
  }
}