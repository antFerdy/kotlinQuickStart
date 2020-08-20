fun main() {
    val sum = {a: Int, b: Int -> a + b}

    val sum1: (Int, Int) -> Int = {a: Int, b: Int -> a + b}

    val square: (Int) -> Int = {x -> x*x}

    val squareShortVersion: (Int) -> Int = { it * it}

    val unitDemo: () -> Unit = { println("hey") }

    println(sum(1, 2))
    println(sum1(2, 3))
    println(square(2))
    println(squareShortVersion(2))
    println(unitDemo())
}


