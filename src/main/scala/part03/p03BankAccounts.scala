package part03

import part03.Account.accountNumber

object p03BankAccounts {
  def main (args: Array[String]): Unit = {
    val c1 = new Account("Iuri", 1000)
    val c2 = new Account("Harue", 2000)
    val c3 = new Account("Nil", 3000, 's')
    val c4 = new Account("Fuka", 4000, 's')
    List(c1,c2,c3,c4).foreach(println)
  }

}

case class Account(name: String, balance: Int, typeOfAcct: Char = 'c') {
  var accountNumber = Account.nextAcctNum()
  override def toString = "Client name: " + name + " balance: $" + balance +
    (if(typeOfAcct == 'c') "\n Chequing" else "\n Savings") +
    "Account number: " + accountNumber + "\n" + "*"*30
}
object Account {
  var accountNumber = 5000
  def nextAcctNum() = {
    accountNumber += 1
    accountNumber
  }
}
