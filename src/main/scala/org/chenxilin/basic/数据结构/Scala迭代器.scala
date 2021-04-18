package org.chenxilin.basic.数据结构

object Scala迭代器 {
  def main(args: Array[String]): Unit = {
    // 迭代器的基本操作()
    查找迭代器的最大最小值长度()
  }

  def 迭代器的基本操作(): Unit = {
    val it = Iterator("Baidu", "Google", "Taobao")
    while (it.hasNext) println(it.next())
  }

  def 查找迭代器的最大最小值长度(): Unit = {
    // 注意：计算完ita.max 如果想再计算ita.min 会报错 因为此时已经ita迭代完了
    val ita = Iterator(1, 3, 2, 11, 100, 30, 9)
    val itb = Iterator(11, 13, 12, 121, 1001, 302, 19)
    val itc = Iterator(11, 12, 121, 1001, 302, 19)
    println(s"最大值 ${ita.max}, 最小值 ${itb.min}, 长度 ${itc.size}")
  }
}

/* 迭代器常见操作
序号	方法及描述
1
def hasNext: Boolean

如果还有可返回的元素，返回true。

2
def next(): A

返回迭代器的下一个元素，并且更新迭代器的状态

3
def ++(that: => Iterator[A]): Iterator[A]

合并两个迭代器

4
def ++[B >: A](that :=> GenTraversableOnce[B]): Iterator[B]

合并两个迭代器

5
def addString(b: StringBuilder): StringBuilder

添加一个字符串到 StringBuilder b

6
def addString(b: StringBuilder, sep: String): StringBuilder

添加一个字符串到 StringBuilder b，并指定分隔符

7
def buffered: BufferedIterator[A]

迭代器都转换成 BufferedIterator

8
def contains(elem: Any): Boolean

检测迭代器中是否包含指定元素

9
def copyToArray(xs: Array[A], start: Int, len: Int): Unit

将迭代器中选定的值传给数组

10
def count(p: (A) => Boolean): Int

返回迭代器元素中满足条件p的元素总数。

11
def drop(n: Int): Iterator[A]

返回丢弃前n个元素新集合

12
def dropWhile(p: (A) => Boolean): Iterator[A]

从左向右丢弃元素，直到条件p不成立

13
def duplicate: (Iterator[A], Iterator[A])

生成两个能分别返回迭代器所有元素的迭代器。

14
def exists(p: (A) => Boolean): Boolean

返回一个布尔值，指明迭代器元素中是否存在满足p的元素。

15
def filter(p: (A) => Boolean): Iterator[A]

返回一个新迭代器 ，指向迭代器元素中所有满足条件p的元素。

16
def filterNot(p: (A) => Boolean): Iterator[A]

返回一个迭代器，指向迭代器元素中不满足条件p的元素。

17
def find(p: (A) => Boolean): Option[A]

返回第一个满足p的元素或None。注意：如果找到满足条件的元素，迭代器会被置于该元素之后；如果没有找到，会被置于终点。

18
def flatMap[B](f: (A) => GenTraversableOnce[B]): Iterator[B]

针对迭代器的序列中的每个元素应用函数f，并返回指向结果序列的迭代器。

19
def forall(p: (A) => Boolean): Boolean

返回一个布尔值，指明 it 所指元素是否都满足p。

20
def foreach(f: (A) => Unit): Unit

在迭代器返回的每个元素上执行指定的程序 f

21
def hasDefiniteSize: Boolean

如果迭代器的元素个数有限则返回 true（默认等同于 isEmpty）

22
def indexOf(elem: B): Int

返回迭代器的元素中index等于x的第一个元素。注意：迭代器会越过这个元素。

23
def indexWhere(p: (A) => Boolean): Int

返回迭代器的元素中下标满足条件p的元素。注意：迭代器会越过这个元素。

24
def isEmpty: Boolean

检查it是否为空, 为空返回 true，否则返回false（与hasNext相反）。

25
def isTraversableAgain: Boolean

Tests whether this Iterator can be repeatedly traversed.

26
def length: Int

返回迭代器元素的数量。

27
def map[B](f: (A) => B): Iterator[B]

将 it 中的每个元素传入函数 f 后的结果生成新的迭代器。

28
def max: A

返回迭代器迭代器元素中最大的元素。

29
def min: A

返回迭代器迭代器元素中最小的元素。

30
def mkString: String

将迭代器所有元素转换成字符串。

31
def mkString(sep: String): String

将迭代器所有元素转换成字符串，并指定分隔符。

32
def nonEmpty: Boolean

检查容器中是否包含元素（相当于 hasNext）。

33
def padTo(len: Int, elem: A): Iterator[A]

首先返回迭代器所有元素，追加拷贝 elem 直到长度达到 len。

34
def patch(from: Int, patchElems: Iterator[B], replaced: Int): Iterator[B]

返回一个新迭代器，其中自第 from 个元素开始的 replaced 个元素被迭代器所指元素替换。

35
def product: A

返回迭代器所指数值型元素的积。

36
def sameElements(that: Iterator[_]): Boolean

判断迭代器和指定的迭代器参数是否依次返回相同元素

37
def seq: Iterator[A]

返回集合的系列视图

38
def size: Int

返回迭代器的元素数量

39
def slice(from: Int, until: Int): Iterator[A]

返回一个新的迭代器，指向迭代器所指向的序列中从开始于第 from 个元素、结束于第 until 个元素的片段。

40
def sum: A

返回迭代器所指数值型元素的和

41
def take(n: Int): Iterator[A]

返回前 n 个元素的新迭代器。

42
def toArray: Array[A]

将迭代器指向的所有元素归入数组并返回。

43
def toBuffer: Buffer[B]

将迭代器指向的所有元素拷贝至缓冲区 Buffer。

44
def toIterable: Iterable[A]

Returns an Iterable containing all elements of this traversable or iterator. This will not terminate for infinite iterators.

45
def toIterator: Iterator[A]

把迭代器的所有元素归入一个Iterator容器并返回。

46
def toList: List[A]

把迭代器的所有元素归入列表并返回

47
def toMap[T, U]: Map[T, U]

将迭代器的所有键值对归入一个Map并返回。

48
def toSeq: Seq[A]

将代器的所有元素归入一个Seq容器并返回。

49
def toString(): String

将迭代器转换为字符串

50
def zip[B](that: Iterator[B]): Iterator[(A, B)

返回一个新迭代器，指向分别由迭代器和指定的迭代器 that 元素一一对应而成的二元组序列
 */