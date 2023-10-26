package data_types

fun main() {
    val myArray = arrayOf(7, 8, 9, 10, 11, 12)
    var kelas = 1

    println("Peringkat kelas Gatot:")
    for (element in myArray) {
        println("Kelas "+ kelas++ + " aku berumur " + element)
    }
}
