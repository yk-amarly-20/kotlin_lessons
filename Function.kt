// 高階関数

fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            predicate(str.first()) -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}

fun firstK(str: String): Int {
    fun isK(c: Char): Boolean = c == 'K'
    return first(str, ::isK)
}

// ラムダ式

fun firstWhitespace(str: String): Int =
    first(str, {it.isWhitespace()})
