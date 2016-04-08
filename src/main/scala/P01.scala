import scala.annotation.tailrec

/**
  * リストの最後の要素を取得せよ
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  */
object P01 extends App {

  @tailrec
  def last[E](l: List[E]): E = l match {
    case s :: Nil => s
    case s :: xs => last(xs)
  }

  println(last(List(1, 1, 2, 3, 5, 8)))
}
