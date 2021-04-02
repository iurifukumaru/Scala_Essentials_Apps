package part04

object P05ChallengeListCount {
  def main(args: Array[String]): Unit = {
    var grades = List(100,99,75,67,89,85,92,93,60,97)
    for(g <- grades) if(g > 92) println("Your grade is: A")
    else if(g > 85) println("Yor grade is: B")
    else if(g > 76) println("Yor grade is: C")
    else if(g > 59) println("Yor grade is: D")
    else println("Yor grade is: E")

    var count = 0.0
    for(g <- grades) count = count + 1
    var sum = grades.foldLeft(0.0)(_+_)
    def average(c: Double): Double = sum/c
    println(average(count))
  }

}
