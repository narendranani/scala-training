import scala.collection.mutable._
import scala.io.StdIn._

object Main {
  def HelloWorld() = "Hello, World!"

  def sumOfMultiples(num: Int, mul1: Int, mul2: Int): Int = {
    val filteredVals = for (i <- 1 until num if i % mul1 == 0 || i % mul2 == 0) yield i
    println(filteredVals)
    var sum: Int = 0
    for (i <- filteredVals) sum += i
    println(sum)
    filteredVals.sum
  }

  def leapYear(year: Int): String = if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) "This is a leap year" else "This is not a leap year"

  def accumulate(nums: List[Int]): List[Int] = nums.map(i => i * i)

  def flattenArray(arr: Array[Any]): ArrayBuffer[Int] = {
    val flattenArr: ArrayBuffer[Int] = new ArrayBuffer
    for (i <- arr) {
      flattenArr :+ 34
    }
    flattenArr
  }

  def main(args: Array[String]): Unit = {
    println(HelloWorld())
    /*Exercise-2
    Given a number, find the sum of all the unique multiples of particular numbers up to but not including that number.
    If we list all the natural numbers below 20 that are multiples of 3 or 5, we get 3, 5, 6, 9, 10, 12, 15, and 18.
    The sum of these multiples is 78.
    */
    //    print("Enter the number: ")
    //    val num: Int = readInt()
    //    print("Enter the multiple Num1: ")
    //    val mul1: Int = readInt()
    //    print("Enter the multiple Num2: ")
    //    val mul2: Int = readInt()
    //    println(sumOfMultiples(num, mul1, mul2))

    /* Exercise-3
    Check the leap year
    */
    //    print("Enter the year: ")
    //    val year: Int = readInt()
    //    println(leapYear(year))

    /* Exercise-4
    Sum of elements
    */
    var nums: List[Int] = readLine("Enter the numbers: ").split(",").map(_.toInt).toList
    println(accumulate(nums))

    /* Exercise-5
    Flatten the array
    For Example
    input: [1,[2,3,null,4],[null],5]
    output: [1,2,3,4,5]
    */
    var nestedArray: Array[Any] = Array(23, "as", Array(245, 546), Array(345, 456))
    println(accumulate(nums))

  }
}
