package practice.basics

object Option {
  def init {
    option
  }

  def option: Unit = {
    val nullValue: String = null
//    println(nullValue.equals(""))
    var notNull: Option[String] = None
    println(notNull.getOrElse("This is null").equals(""))
    notNull = Some(null)
    println(notNull.get.equals(""))
    println(notNull.getOrElse("This is null").equals(""))
    notNull = null
//    println(notNull.getOrElse("This is null"))

  }

}