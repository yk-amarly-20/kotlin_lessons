// 変位指定について
// すぐ忘れそうなので軽く試す

fun main(args: Array<String>) {

    // StringはAnyのサブクラス
    val str:String = "aaa"
    val any: Any = str    // これは実行可能

    // MutableListはサブクラスにはならない
    val stringList = mutableListOf<String>("aaa", "bbb")
    val anyList:MutableList<Any> = stringList   // これはダメ
    anyList.add(12)   // これが安全じゃないから

    // 以上は不変(デフォルト)

    // 共変お試し
    val cats = AnimalGroup(listOf(Cat(), Cat()))
    val animals: AnimalGroup<Animal> = cats    // これはok

    // 反変お試し
    val anyComparator: MyComparator<Any> = object : MyComparator<Any> {
        override fun compare(e1: Any, e2: Any): Int {
            return e1.hashCode() - e2.hashCode()
        }
    }

    anyComparator.compare("test", "aaa")

    val stringComparator: MyComparator<String> = anyComparator  // これはok
}

// 以下共変の作り方
// Listはデフォルトで共変

open class Animal {
    fun feed() {
        println("feed")
    }
}

class Cat: Animal() {}

class AnimalGroup<out T : Animal>(val animals: List<T>) {
    val size: Int get() = animals.size

    operator fun get(i: Int): T {
        return animals[i]
    }
}

// 以下反変の作り方

interface MyComparator<in T> {
    fun compare(e1: T, e2: T): Int
}
