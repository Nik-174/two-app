fun main() {
    while (true) {
        println("Введите количество лайков")
        val likes = readLine().toString().toInt()
        if (likes <= 20) {
            if (likes == 0) {
                println(" Понравилось $likes человек")
            } else if (likes == 1) {
                println(" Понравилось $likes человеку")
            } else {
                println(" Понравилось $likes человекам")
            }
        } else {
            if (likes % 100 == 11) {
                println(" Понравилось $likes человекам")
            } else if (likes % 10 == 1) {
                println(" Понравилось $likes человеку")
            } else {
                println(" Понравилось $likes человекам")
            }

        }
    }
}

