package lesson5

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()
    val y = scanner.nextInt()
    val z = scanner.nextInt()
    println(sum(x, y, z))
}

fun sum(x: Int, y: Int, z: Int):Boolean {
    if (x + y == z){
        return true
    }
    return false
}