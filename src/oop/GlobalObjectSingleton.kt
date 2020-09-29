package oop


object DatabaseGlobal {
    private val storage = mutableListOf<String>()


    fun insert(data: String) {
        storage.add(data)
    }


    fun size(): Int {
        return storage.size
    }
}

fun main() {
    DatabaseGlobal.insert("Test")
    println(DatabaseGlobal.size())
}