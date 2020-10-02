package oop

class Dog1 {
    lateinit var name: String

    fun showName() {
        name + "_dog"
        println(name)
    }
}

fun main() {
    val d = Dog1()
    d.name = "Diego"
    d.showName()

}