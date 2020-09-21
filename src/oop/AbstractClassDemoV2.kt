package oop



abstract class Transport(open val name: String) {
    abstract fun drive()
}


class Car(override var name: String): Transport(name) {
    override fun drive() {
        println("Car works")
    }

    fun startEngine() {
        println("Engine works")
    }

}


class Bicycle: Transport("BICYCLE") {
    override fun drive() {
        println("Bicycle works")
    }

}


fun main() {
    var c: Transport = Car("Wrong name")
//    c.name = "Car" //throws error


    //мы можем проверить тип и через smart cast присвоить значение
    if(c is Car)
        c.name = "Car1"


    if(c !is Car) return
    c.name = "Car2"

    //теперь можно вызывать метод после smart cast
    c.startEngine()



}