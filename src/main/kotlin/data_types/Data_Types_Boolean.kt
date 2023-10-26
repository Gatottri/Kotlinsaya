package data_types

fun main() {
    val x = true
    val y = false

    val resultAnd = x && y
    println("x && y = $resultAnd")

    val resultOr = x || y
    println("x || y = $resultOr")

    val resultNotX = !x
    println("!x = $resultNotX")

    val resultNotY = !y
    println("!y = $resultNotY")
}

