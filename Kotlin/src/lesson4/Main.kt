package lesson4

import java.lang.IllegalArgumentException

fun main(args: Array<String>){

    for (a in 1..10){
        println(a)
    }

    for (b in 10 downTo 1){ //downTo выводит в обратном порядке
        println(b)
    }

    for (c in 10 downTo 1 step 2){ //step выводит c шагом
        println("** " + c)
    }

    for (d in 1 until 10){ //until ограничение до числа
        println(d)
    }

    //Выводим таблицу умножения
println("\nВыводим таблицу умножения\n")
    for (i in 1..10 step 1){
        for (j in 1..10 step 1){
            print("${i * j}\t")
        }
        println()
    }

    //Работа с массивами
    var arrNum = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    /*for (num in arrNum.indices){
        println("$num: ${arrNum[num]}")
    }*/
    for (num in 5 until 9){
        println("$num: ${arrNum[num]}")
    }

    println("\nМассив в обратном порядке")

    for (num in 9 downTo 3 step 3){
        println("$num ${arrNum[num]}")
    }

    //Функциональное программирование
    students("Александ", "Петров", 5)
    students("Василий", "Иванов")

    println("Cумма полученных чисел равна: ${sum(1 , 2 , 3 , 4)}")

    println("Аргументы переменной длины равны: ${arg(1, 3, 100, 899)}")

    message("Hello", "World")

    //Исключения
    var number = 45
    if (number !in 0..10){
        throw IllegalArgumentException(
            "Число $number не входит в диапазон от 0 до 10"
        )
    }
    println(number)

}

fun students(firstName: String, lastName: String, mark: Int=0 ){
    println("Имя: $firstName")
    println("Фамилия: $lastName")
    println("Оценка: $mark")
}

/*4 числа, которые нужно сложить между собой. Напишите функцию, которая будет вычислят сумму этих чисел,
два последних числа как значение по умолчанию*/
fun sum(a: Int, b: Int, c: Int = 0, d: Int = 0): Int {
    return a + b + c + d
}

//Аргументы переменной длины
fun arg(vararg grade: Int):Int{
    var result = 0
    for (num in grade){
        result += num
    }
    return result
}

fun message(vararg str:String){
    for (m in str){
      println(m)
    }
}