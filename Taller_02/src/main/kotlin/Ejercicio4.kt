fun main() {
    println("Ingrese el sueldo de pedro")
    var sueldo= readln().toInt()
    var result = calculo(sueldo)
    println("En arriendo se gasto ${result.first}")
    println("En comida se gasto ${result.second}")
    println("Le quedan ${sueldo - result.first-result.second}")
}
fun calculo(sueldo: Int ): Pair<Double, Double> {
return (sueldo * 0.4) to (sueldo * 0.15)
}