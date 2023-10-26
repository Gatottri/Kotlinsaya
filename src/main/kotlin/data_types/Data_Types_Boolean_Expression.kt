package data_types
fun main(){
    val x = 100
    val y = 100
    val lb = x > y
    val lk = x < y
    val lbs = x >= y
    val lks = x <= y
    val sd = x == y
    val tsd = x != y

    println("Apakah nilai x lebih besar dari y = $lb")
    println("Apakah nilai x lebih kecil dari y = $lk")
    println("Apakah nilai x lebih besar sama dengan y = $lbs")
    println("Apakah nilai x lebih kecil sama dengan y = $lks")
    println("Apakah nilai x sama dengan = $sd")
    println("Apakah nilai x tidak sama dengan = $tsd")
}
