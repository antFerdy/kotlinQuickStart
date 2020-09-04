package basics

import java.util.*
import kotlin.collections.ArrayList

fun main() {
//    basics.arrayDemo()
//    basics.arrayDemoNullable()

//    basics.arrayListDemo()
    listMutableDemo()
}

fun arrayDemo() {
    var arr = arrayOf(1, 2, 3, 4, 5) //type Array<Int>
    println(arr[1])
}

fun arrayDemoNullable() {
    var arr : Array<Int?> = arrayOf(1, 2, 3, 4, 5) //type Array<Int?> with nullable
    println(arr[1])
    arr[1] = null
    println(arr[1])
}

fun arrayListDemo() {
    val dataList = ArrayList<Int>()
    dataList.add(1)
    print(dataList.get(0))
    println(dataList[0])
}


fun listMutableDemo() {
    var dataList : MutableList<String> = LinkedList<String>(listOf("apple", "banana", "apple", "water"))
    dataList.set(1, "pamela") //or replace with indexing
    dataList.add("watermelon")
    println("Size of list ${dataList.size}")

    for (d in dataList) {
        println(d)
    }


    dataList = mutableListOf()
    dataList.add("marshmallow")

    for (d in dataList) {
        println(d)
    }
}