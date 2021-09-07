package com.knoldus.calculations
import org.scalatest.flatspec.AnyFlatSpec

class PalindromeAndFactorialTest extends AnyFlatSpec {

  "number" should "not be a palindrome number" in {
    val obj = new PalindromeAndFactorial
    assert(!obj.palindrome(9643))
  }

  "number" should "not be a palindrome number as it a negative number" in {
    val obj = new PalindromeAndFactorial
    assert(!obj.palindrome(-9643))
  }

  "number" should "be a palindrome number as 0 is palindrome" in {
    val obj = new PalindromeAndFactorial
    assert(obj.palindrome(0))
  }

  "number" should "be a palindrome number" in {
    val obj = new PalindromeAndFactorial
    assert(obj.palindrome(12321))
  }

  "condition" should "be invalid as 5 will not return 120" in {
    val obj = new PalindromeAndFactorial
    assert(!(120==obj.factorial(6)))
  }

  "condition" should "be valid as 0 will return 1" in {
    val obj = new PalindromeAndFactorial
    assert(1==obj.factorial(0))
  }

  "condition" should "be valid as 6 will return 120" in {
    val obj = new PalindromeAndFactorial
    assert(120==obj.factorial(5))
  }
}
