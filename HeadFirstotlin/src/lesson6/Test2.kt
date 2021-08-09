package lesson6

import java.lang.reflect.Array.get

data class Test2(val title: String, val name: String ){

}

fun main(args: Array<String>) {
    val m1 = Test2("wet", "Kuku")
    val m2 = Test2("tete", "Gugu")

    println(m1.toString())
    println(m2.toString())
    println(m1.hashCode())
    println(m1.hashCode())
    println(m1.equals(m2)) //результат false
}