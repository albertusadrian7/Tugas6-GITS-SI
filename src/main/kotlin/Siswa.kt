// Nama: Albertus Adrian Susanto

// Membuat Class Siswa
class Siswa {
    // Properti atau Atribut Nama
    var nama: String = ""
    // Getter untuk Atribut Nama
    get() {
        print("Nama siswa: ")
        // Mengubah string dalam atribut nama menjadi huruf kapital
        return field.uppercase()
    }
    // Setter untuk Atribut Nama
    set(value) {
        field = value
    }

    // Properti atau Atribut Nilai
    var nilai: Double = 0.0
    // Getter untuk Atribut Nilai
    get() = field
    // Setter untuk Atribut Nilai
    set(value) {
        field = if (value >= 0.0){
            // Contoh: Nilai 82.7, maka:
            // value = 82.7 sedangkan value.toInt().toDouble() = 82
            // Dengan demikian value - value.toInt().toDouble() = 82.7 - 82 = 0.7
            if (value - value.toInt().toDouble() >= 0.5){
                value.toInt().toDouble() + 1
            } else {
                value.toInt().toDouble()
            }
        } else {
            println("[PERINGATAN] Nilai tidak boleh negatif!")
            0.0
        }
    }
}