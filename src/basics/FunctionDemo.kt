package basics

fun main() {

//    println(basics.sub("hey"))
//    println(basics.sum(1, 2, 3, 4))
//    basics.defaultParamDemo("Ivan", "Ivanov", "Soyer")
    defaultParamDemo(pattronymic = "Soyer")
}


fun min(a: Int, b: Int) : Int = if(a < b) a else b


fun sub(s : String) : String = s.substring(0, min(5, s.length))

fun sum(vararg numbers: Int) : Int {
    var sum: Int = 0
    for(num in numbers) {
        sum += num
    }
    return sum
}


fun defaultParamDemo(firstName : String = "", lastName: String = firstName, pattronymic: String = firstName) {
    println("Fullname is $firstName $lastName $pattronymic")
}