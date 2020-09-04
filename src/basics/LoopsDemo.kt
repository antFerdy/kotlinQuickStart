package basics

fun main() {
//    basics.forLoop()
//    basics.forLoopWithRange()
//    basics.forloopWithUntil()
//    basics.forLoopWithDownTo()
//    basics.forLoopWithIndexesAndValue()
    forLoopWithIndex()

}



fun forLoop() {
    for(i in arrayOf(1, 2, 3, 4, 5)) {
        print(i)
    }


}

fun forLoopWithRange() {
    var arr = arrayOfNulls<Int?>(101)
    for(i in 0..100) {
        arr[i] = i
        println(i)
    }
}


fun forloopWithUntil() {
    var arr = arrayOfNulls<Int?>(101)
    for (i in arr.indices) {
        arr[i] = i + 2
        println(arr[i])
    }
}


fun forLoopWithDownTo() {
    for(i in 100 downTo 0 step 2) {
        print(i)
        print(" , ")
    }
}

fun forLoopWithIndexesAndValue() {
    var arr = arrayOfNulls<Int?>(101)
    for((i, value) in arr.withIndex()) {
        arr[i] = value?:i
        arr[i] = value?.times(2)

        println(arr[i])
    }
}


fun forLoopWithIndex() {
    for((i, value) in (600 downTo 300).withIndex() ) {
        if(value % 5 == 0)
            println("$i and $value")
    }
}