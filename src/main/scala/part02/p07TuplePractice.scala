package part02

object p07TuplePractice {
  def main(args: Array[String]): Unit = {
    val v = (1, 1.4, "Hello")
    var x = v._3
    println(x)

    val(first, second, third) = v

    val symbols = Array("<", "-", ">")
    val counts = Array(2,10,2)
    val pairs = symbols.zip(counts)

    println(pairs)
    pairs.foreach(println)

    for((s,n) <- pairs)print(s*n)

    def divide10(x: Int):Tuple2[Int,Int] = (x/10, x%10)
    val(tens, ones) = divide10(99)
    println(divide10(99))
  }

}
