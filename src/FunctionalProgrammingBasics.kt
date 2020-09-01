import kotlin.random.Random

fun main() {
//    lambdaDemo();

//    filterDemo()

//    mapDemo();

//    sortDemo()

//    takeDemo()

//    dropDemo()

//    sequenceDemo()

//    letDemo()

//    withDemo()

//    zipDemo()

//    flatMapDemo()

//    highOrderFunDemo()

    extensionFunctionDemo()
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



fun takeDemo() {
    val listOfData = (0..999).toList()
    var changedData = listOfData.take(30).map { "Hey it's me $it element" }
    for(d in changedData) {
        println(d)
    }

    println("##########################################")
    var lastNList = listOfData.takeLast(40).map { "Hey it's me $it element" }
    for(d in lastNList) {
        println(d)
    }
}


fun dropDemo() {
    val listOfData = (0..999).toList()
    var changedData = listOfData.drop(30).map { "Hey it's me $it element" }
    for(d in changedData) {
        println(d)
    }

    println("##########################################")
    var lastNList = listOfData.dropLast(40).map { "Hey it's me $it element" }
    for(d in lastNList) {
        println(d)
    }
}


fun sequenceDemo() {
    var sequence = generateSequence(0) { it + 1 }
    sequence.take(100).forEach { println(it) }
    println("##########################################")
    sequence.drop(100).forEach { println(it) } //будет выполняться вечно

}


fun letDemo() {
    val name: String? = null
    name?.let { println(it) }
}


fun withDemo() {
    //can be nullable (outside the current thread for example)
    var list: MutableList<Int>? = mutableListOf<Int>()


    list?.let {
        with(list) {
            for (i in (0..99)) {
                add((Math.random() * 100).toInt())
            }
            //all this without referencing to the list variable
            //due to reference to this
            println(sum())
            println(average())
            println(minOrNull())
            println(maxOrNull())
            println(first())
        }
    }
}


fun zipDemo() {
    var names = mutableSetOf<String>()
    var telephones = mutableSetOf<Int>()


    for (i in (0..99)) {
        val tel = Random.nextInt(until = 10) + 1 * 10_000_000
        telephones.add(tel)
        names.add("Contact#$tel")
    }

    val zippedSet = names.zip(telephones, transform= { name: String, tel: Int -> "$name: has telephone: $tel"})
    for (z in zippedSet) {
        println(z)
    }
}


fun flatMapDemo() {
    val myWorkingDays = listOf (
        listOf("Mon", "Wed", "Fri"),
        listOf("Tue", "Thursday", "Saturday"),
        listOf("Monday", "Wensday")
    )


    val days = myWorkingDays.flatMap { it } //could replace to flatten
    for (day in days)
        println(day)


    println("##############")
    val schedule = mapOf(
            "Monday" to listOf("19:00", "21:00", "23:00"),
            "Wednesday" to listOf("17:00", "19:00", "23:00"),
            "Thursday" to listOf("16:00", "22:00", "23:30")
    )

    val times = schedule.flatMap { it.value }
    for (t in times)
        println(t)

}


fun highOrderFunDemo() {
    val l = (0..101).toList()
    val stringCollection = transformCollection<Int, String>(l) { "Value of element $it"}
    for (str in stringCollection) {
        println(str)
    }
}


inline fun <T, R> transformCollection(list: List<T>, transform: (T) -> R): List<R> {
    return list.map{it -> transform(it)}
}


fun extensionFunctionDemo() {
    println(6.isPrime())
    println(5.isPrime())
}

fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for( i in 2 until this - 1) {
        if(this%i == 0) return false
    }
    return true
}


