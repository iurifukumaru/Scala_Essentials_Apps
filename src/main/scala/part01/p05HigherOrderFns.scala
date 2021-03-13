package part01

object p05HigherOrderFns {
  def main (args: Array[String]): Unit = {

    def higherOrder(x: Int, y: Int => Int) = y(x)

    val double = (i: Int) => i * 2
    println(higherOrder(6, double))

    val triple = (i: Int) => i * 3
    println(higherOrder(6,triple))

    def sayHello = (name: String) => println("Hello"+" "+ name)
    var message = sayHello("Iuri")

    var y = 5
    val multiplier = (x: Int) => println(x * y)
    multiplier(10)

  }
}
