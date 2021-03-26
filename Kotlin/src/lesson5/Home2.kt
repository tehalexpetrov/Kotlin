package lesson5

import java.util.*

/* Не менять код */
fun main(args: Array<String>) {
    val random = 3
    print("Enter a number: ")
    val reader = Scanner(System.`in`)
    val num1 = reader.nextInt()

    if (num1 in 1..9 && num1 == random){
        println("Yes!")
    } else {
        println("Ooops! Try again")
    }
}