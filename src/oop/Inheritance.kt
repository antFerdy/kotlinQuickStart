package oop

open class Animal(val name: String, var weight: Float, val habitat: String) {
    open fun eat() {
        println("Eating")
    }

    open fun run() {
        println("Running")
    }
}


class Dog(weight: Float): Animal("Dog", weight, "land") {

    override fun eat() {
        println("Wo wo wo")
    }

    override fun run () {
        println("I am running! wo wo wo!")
    }

}


fun main() {
    val a: Animal = Dog(12.2F)
    a.eat()
    a.run()

}