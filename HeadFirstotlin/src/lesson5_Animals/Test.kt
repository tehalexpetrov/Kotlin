package lesson5_Animals

interface Flyable {
    val x: String

    fun fly() {
        println("$x is flyning")
    }
}

class Birds : Flyable {
    override val x = "Bird"
}

class Plane : Flyable {
    override val x = "Plane"
}

class Superhero : Flyable {
    override val x = "Superhero"
}

fun main(args: Array<String>) {
    val f = arrayOf(Birds(), Plane(), Superhero())
    var x = 0

    while (x in 0..2) {
        when (f[x]) {
            is Birds -> {
                x++
                f[x].fly()
            }
            is Plane, is Superhero -> f[x].fly()
        }
        x++
    }

}