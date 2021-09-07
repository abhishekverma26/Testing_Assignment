package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadDto {

  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val absolutdataCompany: Company = Company("Absolutdata", "absolutdata@gmail.com", "Gurugram")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Absolutdata" -> absolutdataCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
