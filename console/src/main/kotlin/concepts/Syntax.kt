package concepts

import kotlin.random.Random


fun main() {
    var x: Int = Random(System.nanoTime()).nextInt(10)

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("$x otherwise")
    }

    when {
        x == 1 || x == 0 -> println("x == 0 or x == 1")
        else -> println("$x otherwise")
    }

    val validNumbers = listOf(11, 12, 13)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    for (i in 6 downTo 0 step 2) {
        println((i + 65).toChar())
    }



}