fun main() {
    print("Ingrese el salario del empleado: ")
    val salario = readln()!!.toDouble()
    println("El valor del aumento es ${sueldo(salario).first} y por tanto el salario quedara en ${sueldo(salario).second}")
}

fun sueldo(salario: Double): Pair<Double, Double> {
    when(salario) {
        in 0.0 .. 800000.0 -> return Pair(0.1 * salario, 1.1 * salario)
        in 800000.1 .. 1200000.0 -> return Pair(0.08 * salario, 1.08 * salario)
        else ->return Pair(0.05 * salario, 1.05 * salario)
    }
}