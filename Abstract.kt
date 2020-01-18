// 抽象クラス
// scalaとだいたい同じ

abstract class Greeter(val target: String) {
    abstract fun sayHello()
}

class EnglishGreeter(target: String): Greeter(target) {
    override fun sayHello() {
        println("Hello $target!" )
    }
}

class JapaneseGreeter(target: String): Greeter(target) {
    override fun sayHello() {
        println("こんにちは $target!")
    }
}
