package org.caoilte

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.caoilte.Problem1Solver._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class Problem1Tests extends FunSuite with ShouldMatchers {


  test("multiples of 3 and 5 below 10 should be 5") {
    Problem1Solver.multiplesOfThreeOrFiveBelow(10) should equal (List(3,5,6,9));
  }

  test("sum of all the multiples of 3 or 5 below 10 should be 23") {
    Problem1Solver(10) should equal (23)
  }

  test("print out sum of the multiples of 3 or 5 below 1000") {
    System.out.println(Problem1Solver(1000))
  }
}