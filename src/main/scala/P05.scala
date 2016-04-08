import scala.annotation.tailrec

/**
  * リストを反転してください
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
object P05 extends App {

  def reverse[E](list: List[E]): List[E] = list match {
    case List(x) => List(x)
    case x :: xs => reverse(xs) ::: List(x)
    case _ => throw new IllegalArgumentException(s"${list}は不正な引数です")
  }

  println(reverse(List(1, 1, 2, 3, 5, 8)))

}
