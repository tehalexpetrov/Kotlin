package lesson6

fun main(args: Array<String>){
    var symbol: String = "kotlin is a programming language"
    println(symbol.CountSymbols('g'))
    println(symbol.CountSymbols('o'))
    println(symbol.CountSymbols('a'))
    println(symbol.CountSymbols('k'))
}

fun String.CountSymbols(c: Char): Int{
    var count = 0
    for (n in 0..this.count() - 1){
        if (this[n] == c){
            count++
        }
    }
    return count
}