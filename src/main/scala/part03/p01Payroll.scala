package part03

import part03.Employee.newEEID

object p01Payroll extends App {
  def e1 = new Employee("Iuri", "Fukumaru")
  def e2 = new Employee("Harue", "Fukumaru", 'y')
  println(e1)
  println(e2)

}

class Employee(val fName: String, val lName: String, var Salaried: Char = 'n') {
  var employeeID = Employee.newEEID()
  override def toString = "Employee name: " + fName + " " + lName +
      (if(Salaried == 'n') "\n Hourly Employee" else "\n Salaried Employee") +
  "\nEmployeeID: " + employeeID +
    "\n" + "="*20
}

object Employee {
  var employeeID = 0
  def newEEID() = {employeeID += 1
  employeeID}

}
