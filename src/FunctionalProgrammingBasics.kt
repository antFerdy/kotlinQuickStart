import kotlin.random.Random

fun main() {
//    lambdaDemo();

//    filterDemo()

//    mapDemo();

    sortDemo()
}



fun lambdaDemo() {
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


fun filterDemo() {
    var numbers = mutableListOf<Int>()
    for(i in 0..99) {
        numbers.add(i)
    }

    var predicate: (Int) -> Boolean = {
        it % 2 == 0
    }

    val filteredList = numbers.filter(predicate).toList()

    println("Even numbers")
    for (n in filteredList) {
        println(n)
    }


    val oddNumbers = numbers.filter { it % 2 == 1 }.toList()
    println("Odd numbers")
    for (odd in oddNumbers) {
        println(odd)
    }


    val fiveBasedNumbers = numbers.filter{ number: Int -> number % 5 == 0}.toList()
    println("Divisible to 5")
    for (number in fiveBasedNumbers) {
        println(number)
    }

}


fun mapDemo() {
    //создадим лист через range
    val numbers = (0..99).toList()
    val doubledNums = numbers.map { (it * 2).toString() }

    println("Doubled numbers ")
    for (s in doubledNums) {
        println(s)
    }

}


fun sortDemo() {
    var randomArr = mutableListOf<Int>()

    var r = Random(2)
    for(i in (0..99)) {
        randomArr.add(r.nextInt())
    }

    val randomStrNumbers = randomArr.filter { it % 3 == 0 }.map { it * 2 }.sortedDescending().map { "Random transformed number $it" }
    for (s in randomStrNumbers) {
        println(s)
    }
}






