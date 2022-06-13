fun main() {
    print("Ingrese un numero entre el 1 y el 99: ")
    val num = readln()!!.toInt()
    if (num<99&&num>0)
        println("El numero ${num} en romano es: ${numero_romano(num)}")
    else
        println("Error en el numero ingresado debe ser mayor de 0 y menor de 99")
}
fun decenas_unidades(num: Int): Pair<Int, Int> {
    return Pair(num / 10, num % 10)
}
fun unidades(num: Int): String {
    val romano: String
    romano = when(num) {
        0 -> ""
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        else -> ""
    }
    return romano
}
fun decena(num: Int): String {
    val romano: String
    romano = when(num) {
        0 -> ""
        1 -> "X"
        2 -> "XX"
        3 -> "XXX"
        4 -> "XL"
        5 -> "L"
        6 -> "LX"
        7 -> "LXX"
        8 -> "LXXX"
        9 -> "XC"
        else -> ""
    }
    return romano
}
fun numero_romano(num: Int): String {
    val result = decenas_unidades(num)
    return decena(result.first) + unidades(result.second)
}





