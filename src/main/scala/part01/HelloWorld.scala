package part01

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")

    var firstName: String = "Peggy"
    val age = 21
    println(firstName + ", is \n"+age+" years old")
    var sum = 10+25
    def function1 = {
      println("This is function 1")
    }
    function1
  }
} //

