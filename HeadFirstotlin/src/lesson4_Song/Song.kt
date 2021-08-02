package lesson4_Song

class Song (val Title: String, val Artist: String) {

    fun start(){
        println("Сейчас играет песня: $Title. Поет: $Artist")
    }

    fun stop(){
        println("Песню: $Title Остановили!")
    }
}

fun main(){
    val songOne = Song("Арлекино", "Агутин")
    val songTwo = Song("Офицеры", "Газманов")
    val songThre = Song("Снег", "Филип Киркоров")

    songOne.start()
    songTwo.stop()
    songThre.start()
}