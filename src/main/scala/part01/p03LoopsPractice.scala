package part01

object p03LoopsPractice {
  def main (args: Array[String]): Unit = {
    var x = 10
    while (x >= 1) {
      println(x)
      x -= 1
    }
    println("BlastOff")

    var y = 10
    do {
      println(y)
      y -= 1
    } while (y >= 1)


    for(z <- 100 to 90 by -1) {
      println(z)
    }

    var xx = for(num <- 1 to 10) yield num + 1
    println(xx)

    var word = "Monday"
    for(x <- 0 until word.length) {
      println(word(x))
    }

  }
}
