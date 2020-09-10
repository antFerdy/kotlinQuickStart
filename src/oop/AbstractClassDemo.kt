package oop


abstract class AbstractWorker(val name: String, var age: Int, var title: String) {
    abstract fun work()
}


class SalesManager(name: String, age: Int): AbstractWorker(name, age, "Sales manager") {
    override fun work() {
        println("PLS BUY FROM ME")
    }
}


class Developer(name: String, age: Int): AbstractWorker(name, age, "Software Developer") {
    override fun work() {
        println("CODE CODE CODE")
    }

    fun debug() {
        println("Debugging u shitty code")
    }
}



fun main() {
    println("##############Executing abstract method#############")
//    val worker = AbstractWorker("Test", 22, "Sales manager") //ERROR: Can't instantiate abstract class

    val sales = SalesManager("John Weak", 29)
    sales.work()


    println("#############Smart cast example#################")
    val workers: MutableList<AbstractWorker> = mutableListOf<AbstractWorker>()
    workers.add(SalesManager("Henry", 34))
    workers.add(Developer("Henry", 34))
    workers.add(SalesManager("Henry", 34))

    for(worker in workers) {
        worker.work()
//      worker.debug() //ERROR: U can't invoke method that's not part of abstract class

        if(worker is Developer) //but when u checked type, u can invoke debug method
            worker.debug() //smart cast happend


//        worker as Developer //явное приведение типов
//        worker.debug()
    }

    println("###########Transforming elements###############")
    val transformFun = { element: AbstractWorker -> Developer(element.name, element.age) }
    val developers = transformWorkerToDeveloper(workers, transformFun)

    developers.forEach{ it.debug() }
}


fun <T, R> transformWorkerToDeveloper(fromList: List<T>, mapFun: (T) -> R): List<R> {
    return fromList.map { element: T ->  mapFun(element)}.toList()
}
