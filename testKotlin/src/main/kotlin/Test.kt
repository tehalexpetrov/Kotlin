fun main() {
    val myFirstDice = Dice("red", 6)
    println("Your color ${myFirstDice.color} or sides ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice("blue", 20)
    println("Your color ${mySecondDice.color} or sides ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")

    val money = Coin()
    val coin = Coin().mix()

    if(coin == 1){
        println("Орел")
    } else if (coin == 2){
        println("Решка")
    } else if(coin == 0){
        println("Упала на ребро")
    }

    println(coin)

}

class Dice (val color: String, val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

class Coin(){
    val sideRange = 0..2

    fun mix():Int{
        return (0..2).random()
    }
}