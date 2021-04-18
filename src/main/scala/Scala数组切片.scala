object Scala数组切片 {
  def main(args: Array[String]): Unit = {
    val string = "0cb30a99cf7c293a_b1ed657e_total"
    val keys = string.split("_")
    println(keys.mkString("Array(", ", ", ")"))
    println(keys.slice(1, keys.size).mkString("_")) // slice(1, 3)则取第二个第三个元素
  }

}
