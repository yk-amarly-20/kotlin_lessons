// 拡張関数
// Stringを拡張して関数を追加する

fun String.countWords(): Int =
    this.split("""\s+""".toRegex()).size

// 拡張プロパティ
val String.wordsCount: Int
    get() = split("""\s+""".toRegex()).size

fun main(args: Array<String>) {
    val str = "I like Kotlin"

    println(str.countWords())
}
