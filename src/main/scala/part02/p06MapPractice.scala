package part02

object p06MapPractice {
  def main (args: Array[String]): Unit = {
    var groceries = Map(1->"milk", 2->"bread", 3->"juice", 4->"eggs")
    println(groceries)
    groceries = groceries + (5->"hashbrowns")
    println(groceries)

    println(groceries.get(3))
    println(groceries(3))
    println(groceries.getOrElse(6,"No Match"))

    for(v <- groceries.values) println(v)

    var z = for((k,v) <- groceries) yield (v,k)

    println(groceries)
    println(z)



  }

}
