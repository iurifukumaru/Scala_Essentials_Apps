package part02

object p04PatternMatching {
  def main (args: Array[String]): Unit = {
    def greekAlphabet(letter:Char) = {
      letter match {
        case 'a' | 'A' => "Alpha"
        case 'b' | 'B' => "Beta"
        case _ => println("You entered an invalid character")
      }
    }
    println("The greek letter for A is " + greekAlphabet('A'))
    println("The greek letter for C is " + greekAlphabet('c'))

    def max(x:Int, y:Int) = x>y match {
      case true => x
      case false => y
    }
    println(max(5,20))
    println(max(50,20))
  }

}
