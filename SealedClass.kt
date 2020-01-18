// sealed class

sealed class MyList<out T> {
    object Nil: MyList<Nothing>() {
        override fun toString() = "Nil"
    }

    class Cons<T>(val head: T, val tail: MyList<T>): MyList<T>() {
        override fun toString() = "$head:$tail"
    }
}


