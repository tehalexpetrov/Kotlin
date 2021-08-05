package lesson5_Animals

open class Animals {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise(){
        println("Животное будет шуметь")
    }

    open fun eat(){
        println("Животное ест")
    }

    open fun roam(){
        println("Животное передвигается")
    }

    fun sleep(){
        println("Животное спит")
    }
}

open class Canine: Animals(){
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf: Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise(){
        println("Wooowl!")
    }

    override fun eat(){
        println("The Wolf is eating $food")
    }
}

class Vet {
    fun giveShot(animals: Animals){
        animals.makeNoise()
    }
}

fun main(){
    val animalss = arrayOf(Hippo(), Wolf())
    for (item in animalss){
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

}