package Part2

fun main() {
    val nilaiku = 90
    val nilaikkm = 70
    val nilaidia = 80


    if (nilaiku > nilaikkm && nilaiku > nilaidia) {
        println("Nilai ($nilaiku) punyaku adalah yang tertinggi.")
    } else if (nilaikkm > nilaiku && nilaikkm > nilaidia ) {
        println("Yang nilainya di bawah ($nilaikkm) harus remedia.")
    } else if (nilaidia > nilaiku && nilaidia > nilaikkm) {
        println("Nilainya dia($nilaidia), aku iri padanya.")
    } else {
        println("")
    }
}
