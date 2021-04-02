package part04

object p01PrimeNumbers {
  def main (args: Array[String]): Unit = {
    def divisors(n: Int) = for(i <- List.range(1, n+1) if n % i == 0) yield i

    def isPrime(n: Int) = divisors(n).length == 2

    println(divisors(12))
    println(isPrime(12))

    if(isPrime(20)) println("It is a prime number") else println("It is not prime")


  }
}
