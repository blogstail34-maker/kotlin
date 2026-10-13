fun main() {
    // Задание 1
    print("Введите сумму перевода в рублях: ")
    val amount = readln().toDouble()

    val commission = maxOf(amount * 0.0075, 35.0)
    val transferAmount = amount - commission

    println("Сумма перевода с учетом комиссии: $transferAmount₽. Комиссия: $commission₽")

    // Задание 2
    print("Введите количество отметок «Понравилось»: ")
    val likes = readln().toInt()

    val word = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $word")

    // Задание 3
    print("Какую сумму потратил пользователь?: ")
    var sum = readln().toDouble()

    print("Являетесь ли вы постоянным клиентом? (Y/N) ")
    val regularCustomer = readln().equals("Y", ignoreCase = true)

    when {
        sum >= 10001 -> sum *= 0.95
        sum >= 1001 -> sum -= 100
    }

    if (sum >= 10001 && regularCustomer) {
        sum *= 0.99
    }

    println("Сумма покупки с учетом скидок: $sum₽")
}