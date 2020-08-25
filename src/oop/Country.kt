package oop

class Country(val name: String, var population: Long) {
    constructor(): this("N/A", 0) {

    }

}


class City(val name: String? = "", var population: Long? = null) {

}



fun main() {
    var c = Country("Canada", 100_000_000)
    println("New country ${c.name} with population ${c.population}")


    println("Secondary constructor")
    val c1 = Country()
    println("New country ${c1.name} with population ${c1.population}")


//    c1.name = "New name" //don't even try. the name field is final
    c1.population = 1_000_000
    println("New country ${c1.name} with population ${c1.population}")
}

