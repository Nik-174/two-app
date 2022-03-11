fun main() {
    while (true) {
        println("Введите количество лайков")
        val likes = readLine().toString().toInt()
        val namber = (likes % 10)
        if (namber == 1) {
            println(" Понравилось $likes человеку")
        } else if (namber in 2..9 || namber == 0) {
            println(" Понравилось $likes человекам")
        }
    }
}