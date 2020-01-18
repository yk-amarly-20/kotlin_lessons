// NULL安全

fun main(args: Array<String>) {
    var s1: String = null // コンパイルエラー

    var s2: String? = null // ok

    var s3: String? = "hoge"
    var s4 = s3.toUpperCase()  // コンパイルエラー

    // Nullableのメソッドやプロパティにアクセスできない

    val a: String? = null
    val b: String? = "hoge"

    // スマートキャスト
    if (a != null) {
        println(a.toUpperCase())
    }

    if (b != null) {
        println(b.toUpperCase())
    }
}
