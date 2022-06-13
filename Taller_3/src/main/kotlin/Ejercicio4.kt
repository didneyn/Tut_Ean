fun main() {
    print("Cantidad de empleados")
    var empleados = readln()!!.toInt()
    repeat(empleados) {
        println("Cantidad de horas trabajadas del empleado ${it + 1}")
        var horas = readln()!!.toDouble()
        println("El salario del empleado en la posición ${it + 1} es  de: ${salario(horas)}")
    }
}
fun salario(horas: Double): Double {
    when {
        horas <= 35 -> return 15000 * horas
        horas < 60 -> return 15000 * 35 + (18000 * (horas - 35))
        horas > 60 -> return 15000 * 35 + (18000 * 25) + (25000 *  (horas - 60))
        else -> return 0.0
    }
}