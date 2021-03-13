package lesson3

import java.util.*

fun main(args: Array<String>){
   checkNull()
    //createArray()
    sortArray()
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
    val arr = reader.nextInt()
    val createArr = mutableListOf<Int>()

    for (i in 0..arr)
        createArr.add(i)

    println(createArr)
    /*createArr.forEach{i ->
        println(i)
    }*/
}

fun sortArray(){
    val sortArr = arrayOf(5, -15, 100, -55, 20, -5, -80, 45, 25, -10)
    sortArr.sort()

    println(sortArr.contentToString())
}