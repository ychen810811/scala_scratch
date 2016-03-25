object Sort {
    def sort(xs: Array[Int]): Array[Int] = {
        if (xs.length <= 1) xs
        else {
            val pivot = xs(xs.length / 2)
            Array.concat(
                sort(xs filter (pivot >)),
                xs filter (pivot ==),
                sort(xs filter (pivot <))
                )
        }
    }
    def main(args: Array[String]): Unit = {
        val z: Array[Int] = Array.fill(10){scala.util.Random.nextInt(100)}
        print(sort(z).mkString(" ") + "\n")
    }

}


trait Ord {
    def < (that: Any): Boolean
    def <=(that: Any): Boolean = (this < that) || (this == that)
    def > (that: Any): Boolean = !(this <= that)
    def >=(that: Any): Boolean = !(this < that)
}

class Pair(k: Int, v: String) extends Ord {
    def key = k
    def value = v
    override def toString(): String = key + "=>" + value
    override def ==(that: Any): Boolean =
        that.isInstanceOf[Pair] && {
            val o = that.asInstanceOf[Date]
            o.key == key
        }
    override def <(that: Any): Boolean =
        that.isInstanceOf[Pari] && {
            val o = that.asInstanceOf[Date]
            o.key > key
        }
}

object Order {
    def main(args: Array[String]) {
        val t = Array[Pair](Pair(3, "hello"), Pair(4, "kick"), Pair(1, "oooops"), Pair(0, "fcuk"))
        println(t)
    }
}
