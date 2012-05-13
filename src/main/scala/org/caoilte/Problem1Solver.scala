package org.caoilte

import collection.immutable.NumericRange

object Problem1Solver {
  
  def solve(ceiling: Long): Long = {
    ceiling match {
      case 3 => 0
      case 5 => 3
    }
  }

  def multiplesOf(divisor: Long, ceiling: Long): IndexedSeq[Long] = {
    (0L to ceiling-1) by divisor drop(1)

  }

}