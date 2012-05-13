package org.caoilte

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.caoilte.Problem1Solver._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class Problem1Tests extends FunSuite with ShouldMatchers {
  

  test("multiples of 3 below 3 should be 0") {
    Problem1Solver.multiplesOf(3, 3) should equal (Nil);
  }
  
  test("multiples of 3 below 5 should be 3") {
    Problem1Solver.multiplesOf(3, 5) should equal (List(3));
  }

  test("multiples of 3 below 10 should be 3,6 and 9") {
    Problem1Solver.multiplesOf(3, 10) should equal (List(3,6,9));
  }

  test("multiples of 5 below 10 should be 5") {
    Problem1Solver.multiplesOf(5, 10) should equal (List(5));
  }
}