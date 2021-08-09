package lesson5_Animals

abstract class Animals : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam(){
        println("Животное передвигается")
    }

    fun sleep(){
        println("Животное спит")
    }
}

class Hippo: Animals(){
    override val image = "hippo.img"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat(){
        println("The Hippo is eating $food")
    }
}

abstract class Canine: Animals(){
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
    val vechicl = Vechicle()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    vechicl.roam()

}