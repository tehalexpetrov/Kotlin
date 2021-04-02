package lesson6

fun main(args: Array<String>){
    println("kotlin is a programming language".CountSymbols())
}

fun String.CountSymbols(): Int{
    return length - replace("k", "").length
}