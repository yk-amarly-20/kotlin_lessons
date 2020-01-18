// ジェネリクス

class Container<T>(var value: T) {
    // 反変
    fun copyTo(to: Container<in T>) {
        to.value = value
    }
}

fun <T> box(value: T): Container<T> =
    Container<T>(value)

fun main(args: Array<String>) {
    val intContainer: Container<Int> = Container<Int>(123)
    val strContainer: Container<String> = Container<String>("Hello")

    println(intContainer.value)
    println(strContainer.value.toUpperCase())

    val container = box(5)
    println(container.value)
}

// 共変
fun show(container: Container<out Any>) {
    println(container.toString())
    println(container.hashCode())
    println(container.value)
}
