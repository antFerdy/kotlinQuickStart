package oop

interface WaterCare {
    fun bringWater(): String
}


class Athlete {

    var water: String? = null

    fun demandWater(waterCare: WaterCare) {
        this.water = waterCare.bringWater()
    }

    inline fun demandWater(block: () -> String) {
        this.water = block()
    }
}


fun main() {
    val athlete = Athlete()
    athlete.demandWater(object : WaterCare {
        override fun bringWater(): String {
            return "Asu"
        }
    })

    athlete.demandWater{ "Tassay" }

    println(athlete.water)
}