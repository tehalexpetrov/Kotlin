package lesson3

import java.util.*

fun main(args: Array<String>) {
    //NullExeptionPoint в Kotlin
    var name: String? = "Alexander"
    println("Выводим значение: " + name)

    //Оператор Элвис для null
    val presley = name?.length ?: 0
    println("Оператор Элвис: " + presley)

    //массивы
    val arrNum: Array<Int> = arrayOf(5, 8, 90, 45, 66, 99, 100)
    val getNum = arrNum[5]
    println("Индекс в массиве 5: " + getNum)

    //сложение чисел в массиве
    val a: IntArray = intArrayOf(99, 67, 56, 23)
    a[0] = a[1] + a[2] + a[3]
    println("Cумма чисел в массиве: " + a[0])

    /*//Пример
    val reader = Scanner(System.`in`)
    println("Введите первое число: ")
    val c = reader.nextInt()
    println("Введите второе число: ")
    val d = reader.nextInt()

    var checkArray = mutableListOf<Int>()

    if(c > d){
        for (i in d..c){
            checkArray.add(i)
        }
    } else
        for (i in c..d){
           checkArray.add(i)
        }
    println(checkArray)*/

    //Коллекции
    val itemArr = mutableListOf<Int>()
    val listArr = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)

    itemArr.addAll(listArr)
    itemArr[0] = 34
    itemArr.removeAt(2)
    itemArr.add(-2)

    println(itemArr)
}
