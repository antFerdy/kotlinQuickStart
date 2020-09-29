package oop


class Database private constructor() {
    var storage = mutableListOf<String>()


    fun insert(data: String) {
        storage.add(data)
    }


    fun size(): Int {
        return storage.size
    }

    companion object {
        private val db: Database? = null

        fun getInstance(): Database {
            db?.let {
                return db
            }
            return Database()
        }
    }
}



fun main() {
    val db = Database.getInstance()
    db.insert("Test")
    db.insert("Test1")
//    assert(db.size() == 2)
    println(db.size())
}