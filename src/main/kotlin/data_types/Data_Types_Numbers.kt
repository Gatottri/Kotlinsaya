package data_types

fun main() {
    val angkaPertama = "10"
    val angkaKedua = "5"

    val hasilPenjumlahan = angkaPertama.toShort() + angkaKedua.toShort()
    println("Hasil Penjumlahan: $hasilPenjumlahan")

    val hasilPengurangan = angkaPertama.toShort() - angkaKedua.toShort()
    println("Hasil Pengurangan: $hasilPengurangan")

    val hasilPerkalian = angkaPertama.toShort() * angkaKedua.toShort()
    println("Hasil Perkalian: $hasilPerkalian")

    val hasilPembagian = angkaPertama.toShort() / angkaKedua.toShort()
    println("Hasil Pembagian: $hasilPembagian")
}

