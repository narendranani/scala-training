package practice.basics

object LazyValues {
  def init: Unit = {
    println(s"LazyEvaluation: ${lazyEvaluation}")
  }

  /*  Lazy values are not evaluated until those accessed for the first time.
   In below example, the file is not opened until the variable "words" accessed first time.
   To test this, comment the print statement and provide incorrect file name and it will not throw an error
   */
  def lazyEvaluation: Unit = {
    lazy val words = scala.io.Source.fromFile(raw"E:\\scala_sessions\\sample.txt").mkString
    println(s"LazyEvaluation words: $words")
  }
}
