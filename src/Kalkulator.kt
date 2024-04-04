import java.util.Scanner
import kotlin.io.print

class Kalkulator {

    fun bagi(nilai1: Int, nilai2: Int): Int = nilai1 / nilai2

    fun tambah(nilai1: Int, nilai2: Int): Int = nilai1 + nilai2

    fun kurang(nilai1: Int, nilai2: Int): Int = nilai1 - nilai2

    fun kali(nilai1: Int, nilai2: Int): Int = nilai1 * nilai2
}

fun main() {
    var run: Boolean = true
    while (run) {
        // Print Main Menu
        println("Kalkulator Kotlin")
        println("Kelompok 5 Ternary")
        println("===== Main Menu =====")
        println("1. Penjumlahan")
        println("2. Pengurangan")
        println("3. Perkalian")
        println("4. Pembagian")
        println("5. Keluar Program")
        print("Masukan Input (1 - 5) : ")

        val kalkulator = Kalkulator()
        val scanner: Scanner = Scanner(System.`in`)
        var userInput: Int = scanner.nextInt()
        when (userInput) {
            // Addition
            1 -> {
                // Operation
                print("Masukan Angka Pertama  : ")
                var num1 = scanner.nextInt()
                print("Masukan Angka Kedua    : ")
                var num2 = scanner.nextInt()
                print("Hasil Penjumlahan : ")
                val result = kalkulator.tambah(num1, num2)
                println(result)
                println()

                // Exiting operation
                print("Apakah anda ingin keluar (y/n)? ")
                var confirmationLoop: Boolean = true
                while (confirmationLoop) {
                    var userConfirmation: String = scanner.nextLine()
                    if (userConfirmation.lowercase() == "y") {
                        confirmationLoop = !confirmationLoop
                        run = !run
                    } else if (userConfirmation.lowercase() == "n") {
                        confirmationLoop = !confirmationLoop
                    } else if (userConfirmation.lowercase() == "y" ||
                                    userConfirmation.lowercase() == "n"
                    ) {
                        println("Input Tidak Valid. Mohon Ulangi Kembali")
                    }
                }
            }

            // Substract
            2 -> {
                // Operation
                print("Masukan Angka Pertama  : ")
                var num1 = scanner.nextInt()
                print("Masukan Angka Kedua    : ")
                var num2 = scanner.nextInt()
                print("Hasil Pengurangan : ")
                val result = kalkulator.kurang(num1, num2)
                println(result)
                println()

                // Exiting operation
                print("Apakah anda ingin keluar (y/n)? ")
                var confirmationLoop: Boolean = true
                while (confirmationLoop) {
                    var userConfirmation: String = scanner.nextLine()
                    if (userConfirmation.lowercase() == "y") {
                        confirmationLoop = !confirmationLoop
                        run = !run
                    } else if (userConfirmation.lowercase() == "n") {
                        confirmationLoop = !confirmationLoop
                    } else if (userConfirmation.lowercase() == "y" ||
                                    userConfirmation.lowercase() == "n"
                    ) {
                        println("Input Tidak Valid. Mohon Ulangi Kembali")
                    }
                }
            }

            // Multiply
            3 -> {
                // Operation
                print("Masukan Angka Pertama  : ")
                var num1 = scanner.nextInt()
                print("Masukan Angka Kedua    : ")
                var num2 = scanner.nextInt()
                print("Hasil Perkalian : ")
                val result = kalkulator.kali(num1, num2)
                println(result)
                println()

                // Exiting operation
                print("Apakah anda ingin keluar (y/n)? ")
                var confirmationLoop: Boolean = true
                while (confirmationLoop) {
                    var userConfirmation: String = scanner.nextLine()
                    if (userConfirmation.lowercase() == "y") {
                        confirmationLoop = !confirmationLoop
                        run = !run
                    } else if (userConfirmation.lowercase() == "n") {
                        confirmationLoop = !confirmationLoop
                    } else if (userConfirmation.lowercase() == "y" ||
                                    userConfirmation.lowercase() == "n"
                    ) {
                        println("Input Tidak Valid. Mohon Ulangi Kembali")
                    }
                }
            }

            // Divide
            4 -> {
                // Operation
                print("Masukan Angka Pertama  : ")
                var num1 = scanner.nextInt()
                print("Masukan Angka Kedua    : ")
                var num2 = scanner.nextInt()
                print("Hasil Pembagian : ")
                val result = kalkulator.bagi(num1, num2)
                println(result)
                println()

                // Exiting operation
                print("Apakah anda ingin keluar (y/n)? ")
                var confirmationLoop: Boolean = true
                while (confirmationLoop) {
                    var userConfirmation: String = scanner.nextLine()
                    if (userConfirmation.lowercase() == "y") {
                        confirmationLoop = !confirmationLoop
                        run = !run
                    } else if (userConfirmation.lowercase() == "n") {
                        confirmationLoop = !confirmationLoop
                    } else if (userConfirmation.lowercase() == "y" ||
                                    userConfirmation.lowercase() == "n"
                    ) {
                        println("Input Tidak Valid. Mohon Ulangi Kembali")
                    }
                }
            }

            // Exiting Apps
            5 -> {
                println("Sampai Jumpa Kembali")
                run = !run
            }

            // Input not found
            else -> println("Input Tidak Valid. Ulangi Kembali")
        }
    }
}
