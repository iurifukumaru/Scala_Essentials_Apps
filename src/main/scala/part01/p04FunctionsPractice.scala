package part01

object p04FunctionsPractice {
  def main (args: Array[String]): Unit = {
    def abs(x: Int) = if(x < 0) -x else x
    println(abs(-5))

    def factorial1(n: Int) = {
      var r = 1
      for(i <- 1 to n)
        r = r * i
        r
    }
    println(factorial1(5))

    def factorial2(n: Int): Int = if(n<=0) 1 else n * factorial2(n-1)
    println(factorial2(4))

    def printName(firstName: String, lastName: String): Unit = {
      println(firstName+" "+lastName)
    }
    printName("Iuri","Fukumaru")

    def sum(args: Int*) = {
      var result = 0
      for(arg <- args) result += arg
      result
    }
    println(sum(1,2,3,4,5))

  }
}
