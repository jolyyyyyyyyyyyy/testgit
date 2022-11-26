fun main(args: Array<String>) {
    Function1()
    Function2()
}
fun Function1() {
    print("подсчитывает количество знаков пунктуации в строке\n")
    val symbols = "java, kotlin, python, php".count({ letter ->
        letter == ','
    })
    print("Ответ: $symbols знаков пунктуации в строке")
    println()
}
fun Function2() {
    print("подсчитывает количество цифр в строке\n")
    val text = "в 2023 году этот ноутбук будет стоит 150к"
    var digits = 0
    for (i in 0..text.length - 1) {
        val num = text[i]
        if (num in '0'..'9') {
            digits++
        }
    }
    println("Ответ: $digits цифр в строке")
}