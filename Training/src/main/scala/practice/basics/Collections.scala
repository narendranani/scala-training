package practice.basics

object Collections {
  def init: Unit = {
    mutableCollections
    immutableCollections
    sets
  }

  def immutableCollections(): Unit = {
    println("********************************** List *******************************************")
    //    List are immutable
    val listAny: List[Any] = List(10, 20, "Scala")
    var listString: List[String] = List()
    listString = List("10", "20", "Scala")
    val listInt: List[Int] = List(10, 20, 30)
    listInt :+ 40
    println(s"listInt: $listInt")
    // We can not append the element to same list. We have to append the element and make it as a new list
    val appendList = listInt :+ 40
    var prependList = 40 +: listInt
    prependList = 500 :: prependList
    println(s"newLists: $appendList, $prependList")
    //    listAny(0) = 200 //-> can not assign values to list
    println(s"assignValue: $appendList, $prependList")
    //    println(s"operators: ${listInt -= 2}, $prependList")
    prependList.foreach(i => print(s"element: $i , "))
    //    Nil -> is a Empty list
    println(s"\nEmptyList With Nil: $Nil")
    println(s"EmptyList With Empty: ${List.empty}")
    val nilList = 1 :: 2 :: 3 :: Nil
    println(s"nilList: $nilList")
    //    Head, tail, reverse
    println(s"head ${nilList.head}, tail: ${nilList.tail}, reverse: ${nilList.reverse} ") // tail gives the values after head
    println("********************************** Map *******************************************")
    val map1: Map[Int, String] = Map((18, "Kohli"), (7, "Dhoni"))
    val map2: Map[Any, String] = Map(("India" -> "Kohli"), (7 -> "Dhoni"))
    val map3: Map[Int, String] = Map(18 -> "Kohli", 7 -> "Dhoni")
    println(s"Maps: $map1, $map2, $map3")
    println(s"Access values: ${map1(7)}, ${map2("India")}, ${map3.keys}")
    println(s"Empty Map: ${Map.empty[String, Any]}")

  }

  def mutableCollections(): Unit = {
    println("********************************** Array *******************************************")
    val arrayAny: Array[Any] = Array(10, 20, "Narendra")
    //arrayAny = Array(10, 20, "Narendra")
    //  This is because it uses the toString implementation for the given object. In this case Array prints out the type and hash.
    //  If you convert it to a List then it will be a prettier output due to List's toString implementation
    println(f"\narrayAny is ${arrayAny}")
    println(f"arrayAny is ${arrayAny.toList}")
    arrayAny :+ 3
    println(s"New array ${arrayAny.toList}")
    arrayAny(1) = "UpdateElement"
    println(s"Updated array ${arrayAny.toList}")
    //    Fixed size - allocates size and you can
    val fixedArray: Array[Any] = new Array[Any](2)
    //    fixedArray(0) = "Dhoni"
    fixedArray(1) = "Kohli"
    //    fixedArray(2) = "Rohit"
    println(s"fixedArray: ${fixedArray.toList}")

    //    Multi dimensional arrays
    val multiArray: Array[Array[String]] = Array.ofDim[String](3, 3)
    multiArray(0)(1) = "only"
    println(s"multiArray: ${multiArray.deep.toList}")

    //    tabulate function
    val tabArray = Array.tabulate(5)(_ + 2)
    println(s"tabArray: ${tabArray.toList}")
    //    multi dimensional array with tabulate
    val multiTabArray = Array.tabulate(3, 4)((row, column) => row + column)
    println(s"multiTabArray: ${multiTabArray.deep.toList}")
  }

  def sets: Unit = {
    println("*******************************Set**********************************************")
    val setDup = Set(1, "a", 2, 2)
    println(s"setDup: $setDup") // No duplicates
    /* The order of the Set will be changed as the sets are implemented as hash sets in which elements are organized by the value of hashCode.
       It turns out that you can find elements much faster if you allow sets to reorder their elements.
       Finding an element in a hash set is much faster than in an array or list
    */
    val setOrder = Set(1, "a", 2, 2, 3, 5)
    println(s"setOrder: $setOrder")
    println(s"setOperators: ${setOrder - 3}")
  }

}