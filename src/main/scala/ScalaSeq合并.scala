object ScalaSeq合并 {
  def main(args: Array[String]): Unit = {
    val x = 2000 * None
    println(10000000 > x)


    val a = Seq((1, "a", 2))
    val b = Seq((2, "b", 3))
    println(a ++ b)
  }

}
