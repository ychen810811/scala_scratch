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
      val z: Array[Int] = Array(8, 5, 4, 1, 16, 20, 100, 70)
      println(sort(z))
    }

}
