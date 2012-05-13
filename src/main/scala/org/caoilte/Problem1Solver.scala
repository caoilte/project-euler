package org.caoilte

object Problem1Solver {

  def multiplesOfThreeOrFiveBelow(ceiling: Long): IndexedSeq[Long] = {
    (0L to ceiling-1) filter (x => x%3==0 || x%5==0) drop(1)
  }

  def apply(ceiling: Long): Long = {
    multiplesOfThreeOrFiveBelow(ceiling) sum
  }

}