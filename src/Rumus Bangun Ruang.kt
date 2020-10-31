fun main() {
    println("Luas Kubus  : ${LuasKubus(rusuk = 10.0)}")
    println("Volume Kubus : ${VolumeKubus(rusuk = 10.0)}")
    println("Luas Balok : ${LuasBalok(panjang = 8.5, lebar = 7.0, tinggi = 9.4)}")
    println("Volume Balok : ${VolumeBalok(panjang = 8.5, lebar = 7.0, tinggi = 9.4)}")
    println("Luas Limas Segitiga : ${LuasLimasSegitiga(LuasSisi1 = 24.0, LuasSisi2 = 24.0, LuasSisi3 = 24.0, LuasSisi4 = 24.0)}")
    println("Volume Limas Segitiga : ${VolumeLimasSegitiga(LuasAlas = 24.0, Tinggi = 7.0)}")
}

fun LuasKubus(rusuk: Double): Double {
    return 6 * (rusuk * rusuk)
}

fun VolumeKubus(rusuk: Double): Double {
    return rusuk * rusuk * rusuk
}

fun LuasBalok(panjang: Double, lebar: Double, tinggi: Double): Double {
    return (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi)
}

fun VolumeBalok(panjang: Double, lebar: Double, tinggi: Double): Double {
    return panjang * lebar * tinggi
}

fun LuasLimasSegitiga(LuasSisi1: Double, LuasSisi2: Double, LuasSisi3: Double, LuasSisi4: Double): Double {
    return (LuasSisi1) + (LuasSisi2) + (LuasSisi3) + (LuasSisi4)
}

fun VolumeLimasSegitiga(LuasAlas: Double, Tinggi: Double): Double {
    return 0.5 / 3 * LuasAlas * Tinggi
}