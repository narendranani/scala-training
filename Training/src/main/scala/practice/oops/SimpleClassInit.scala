package practice.oops

object SimpleClassInit {
  def init(): Unit = {
    val simpleClass = new SimpleClasses()
    println(s"simpleClass: ${simpleClass.increment()}")
    println(s"simpleClass: ${simpleClass.current}")
  }

}
