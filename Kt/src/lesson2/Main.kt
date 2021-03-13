package lesson2

import java.util.*

fun main(args: Array<String>) {


    val name = "Введите возраст: ";
    print(name);
    val reader = Scanner(System.`in`)
    var age = reader.nextInt();

    if (age >= 18){
        println("Вы можете пройти");
    } else {
        println("Вы не можете пройти. Вы еще маленький");
    }

    var age2 = reader.nextInt();
    print(name);

   if (age2 > 15 && age2 < 18){
        println("Вы подросток");
    } else if(age2 > 18 && age2 < 25 ){
        println("Вы молодой мужчина");
    } else if (age2 > 25 && age2 < 60 ){
        println("Вы мужчина");
    } else {
        println("Щенок");
    }

    when(age2) {
        in 15..18 -> println("Подросток")
        in 18..25 -> println("Молодой мужик")
        in 25..60 -> println("Мужик")
        !in 0..15 -> println("Вне диапазона")
        else -> println("Не правильно введено значение")
    }
}