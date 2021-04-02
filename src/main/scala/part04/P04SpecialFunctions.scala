package part04

object P04SpecialFunctions extends App {
  println(((x: Int) => x + 1)(5))
  val f = ((x: Int) => x + 1)
  println(f(5))
  println(f.apply(5))

  val doubler = (i: Int) => {println(i * 2)}
  doubler(10)

  def someOperation(f:(Int, Int) => Int) = {
    println(f(5,5))
  }
  def sum(x: Int, y: Int) = {x + y}
  someOperation(sum)

  def greeting() = (name: String) => {println("Hello: " + name)}
  val z = greeting()
  z("Iuri")
  greeting()("Iuri")

  val y = 5
  var multiplier = (x: Int) => println(x * y)
  multiplier(4)


}
