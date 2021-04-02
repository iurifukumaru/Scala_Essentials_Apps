package part02

object p08ArrayPractice {
  def main (args: Array[String]): Unit = {
    var nums = new Array[Any](10)
    var furniture = Array("chair", "sofa", "table", "bed")

    for(f <- furniture) println(f)
    furniture(0)

    var a = Array(1,2,3,4,5)
    println(a)
    for(f <- a) yield f*2
    println(a.toList)

    var even = for(f <- a if f%2 == 0) yield f
    println(even)
    println(even.toList)


  }

}
