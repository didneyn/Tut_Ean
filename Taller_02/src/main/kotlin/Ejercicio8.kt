fun main() {
    print("Cantidad de estudiantes: ")
    val estudiantes = readln()!!.toInt()
    print("Cantidad de salones: ")
    val salones = readln()!!.toInt()
    print("Capacidad: ")
    val capacidad = readln()!!.toInt()
    val result = edificio(estudiantes, salones, capacidad)
    println("El edificio sera de ${result.first} pisos con ${result.second} salones y un total de $estudiantes estudiantes")
}
fun edificio(estudiantes: Int, salones: Int, capacidad: Int): Pair<Int, Int> {
    val pisos = Math.ceil(estudiantes.toDouble() / capacidad * salones.toDouble()).toInt()
    return Pair(pisos * salones, pisos)
}