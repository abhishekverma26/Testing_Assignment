package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplUnitTest extends AnyFlatSpec {

  val mockedUserValidator = mock[UserValidator]
  val abhishekUser: User = User("Abhishek","Verma",24,"knoldus","abhishek.verma@knoldus.com")

  "User" should "be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(abhishekUser)) thenReturn(true)
    val result = userImpl.createUser(abhishekUser)
    assert(!result.isEmpty)
  }

  "User" should "not be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(abhishekUser)) thenReturn(false)
    val result = userImpl.createUser(abhishekUser)
    assert(result.isEmpty)
  }

}
