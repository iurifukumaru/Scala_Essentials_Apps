package part02

object p09ListPractice {
  def main (args: Array[String]): Unit = {
    var list1 = List(10,8.5,'d')
    var list2 = 1::2::3::4::5::Nil
    var list3 = List.range(10,20)
    var list4 = list1 ::: list3
    var list5 = List((1,2), (3,4), (5,6))

    println(list1)
    println(list2)
    println(list3)
    println(list4)

    var sum = 0
    list3.foreach(sum+=_)
    println(sum)

    var list6 = for((a,b) <- list5) yield a+b
    println(list6)





  }

}
