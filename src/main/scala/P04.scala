import scala.annotation.tailrec

/**
  * リストの要素の数を取得してください
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  */
object P04 extends App {

  def length[E](list: List[E]): Int = lengthRec(0, list)

  @tailrec
  def lengthRec[E](count: Int, list: List[E]): Int = (count, list) match {
    case (n, List()) => n
    case (n, x :: xs) => lengthRec(n + 1, xs)
    case _ => throw new IllegalArgumentException(s"${(count, list)}は不正な引数です")
  }

  println(length(List(1, 1, 2, 3, 5, 8)))

}
