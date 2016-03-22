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
