package lesson4


fun main(args: Array<String>) {
    arrayPrint()
    //Задание 2
    var symbol: Char = 'a'

    //Задание 3
    println("\n*********Задание 3*********")
    numberCheck(50, 10, true)

    println("${argTwo("one", "two", "three", "for", "five")}")
}

/*Задание №1*/
fun arrayPrint() {
    val arrayMy: Array<String> = arrayOf("a", "b", "c", "d", "e", "f")
    for (arr in arrayMy) {
        println(arr)
    }
}

/*Задание 3*/
fun numberCheck(one: Int, two: Int, work: Boolean = false) {
    if (one > two && work == true) {
        var m = two
        print(m)
        println(true)
    } else if (one < two && work == true){
        var k = one
        print(k)
        println(true)
    } else {
        println(false)
    }
}

/*Задание 4*/
fun argTwo(vararg grade: String):String{
    var str:String = "number: "
    for(num in grade){
        str += "${argTwo(num)}\n"
    }
    return str
}
