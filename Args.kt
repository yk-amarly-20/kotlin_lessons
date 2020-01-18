// 可変長引数

fun sum(vararg ints: Int): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

// 再帰呼び出し

fun sum(numbers: List<Int>): Int {
    var sum =
        if (numbers.isEmpty()) 0
        else numbers.first() + sum(numbers.drop(1))

    return sum
}

// 末尾呼び出し最適化

tailrec fun sum(numbers: List<Long>, accumurator: Long = 0): Long =
    if (numbers.isEmpty()) accumurator
    else sum(numbers.drop(1), accumurator + numbers.first())

// 変数の隠蔽

fun sum(numbers: List<Long>): Long {
    tailrec fun go(numbers: List<Long>, accumurator: Long): Long =
        if (numbers.isEmpty()) accumurator
        else go(numbers.drop(1), accumurator + numbers.first())
    return go(numbers, 0)
}


fun main(args: Array<String>) {
    var ints = intArrayOf(1, 2, 3)
    var sum = sum(*ints)
    println(sum)

    var numbers = (1 .. 10).toList()
    println(sum(numbers))
}
