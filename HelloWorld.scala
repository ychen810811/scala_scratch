object Timer {
    def oncePerSecond(callback: () => Unit) {
        while (true) { callback(); Thread sleep 1000 }
    }
    def main(args: Array[String]) {
        oncePerSecond(() => println("time flies like an arrow..."))
    }
}

class Complex(real: Double, imaginary: Double) {
    def re = real
    def im = imaginary
    override def toString() =
        "" + re + (if (im < 0) "" else "+") + im + "i"
}

object ComplexNumber {
    def main(args: Array[String]) {
        val c = new Complex(1.2, 3.4)
        println("imaginary part: " + c.im)
        println(c.toString())
    }
}
