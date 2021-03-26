package lesson5

import java.util.*

fun main(args: Array<String>){
    /* Не менять код */
        val scanner = Scanner(System.`in`)
        print("Сколько у Вас денег?: ")
        val buy = scanner.nextInt()

        val buyOne = 500
        val buyTwo = 1500

        if (buy in buyOne .. buyTwo){
            println(true)
        } else if (buy > buyTwo){
            println("Вы можете купить, что-то еще")
        } else {
            println(false)
        }
}