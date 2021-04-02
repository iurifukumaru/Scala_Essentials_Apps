package part04

object P02Calculator {
  def main (args: Array[String]): Unit = {
    var x = 10
    var y = 5
    sum(x,y)
    minus(x,y)
    division(x,y)
    multiplication(x,y)


  }
  def sum(x: Int, y: Int) = {println(x + y)}
  def minus(x: Int, y: Int) = {println(x - y)}
  def division(x: Int, y: Int) = {if(y == 0) println("Zero") else println(x / y)}
  def multiplication(x: Int, y: Int) = {println(x * y)}

}
