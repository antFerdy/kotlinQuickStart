fun main() {
//    nullableAny()
//    unitDemo()
//    whenDemo("September")
//    whenDemoWithRange(6)
    whenDemoWithoutParam()
}

fun nullableAny() {
    var count = 100
    val food : Any? = if(count > 200) {
        count -= 100;
        "Pizza"
    } else if(count > 300) {
        count -= 200;
        "Pasta"
    } else if (count > 400) {
        count -= 300;
        12 //returning int type
    } else {
        count -= 50;
        null
    }

    println(food) //Nullable Any type
    println(count)
}



fun unitDemo() {
    var count = 100
    val food = if(count > 200) {
        count -= 100;
    } else if(count > 300) {
        count -= 200;
    } else if (count > 400) {
        count -= 300;
    } else {
        count -= 50;
    }

    println("Returning: $food") //Unit type
    println(count)
}


fun whenDemo(month : String): String {
    val season = when(month) {
        "December", "January", "February" -> "Winter"
        "March", "April", "May" -> "Spring"
        "June", "July", "August" -> "Summer"
        "September", "October", "November" -> "Fall"
        else -> {
            "N/A"
        }
    }
    println(season)
    return season
}


fun whenDemoWithRange(month : Int): String? {
    val season = when(month) {
        12, 1, 2 -> "Winter"
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        in 9..11 -> "Fall"
        else -> {
            null
        }
    }
    println(season)
    return season
}

fun whenDemoWithoutParam() {
    val temp = 80

    val state = when {
        temp < 0 -> {
            "Ice"
        }
        temp > 100 -> {
            "Gas"
        }
        temp in 1..89 -> {
            "Solid"
        } else -> {
            null
        }
    }
    print(state)
}