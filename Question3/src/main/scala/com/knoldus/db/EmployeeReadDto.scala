package com.knoldus.db

import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val abhishekEmployee: Employee = Employee("Abhishek","Verma",24,12000,"Intern","knoldus","abhishek.verma@knoldus.com")
  val akshayEmployee: Employee = Employee("Akshay","Choudhary",23,15000,"Data Engineer","Absolutdata","akshay.chaudhary@absolutdata.com")

  val employees: HashMap[String, Employee] = HashMap("Abhishek" -> abhishekEmployee, "Akshay" -> akshayEmployee)
  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
