package basics


fun main() {
    val a: String? = null
    val b: String? = ""
    val c: String? = "hey"

    val size_a = a?.length?:0
    val size_b = b?.length?:0
    val size_c = c?.length?:0

    println(size_a + size_b + size_c)


    val overall_size = (a?.length?:0) + (b?.length?:0) + (c?.length?:0)

    println(a!!.length)

    println(overall_size)
}