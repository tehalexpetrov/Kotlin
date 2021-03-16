package lesson3

import java.util.*

fun main(args: Array<String>){
    checkNull()
    createArray()
    sortArray()
    upSort()
}

fun checkNull() { //Проверка на значние строки и подсчета количества букв
    val name: String? = "Kotlin"

    if (name.equals(null)) {
        println("строка \"name\" не содержит в себе значения")
    } else{
        if (name != null) {
            println("строка $name содержит " + name.length + " букв")
        }
    }
}

fun createArray(){
    val reader = Scanner(System.`in`)
    println("Какой длины массив создать")
    val end = reader.nextInt()
    println("Заполните массив произвольными числами")
    val createArr = mutableListOf<Int>()

    for (i in 0..end) {
        print("Введите индекс[$i] = ")
        createArr.add(reader.nextInt())
    }
    //println(createArr)
    createArr.forEach{i ->
        println(i)
    }
}

fun sortArray(){
    val sortArr = arrayOf(5, -15, 100, -55, 20, -5, -80, 45, 25, -10)
    sortArr.sort()

    println(sortArr.contentToString())
}

fun upSort(){
    var arr = mutableListOf<Int>()
    arr.addAll(listOf(5, -15, 100, -55, 20, -5, -80, 45, 25, -10))

    var temp = 0
    for (i in 0..arr.count() - 2){
        for (j in 0..arr.count() - i -2){
            if (arr[j] > arr[j + 1]){
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    arr.forEach{element ->
    println(element)}
}