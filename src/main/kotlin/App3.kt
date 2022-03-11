fun main() {
    while (true) {
        var discount: Int
        println("Введите сумму покупки в рублях")
        val sum = readLine().toString().toInt()
        println("Введите является ли покупатель меломаном? (да/нет)")
        val mel = readLine()
        if (mel.equals("да")) {
            if (sum in 0..1000) {
                discount = sum / 100 * 1
                println("Сумма покупки  ${sum - discount} р. Скидка ${discount} р.100")
            } else if (sum in 1001..10000) {
                discount = sum / 100 * 1 + 100
                println("Сумма покупки ${sum - discount} р. Скидка ${discount} р.")
            } else if (sum >= 10001) {
                discount = sum / 100 * 5
                val dopdiscont = (sum - discount) / 100 * 1
                println("Сумма покупки ${sum - discount - dopdiscont} р. Скидка ${discount + dopdiscont} р.")
            }
        } else if (mel.equals("нет")) {
            if (sum in 0..1000) {
                println("Сумма покупки. Скидки нет")

            } else if (sum in 1001..10000) {
                discount = 100
                println("Сумма покупки ${sum - discount}.Скидка ${discount} р.")

            } else if (sum >= 10001) {
                discount = sum / 100 * 5
                println("Сумма покупки ${sum - discount}.Скидка ${discount} р.")
            }
        } else{
            println()
        }
    }
}