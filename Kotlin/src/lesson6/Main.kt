package lesson6

fun main(args:Array<String>){
    /*Первый вариант*/
    val sum = {x: Int, y: Int -> x + y}
    println(sum(5, 10))

    //Второй вариант
    val sm: (Int, Int) -> Int = {a, b -> a + b}
    println(sm(8, 8))
}