package oop

class User {
    var age: Int = 0
    set(value) {
        if (value > 0) field = value
    }


    var name: String? = null
    get() {
        return if (field == null) {
            "No name"
        } else {
            field
        }
    }

}

//fun basics.functional.main() {
//    val u = User()
//    u.age = -1
//    u.name = null
//
//    println("User name ${u.name} and age ${u.age}")
//}


class Pet {
    var name: String? = null
    get() {
       return field?.capitalize()
    }

    var age: Int = 0
    set(value) {
        if(value > 0) field = value
    }

    var weight: Int = 0
    set(value) {
        if(value > 0) field = value
    }




}


fun main() {
    var p = Pet()
    p.name = "chizh"
    p.age = -1
    p.weight = -20

    println("New pet ${p.name} has ${p.weight} kilos and age ${p.age}")
}