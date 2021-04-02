package lesson6

/*Infix*/

fun main(args: Array<String>){
    println(1 sum 3)
    println(1.sum(3))

    println(1 big 5)
    println(5.big(1))
}

infix fun Int.sum(i: Int) = this + i
infix fun Int.big(value: Int): Boolean = this > value