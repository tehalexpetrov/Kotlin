package lesson8

fun main(){
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSothia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hei")

    val pets = mutableListOf<String>()
    pets.addAll(petsLiam)
    pets.addAll(petsSothia)
    pets.addAll(petsNoah)
    pets.addAll(petsEmily)

    println(pets)

    //Указываем размер
    println(pets.size)

    //Убираем дубли из pets
    val petsAll = pets.toMutableSet()
    println(petsAll)

    //Произведем сортировку
    val petsSort = petsAll.toMutableList()
    petsSort.sort()
    println(petsSort)


}
