import scala.annotation.tailrec

/**
  * リストのK番目の値を取得してください
  * 簡単のために最初のエレメントを0として構いません
  * Example:
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */
object P03 extends App {

  @tailrec
  def nth[E](n: Int, list: List[E]) : E = (n, list) match {
    case (0, x::xs) => x
    case (k, x::xs) => nth(k - 1, xs)
    case _ => throw new IllegalArgumentException(s"${(n, list)}は不正な引数です")
  }

  println(nth(2, List(1, 1, 2, 3, 5, 8)))
}
