package oop


class MyGenericArray<T>: ArrayList<T>() {


    companion object {
        fun <T> listOf(vararg elements: T): MyGenericArray<T> {
            var arr = MyGenericArray<T>()
            for (e in elements) {
                arr.add(e)
            }
            return arr
        }
    }

}


fun main() {
    val list = MyGenericArray.listOf("Hey", "Hey1", "h")
    val listOfInts = MyGenericArray.listOf(1, 2, 3)

    //обязательно надо указать тип переменной если не передаем элементы в массив
    val data: MyGenericArray<String> = MyGenericArray.listOf()
    MyGenericArray.listOf<String>()

    for(e in list) {
        println(e)
    }

    for (e in listOfInts) {
        println(e)
    }

}