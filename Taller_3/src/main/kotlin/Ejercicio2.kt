fun main() {
    var ventas = 1.0
    while(ventas >= 0) {
        print("Cual es el volumen de ventas")
        ventas = readln()!!.toDouble()
        println("La comisión es ${comision(ventas)}")
    }
}
fun comision(ventas: Double): Double =
    when {
        ventas < 50000 -> 0.07 * ventas
        ventas <= 100000  -> 0.09 * ventas + 5000
        ventas <= 200000 -> 0.11 * ventas + 10000
        ventas <= 500000 -> 0.13 * ventas + 20000
        ventas > 500000 -> 0.15 * ventas + 40000
        else -> 0.0
    }