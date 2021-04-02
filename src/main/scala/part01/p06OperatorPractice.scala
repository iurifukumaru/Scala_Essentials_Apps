package part01

object p06OperatorPractice {
  def main(args: Array[String]): Unit = {
    var x = 3 // 0011
    var y = 9 // 1001
    var sum = println(x + y)
    var b1 = println(x&y)
    var b2 = println(x|y)
    var b3 = println(x^y)
    var b4 = println(x<<2)
    var b5 = println(x<<3)
    val nums = println(1::3::5::Nil)
    if(x>0 || y>0) println("Both values are positive")

  }
}
