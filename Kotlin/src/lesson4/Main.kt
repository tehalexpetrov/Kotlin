package lesson4

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
}