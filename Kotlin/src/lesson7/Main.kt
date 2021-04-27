package lesson7

fun main(){
    val alex = Student()
    alex.name = "alex"
    alex.surname = "Hello"
    alex.mark = 66.5

    val petr = Student()
    petr.name = "petr"
    petr.surname = ""
    petr.mark = 78.6

    println("${alex.name}, ${alex.surname}, ${alex.mark}")
    println("${petr.name}, ${petr.surname}, ${petr.mark}")

}