package part02

import io.Source._

object p02ReadFromFilePractice {
  def main (args: Array[String]): Unit = {
    val fileName = "src/main/resources/rainbow.txt"
    for(line <- fromFile(fileName).getLines()){
      println(line.toUpperCase)
    }

    val poemLines = fromFile("src/main/resources/poem.txt").getLines().toList
    println(poemLines)
    poemLines.foreach(println)

  }
}
