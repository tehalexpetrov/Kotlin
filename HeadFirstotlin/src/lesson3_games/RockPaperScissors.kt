package lesson3_games

fun main(args: Array<String>){
    val options = arrayOf("Камень", "Ножницы", "Бумага")
    val gameChoice = getGameChoise(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoise(optionsParam: Array<String>) =
    optionsParam [(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    //Выполнять цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) {
        //запросить у пользователя его выбор
        print("Сделайте свой выбор:")
        for (item in optionsParam) print(" $item")
        println(".")
//    Прочитать пользовательский ввод
        var userInput = readLine()
//        Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam ){
            isValidChoice = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String){
    val result: String

    if(userChoice == gameChoice ) {
        result = "Ничья"
    } else if((userChoice == "Камень" && gameChoice == "Ножницы") ||
            (userChoice == "Ножницы" && gameChoice == "Бумага") ||
            (userChoice == "Бумага" && gameChoice == "Камень")) result = "Ты выйграл"
    else result = "Ты проиграл"

    println("Ты выбрал $userChoice. Я выбрал $gameChoice. $result")
}
