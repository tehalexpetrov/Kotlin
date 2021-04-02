package lesson4


fun main(args: Array<String>) {
    //Задание 1
    arrPrint()

    //Задание 2
    println(checkSymbol('a'))
    println(checkNumber('2'))

    //Задание 3
    println("\n*********Задание 3*********")
    numberCheck(50, 10, true)

    //Задание 4
    println("\n*********Задание 4*********")
    argTwo("one", "two", "three", "for", "five", prefix = "number: ")
}

/*Задание №1*/
fun arrPrint() {
    for (sun in 'a'..'f') {
        println(sun)
    }
}

/*Задание №2*/
fun checkSymbol(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun checkNumber(c: Char) = c !in '0'..'9'

/*Задание 3*/
fun numberCheck(one: Int, two: Int, work: Boolean = false) {
    if (one > two && work == true) {
        var m = two
        print(m)
        println(true)
    } else if (one < two && work == true) {
        var k = one
        print(k)
        println(true)
    } else {
        println(false)
    }
}

/*Задание 4*/
fun argTwo(vararg words: String, prefix: String) {
    for (m in words) {
        println(prefix + m)
    }
}
