package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplIntegrationTest extends AnyFlatSpec {

  val companyName = new CompanyReadDto
  val validateEmail = new EmailValidator
  val userValidator = new UserValidator(companyName,validateEmail)

  val userImpl = new UserImpl(userValidator)

  "User" should "not be created as company does not exists in DB" in {
    val aakashUser: User = User("Aakash","Verma",26,"Google","aakash.verma@gmail.com")

    val result = userImpl.createUser(aakashUser)
    assert(result.isEmpty)
  }

  "User" should "not be created as email id is not valid" in {
    val shubhamUser: User = User("Shubham","saini",23,"Knoldus","shubham.saini@knoldus")

    val result = userImpl.createUser(shubhamUser)
    assert(result.isEmpty)
  }

  "User" should "not be created as company does not exists in DB and email id is not valid" in {
    val abhishekUser: User = User("Abhishek","Verma",24,"IBM","abhishek.verma@ibm")

    val result = userImpl.createUser(abhishekUser)
    assert(result.isEmpty)
  }

  "User" should "be created" in {
    val abhishekUser: User = User("Abhishek","Verma",24,"Knoldus","abhishek.verma@knoldus.com")

    val result = userImpl.createUser(abhishekUser)
    assert(!result.isEmpty)
  }

}