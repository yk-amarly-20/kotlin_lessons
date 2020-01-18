class Rational(val n: Int, val d: Int) {
    init {
        require(d != 0, {"denominator must not zero"})
    }

    private val g by lazy {gcd(Math.abs(n), Math.abs(d))}
    val numerator = n / g
    val denominator = d / g

    operator fun plus(that: Rational): Rational =
        Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator
        )

    operator fun plus(n: Int): Rational =
        Rational(numerator + n * denominator, denominator)

    override fun toString(): String = "${numerator} / ${denominator}"

    tailrec private fun gcd(a: Int, b: Int): Int =
        if (b == 0) a
        else gcd(b, a % b)

}

fun main(args: Array<String>) {
    var half = Rational(1, 2)
    println(half)

    val num = Rational(2, 8)
    println(num)

    println(half + num)
    println(half + 2)
}
