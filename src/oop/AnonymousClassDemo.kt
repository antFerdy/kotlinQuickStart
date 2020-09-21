package oop



fun travelOnce(transport: Transport) {
    transport.drive()
}

fun main() {
    //нам надо обязательно предоставить реализацию класса транспорт
    var c = Car("")
    travelOnce(c)

    //анонимный класс вместо наследования
    travelOnce(object : Transport("Car") {
        override fun drive() {
            println("The $name works")
        }

    })

}