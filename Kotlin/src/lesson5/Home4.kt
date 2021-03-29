package lesson5

import java.util.*

fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    println("Введите первое число")
    val x = scanner.nextInt()
    println("Введите второе число")
    val y = scanner.nextInt()
    println("Введите третье число")
    val z = scanner.nextInt()
    println("Произведение чисел равно: " + mult(x, y, z))
}

fun mult(x:Int, y:Int, z:Int): Int {
    return (x * y * z)
}