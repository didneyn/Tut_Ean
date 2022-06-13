fun main() {
    print("Ingrese X1: ")
    val x1 = readln()!!.toDouble()
    print("Ingrese Y1: ")
    val y1 = readln()!!.toDouble()
    print("Ingrese X2: ")
    val x2 = readln()!!.toDouble()
    print("Ingrese Y2: ")
    val y2 = readln()!!.toDouble()
    println("Distancia: ${distancia(x1, y1, x2, y2)}")
    println("Pendiente: ${pendiente(x1, y1, x2, y2)}")
    println("Medio: ${puntoMedio(x1, y1, x2, y2)}")
}
fun distancia(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return Math.sqrt(Math.pow(y2 - y1, 2.0) + Math.pow(x2 - x1, 2.0))
}
fun pendiente(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return (y2 - y1)/ (x2 - x1)
}
fun puntoMedio(x1: Double, y1: Double, x2: Double, y2: Double): Pair<Double, Double> {
    return Pair((x1 + x2)/2, ((y1 + y2)/2))
}