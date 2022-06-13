fun main() {
    println("Cantidad de puntos  ")
    var num = readln()!!.toInt()
    var lista: MutableList<Pair<Double, Double>> = mutableListOf()
    repeat(num) {
        println("Ingrese x del punto ${it + 1}:  ")
        var x: Double = readln()!!.toDouble()
        println("Ingrese y del punto ${it + 1}:  ")
        var y: Double = readln()!!.toDouble()
        lista.add(Pair(x, y))
    }
    var result = mayorDistancia(lista)
    println("El punto a mayor distancia esta en ${result.first}, distancia de ${result.second} en el cuadrante ${result.third}")
}
fun distancia(punto: Pair<Double, Double>): Double {
    return Math.sqrt(Math.pow(punto.first, 2.0) + Math.pow(punto.second, 2.0))
}
fun cuadrante(punto: Pair<Double, Double>): String {
    when {
        punto.first > 0.0 && punto.second == 0.0 -> return "1-4"
        punto.first > 0.0 && punto.second > 0.0 -> return "1"
        punto.first == 0.0 && punto.second > 0.0 -> return "1-2"
        punto.first < 0.0 && punto.second > 0.0 -> return "2"
        punto.first < 0.0 && punto.second == 0.0 -> return "2-3"
        punto.first < 0.0 && punto.second < 0.0 -> return "3"
        punto.first == 0.0 && punto.second < 0.0 -> return "3-4"
        punto.first > 0.0 && punto.second < 0.0 -> return "4"
        else -> return "0"
    }
}
fun mayorDistancia(lista: List<Pair<Double, Double>>): Triple<Pair<Double, Double>, Double, String> {
    var result = lista[0]
    for (item in lista) {
        if (distancia(result) < distancia(item)) {
            result = item
        }
    }
    return Triple(result, distancia(result), cuadrante(result))
}