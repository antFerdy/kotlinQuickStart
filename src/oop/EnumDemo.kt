package oop

enum class Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

enum class Season {
    FALL, WINTER, SPRING, SUMMER
}

enum class SeasonTemp(val averageTemp: Int) {
    FALL(averageTemp = +10),
    WINTER(-22),
    SPRING(-5),
    SUMMER(+30)

}

fun main() {
    val month: Month = Month.SEPTEMBER
    val season = when(month) {
        Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER -> SeasonTemp.FALL
        Month.DECEMBER, Month.JANUARY, Month.FEBRUARY ->  SeasonTemp.WINTER
        Month.MARCH, Month.APRIL, Month.MAY ->  SeasonTemp.SPRING
        Month.JUNE, Month.JULY, Month.AUGUST ->  SeasonTemp.SUMMER
    }



    println("The season $season with temp ${season.averageTemp}")
}