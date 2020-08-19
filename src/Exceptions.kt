import java.lang.Exception

fun main() {
    println(sum(a = "1", b = "2"))
}


fun sum(a: String, b: String): Int {
    return try {
        var intA = a.toInt()
        var intB = b.toInt()
        intA + intB
    } catch (e: Exception) {
        0
    }
}