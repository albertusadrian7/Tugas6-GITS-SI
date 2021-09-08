// Nama: Albertus Adrian Susanto

/*
Soal:
Buatlah sebuah class Siswa yang memiliki 2 atribut yaitu nama dan nilai. Selanjutnya buatlah getter dan setter untuk masing-masing atribut tersebut. Dengan 2 ketentuan berikut ini:
 a. Getter untuk atribut nama memiliki kemampuan untuk mengembalikan (return) atribut nama yang telah dikonversi menjadi huruf kapital.
 b. Setter untuk atribut nilai memiliki kemampuan untuk mengecek apakah nilai yang diinput user sudah bernilai positif atau belum serta membulatkan nilai secara otomatis. Apabila desimal dari nilai lebih dari atau sama dengan 0.5, maka nilai akan dibulatkan ke atas. Sebaliknya, apabila desimal dari nilai kurang dari 0.5, maka nilai akan dibulatkan ke bawah.

 Setelah membuat class Siswa, selanjutnya buatlah object untuk mencoba getter dan setter masing-masing atribut tersebut pada file Main.kt
 */

// Keterangan: Class Siswa terdapat pada file Siswa.kt

fun main(args: Array<String>) {
    println("=== Selamat Datang di Program Penilaian Siswa ===")
    // Membuat object siswa1 dari class Siswa
    val siswa1 = Siswa()
    // Memberikan value pada atribut nama menggunakan setter
    siswa1.nama = "Albertus Adrian"
    // Memberikan value pada atribut nilai menggunakan setter
    siswa1.nilai = 87.5
    // Mengakses value pada atribut nama menggunakan getter
    println("${siswa1.nama}")
    // Mengakses value pada atribut nilai menggunakan getter
    println("Nilai: ${siswa1.nilai}\n") // Nilai 87.5 akan dibulatkan ke atas menjadi 88

    // Membuat object siswa2 dari class Siswa
    val siswa2 = Siswa()
    siswa2.nama = "Antonius Felix"
    siswa2.nilai = 90.2
    println("${siswa2.nama}")
    println("Nilai: ${siswa2.nilai}\n") // Nilai 90.2 akan dibulatkan ke bawah menjadi 90

    // Membuat object siswa3 dari class Siswa
    val siswa3 = Siswa()
    siswa3.nama = "Angelina"
    siswa3.nilai = 82.75
    println("${siswa3.nama}")
    println("Nilai: ${siswa3.nilai}\n") // Nilai 82.75 akan dibulatkan ke atas menjadi 83

    // Membuat object siswa4 dari class Siswa
    val siswa4 = Siswa()
    siswa4.nama = "Susi"
    siswa4.nilai = 82.0
    println("${siswa4.nama}")
    println("Nilai: ${siswa4.nilai}\n") // Nilai 82.0 akan tetap 82.0

    // Membuat object siswa5 dari class Siswa
    val siswa5 = Siswa()
    siswa5.nama = "Michson Rabunto"
    siswa5.nilai = -80.25
    println("${siswa5.nama}")
    println("Nilai: ${siswa5.nilai}\n") // Nilai -80.25 akan menjadi 0.0 karena negatif
}