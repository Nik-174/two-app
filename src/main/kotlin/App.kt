fun main() {
    var komission = 0
    while (true) {
        println("Введите сумму перевода (комиссия 0,75%, минимум 35 рублей)")
        val sum = readLine()
        try {
            val amount = (sum.toString().toInt()) * 100
            if (amount < 3500) {
                println("Сумма меньше 35 рублей, попробуйте снова")
            } else {
                komission = (amount / 100 * 0.75).toInt()
                println("Комиссия составляет $komission копеек ")
            }
        } catch (e: Exception) {
            return println("Нужно вводить цифры !")
        }
    }
}