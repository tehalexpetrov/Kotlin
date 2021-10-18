package lesson10

fun main() {
    var addFive = { x: Int -> x + 5 }
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInst = { x: Int, y: Int -> x + y }
    val result = addInst.invoke(6, 7)
    println("Pass 6, 7 to addInst: $result")

    val addSeven: (Int) -> Int = { it + 7 }
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda: () -> Unit = { println("Hi!") }
    myLambda()
}