import scala.annotation.tailrec

/**
  * リストの最後の要素を取得してください
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  */
object P01 extends App {

  @tailrec
  def last[E](list: List[E]): E = list match {
    case s :: Nil => s
    case s :: xs => last(xs)
    case _ => throw new IllegalArgumentException(s"${list}は不正な引数です")
  }

  println(last(List(1, 1, 2, 3, 5, 8)))
}
