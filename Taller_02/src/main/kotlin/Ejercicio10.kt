fun main() {
    print("Primer numero: ")
    val num1 = readln()!!.toDouble()
    print("Segundo numero: ")
    val num2 = readln()!!.toDouble()
    print("operador: ")
    val operador = readln()!!.toString()
    val result = operar(num1, num2, operador)
    println("El resultado de la ${result.second} es: ${result.first}")
}

fun operar(num1: Double, num2: Double, operador: String): Pair<Double, String> {
    when(operador) {
        "+" -> return Pair(num1 + num2, "suma")
        "-" -> return Pair(num1 - num2, "resta")
        "*" -> return Pair(num1 * num2, "multiplicacion")
        "/" -> return Pair(num1 / num2, "division")
        "%" -> return Pair(num1 % num2, "modulo")
        "**" -> return Pair(Math.pow(num1, num2), "potencia")
        else -> return Pair(0.0, "Error en la operación")
    }
}