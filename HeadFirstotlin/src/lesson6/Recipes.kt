package lesson6

data class Recipes(val title: String, val isVegetarian: Boolean)

fun main(args: Array<String>){
    val r1 = Recipes("Tai Country", false)
    val r2 = Recipes("Tai Country", false)
    val r3 = r1.copy(title = "Mark Avreli")

    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")
    val (title, vegetarian) = r1 //Деструктуризация r1
    println("title is $title and vegetarian is $vegetarian")

}