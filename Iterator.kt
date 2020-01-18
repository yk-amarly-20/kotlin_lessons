class MyIterator {
    operator fun hasNext(): Boolean = (Math.random() < 0.5)
    operator fun next(): String = "Hello"
}

class MyIterable() {
    operator fun iterator() = MyIterator()
}

fun main(args: Array<String>) {
    for (item in MyIterable()) {
        println(item)
    }
}
