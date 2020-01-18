// 安全呼び出し

fun square(i: Int): Int = i * i

fun main(args: Array<String>) {
    val a: Int? = 5
    val aSquare = a?.let {square(it)}

    println(aSquare)

    // !!演算子
    // Nullableに対して使うとNotNullに強制変換
    val foo: String? = "hoge"
    val bar: String = foo!!
    println(bar)
    // 危険だからあんま使わない方がいい

    // requireNotNullを推奨
    val hoge: String? = null
    val fuga: String = requireNotNull(hoge, {"hogeはnullじゃダメ"})
    println(fuga)

    // エルビス演算子
    // 変数に対してnullでなければその値、nullであればdefault値を代入
    val b1: String? = "fuga"
    val c1: String = b1 ?: "default"

    val b2: String? = null
    val c2: String = b2 ?: "default"

    println(c1)
    println(c2)
}
