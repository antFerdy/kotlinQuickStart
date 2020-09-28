package oop

import java.lang.RuntimeException


class Calc {

    companion object {
        private const val pi = 3.14
//        get() {
//            return field * 2
//        }

        fun square(x: Int): Int {
            return x.times(x)
        }

        fun areaOfCircle(radius: Int): Double {
            return 2 * pi * square(radius)
        }
    }
}


class RandomUtil {

    companion object {
        enum class Weekday {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }


        fun randomInt(min: Int, max: Int): Int {
            val random = Math.random() * (max - min + 1) + min
            return random.toInt()
        }

        fun randomBool(): Boolean {
            return Math.random() >= 0.5
        }

        fun randomWeekday(): Weekday {
            val index = randomInt(1, 7)
            return when(index.toInt()) {
                1 -> Weekday.MONDAY
                2 -> Weekday.TUESDAY
                3 -> Weekday.WEDNESDAY
                4 -> Weekday.THURSDAY
                5 -> Weekday.FRIDAY
                6 -> Weekday.SATURDAY
                7 -> Weekday.SUNDAY
                else -> throw RuntimeException("Bug")
            }
        }
    }
}

fun main() {
    println(Calc.square(32))
    println(Calc.areaOfCircle(4))

    println(RandomUtil.randomWeekday())
    println(RandomUtil.randomWeekday())
    println(RandomUtil.randomWeekday())


    println(RandomUtil.randomBool())
    println(RandomUtil.randomBool())
}