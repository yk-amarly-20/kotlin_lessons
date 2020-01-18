// クラスの継承
// openがいる

open class Person(val name: String) {
    open fun introduceMyself() {
        println("I am $name")
    }
}

class Student(name: String, val id: Long): Person(name){
    override fun introduceMyself() {
        println("I am $name(id=$id)")
    }
}

class Teacher(name: String): Person(name) {
    override fun introduceMyself() {
        println("自己紹介ここから")
        super.introduceMyself()
    }
}

fun main(args: Array<String>) {
    val person: Person = Person("ゆたか")
    person.introduceMyself()

    val student: Student = Student("くみこ", 123)
    student.introduceMyself()
}
