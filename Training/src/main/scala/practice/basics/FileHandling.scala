package practice.basics

import scala.io._
import java.io._

//class FileHandling {
//  readTextFile()
//
//  def readTextFile(): Unit = {
//    val fileName = raw"E:\\scala_sessions\\sample"
//    //    Method 1: Read all
//    val data = Source.fromFile(fileName)
//    println(data) // Gives only the iterator object
//    for (d <- data.getLines()) {
//      println(s"Data is: $d")
//    }
//    data.foreach(d => println(d))
//    data.close()
//  }
//
//  // Scala doesn’t offer any special file writing capability,
//  // so fall back and use the Java PrintWriter or FileWriter approaches
//  def writeTextFile(): Unit = {
//    val fileName = raw"E:\\scala_sessions\\sample"
//    val writer = new PrintWriter(new File(fileName))
//    writer.write("This line written by scala program narendra")
//    writer.close()
//    Source.fromFile(fileName).getLines().foreach(d => println(d))
//  }
//  writeTextFile()
//}

object FileHandling{

  def init: Unit ={
    testing
  }
  def testing(): Unit ={
    println("Narendra")
  if(1== 1)
    println("true")
    else
    println("")
  }
}