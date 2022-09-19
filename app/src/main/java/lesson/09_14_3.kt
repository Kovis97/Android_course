package lesson

fun main() {
    for (a in 1..10) {
        println(a)
    }

    for (a in 10 downTo 1) {
        println(a)
    }

    val cities: List<Any> = listOf("Győr", 3, "Halászi")

    for (a in cities) {
        println(a)
    }

    cities.forEach {
        println(it)
    }

    var i= 10
    while (i > 1) {
        println(i)
        i--
    }

    do {
        println(i)
        i++
    } while (i < 10)
}