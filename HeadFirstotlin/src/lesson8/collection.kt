package lesson8

class collection {
}

fun main(args: Array<String>){
    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShopping оригинал: $mShoppingList")

    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShopping list added: $mShoppingList")

    if (mShoppingList.contains("Tea")){
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }

    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")

    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    //MutableSet
    println("*********************************************")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")

    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShopping add item: $mShoppingSet")

    mShoppingList = mShoppingSet.toMutableList()
    println("mShopping List new version: $mShoppingList")

}