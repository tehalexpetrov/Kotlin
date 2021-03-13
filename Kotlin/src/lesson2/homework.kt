package lesson2

import java.util.*

fun main(args: Array<String>){
    nameAge()
    testNumber()
    println("Результат произведения чисел: " + multyNumber(a = 2, b = 3, c = 4))
    evenNumber(a = 4 , b = 5)
    checkNumber()
}

fun nameAge(){
    println("\n********Задание 1***************")
    val read = Scanner(System.`in`)
    print("Введите Ваше Имя: ")
    val name = read.nextLine()
    print("Введите Ваш возраст: ")
    val age = read.nextInt()
    println("Привет,$name." + " Вам: $age года")
}

fun testNumber(){
    println("\n********Задание 2***************")
    var a = 10
    var b = 20
    if (a < b) println("$a меньше $b")
    if (a == b) println("$a равно $b")
    if (a > b) println("$a больше $b")
}

fun multyNumber(a: Int, b: Int, c: Int): Int{
    println("\n********Задание 3***************")
    return a * b * c
}

fun evenNumber(a: Int, b: Int){
    println("\n********Задание 4***************")
    if (a % 2 == 0) println("Число $a: Четное")
    else println("Число $a: Не четное")
    if (b % 2 == 0) println("Число $b: Четное")
    else println("Число $b: Не четное")
}

fun checkNumber(){
    println("\n********Задание 5***************")
    val reader = Scanner(System.`in`)
    print("Введите число от 1 до 7: ")
    val week = reader.nextInt()

    when(week){
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
    }
}
