package lesson9

abstract class Pet(var name: String)
class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)

class Contest<T : Pet>(var vet: Vet<T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T> {
        val winners: MutableSet<T> = mutableSetOf()
        val highScore = scores.values.maxOrNull()
        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}

class Vet<T: Pet>{
    fun treat(t: T){
        println("Treat Pet ${t.name}")
    }
}

interface Retailer<out T>{
    fun sell(): T
}

class CatRetailer: Retailer<Cat>{
    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }
}

class DogRetailer: Retailer<Dog>{
    override fun sell(): Dog {
        println("Sell Dog")
        return Dog("")
    }
}

class FishRetailer: Retailer<Fish>{
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")
    }
}

fun main(args: Array<String>) {
    val catFuzz = Cat("Fuzz Ligh")
    val catKatsu = Cat("Catsu")
    val fishFinny = Fish("Finny")
    val fishMarry = Fish("Marry")

    val catContest = Contest<Cat>()
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)
    val topCat = catContest.getWinners().first()
    println("Cat is ${topCat.name}")

    val petContest = Contest<Pet>()
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    petContest.addScore(fishMarry, 66)
    val topPet = petContest.getWinners().first()
    println("Cat is ${topPet.name}")

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()

}
