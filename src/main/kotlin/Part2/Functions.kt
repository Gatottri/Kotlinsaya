package Part2

fun main(){
    val hasil = charset("G", 20)
    println(hasil)
}

fun charset(charsetname:String, age:Int): String{
    return "Aku agen $charsetname dan umurku $age tahun"
}