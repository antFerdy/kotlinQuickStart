package oop

import java.time.LocalDate

class Cat(val name: String, var age: Int, var weight: Int) {

    //property
    var isOverweight: Boolean = false
        get() = weight > 5

    //methods
    fun printInfo() {
        println("Кличка: $name, возраст: $age, вес: $weight")
    }

    fun isOld(): Boolean {
        return age > 4
    }

}


class Employee(val name: String, var position: String, private val startDate: String) {
    val experience: Int
    get() = LocalDate.now().year - LocalDate.parse(startDate).year
}

fun main() {
    val c = Cat("Korzh", 1, 4)
    c.printInfo()

// we can extend methods with extension functions
//    fun Cat.isYoung(): Boolean {
//        return this.age <= 4
//    }
//    println(c.isYoung())


//    println(c.isOverweight) //false
//    c.weight = 7
//    println(c.isOverweight) //expected true, but get still false


    val programmer = Employee("Zhunus", "Senior dev", "2012-11-01")
    println(programmer.experience)





}