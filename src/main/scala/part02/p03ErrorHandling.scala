package part02

import java.io.FileNotFoundException
import scala.io.Source.fromFile

object p03ErrorHandling {
  def main (args: Array[String]): Unit = {
    val fileName = "src/main/resources/noFile.txt"
    try {
      for (line <- fromFile(fileName).getLines())
        println(line.toUpperCase)
    } catch {
      case e:FileNotFoundException => println("The file was not found!")
      case _:Exception=>println("Your program had an error")
      }
    try {
      var a = 10 / 0
    } catch {
      case e:ArithmeticException=> println("Don't divide by zero!")
    }

  }
}
