package part02

object p10ChallegePart2 {
  def main(args: Array[String]): Unit = {

    def avgg(input: Array[Int]): Double = {
      var sum = 0
      for(v <- input) yield sum +=v
      sum/input.length
    }
    def minn(input: Array[Int]): Int = {
      var m = input(0)
      for(v <- input if v<m) m = v
      m
    }

    def maxx(input: Array[Int]): Int = {
      var m = input(0)
      for(v <- input if v>m) m = v
      m
    }

    var array1 = Array(1,2,3,4,5,6,7,8,9,10)

    println("Solution #1:")
    println("The minimum value of Array1 is: " + minn(array1))
    println("The maximun value of Array1 is: " + maxx(array1))
    println("The average value of Array1 is: " + avgg(array1))

    println("Solution #2:")
    var list1 = array1.toList
    println("The minimum value of Array1 is: " + list1.min)
    println("The maximun value of Array1 is: " + list1.max)
    println("The sum value of Array1 is: " + list1.sum)
    println("The average value of Array1 is: " + list1.sum/list1.size)


  }

}
