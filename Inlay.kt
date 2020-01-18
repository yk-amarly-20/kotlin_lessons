// 中置き呼び出し

class MyInt(val value: Int) {
    infix fun plus(that: MyInt): MyInt =
        MyInt(value + that.value)
}

fun main(args: Array<String>) {
    println((MyInt(3) plus MyInt(6)).value)
}
