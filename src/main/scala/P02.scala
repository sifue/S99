import scala.annotation.tailrec

/**
  * 最後から二番目の値を取得せよ
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */
object P02 extends App {

  @tailrec
  def penultimate[E](list: List[E]): E = list match {
    case x1 :: x2 :: Nil => x1
    case x :: xs => penultimate(xs)
  }

  println(penultimate(List(1, 1, 2, 3, 5, 8)))
}
