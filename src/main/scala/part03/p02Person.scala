package part03

object p02Person {
  def main (args: Array[String]): Unit = {
    val alice = Person("Alice", 10)
    val rabbit = Person("Rabbit", 20)
    val carla = Person("Carla", 30)

    for(person <- List(alice, rabbit, carla)) {
      person match {
        case Person("Alice", 10) => println("Hi, Alice!")
        case Person("Rabbit", 20) => println("Hi, Rabbit!")
        case Person("Carla", 30) => println("Hi, Carla!")
      }
    }

  }

}

case class Person(str: String, i: Int)
