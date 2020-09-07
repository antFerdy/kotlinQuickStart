package oop

data class Student(val name: String, var age: Int, var course: Int) {

}


class Worker(private val name: String, var age: Int, var title: String) {
    operator fun component1() = name

    operator fun component2() = age

    operator fun component3() = title

    fun copy(name: String = this.name,  age: Int = this.age, title: String = this.title): Worker {
        return Worker(name, age, title)
    }

}

fun main() {
    val s = Student("S1", 22, 3)
    val s1 = Student("S1", 22, 3)


    println("##############DATA CLASS DEMO#############")
    println("To String in data class:")
    println(s) //to String already implemented
    println(s1)

    println("Hash codes:")
    println(s.hashCode())
    println(s1.hashCode()) //the same hashcode as at statement higher

    println("Reference check: ${s === s1}") //false expected
    println("Equals check: ${s == s1}") //true expected


    println("\n############DESTRUCTOR DEMO##############")
    val (name, age, course) = s
    println("Name from destructor $name")
    println("Age from destructor $age")
    println("Course from destructor $course")


    val s2 = Student("S2", 22, 3)
    val (name2, _, course2) = s2
    println("Name from destructor $name2")
//    println("Age from destructor $_") ERROR
    println("Course from destructor $course2")


    println("\n############COMPONENT FUNCTION DEMO##############")
    val worker = Worker("worker1", 25, "Engineer")
    val (wName, wAge, wTitle) = worker
    println("Destructor demo for component functions: $wName, $wAge, $wTitle")

    println("\n############COPY FUNCTION DEMO##############")
    val worker1 = worker.copy()
    val (wName1, wAge1, wTitle1) = worker1
    println("Copied object: $wName1, $wAge1, $wTitle1")
    println(worker == worker1)
    println(worker === worker1)

    println("Checking embedded copy method")
    val student1 = s1.copy()
    val student2 = s1.copy(name = "student n")
    println(student1 === s1)
    println(student1 == s1)
    println(student2)



}