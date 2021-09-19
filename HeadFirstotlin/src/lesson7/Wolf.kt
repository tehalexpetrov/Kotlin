package lesson7

private val Nothing.hunger: Unit
    get() {}

class Wolf {
    var hunger = 10
    var food = "meat"

    fun eat(){
        println("The Wolf is eating $food")
    }
}

class MyWolf{
    var wolf: Wolf? = Wolf()

    fun myFunction(){
        wolf?.eat()
    }

}

fun getAlfaWolf(): Wolf?{
    return Wolf()
}

fun main(args: Array<String>) {
    var w: Wolf? = Wolf()

    if (w != null) {
        w.eat()
    }

    var x = w?.hunger
    println("This is - $x")

    var y = w?.hunger ?: -1
    println("This is - $y")

    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray){
        item?.let { println(it) }
}   
    getAlfaWolf()?.let { it.eat() }
    w = null
    var z = w!!.hunger
}