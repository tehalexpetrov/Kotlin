package lesson3

fun main(args: Array<String>){
   checkNull()
}

fun checkNull() { //Проверка на значние строки и подсчета количества букв
    val name: String? = "Kotlin"

    if (name.equals(null)) {
        println("строка \"name\" не содержит в себе значения")
    } else{
        if (name != null) {
            println("строка $name содержит " + name.length + " букв")
        }
    }
}