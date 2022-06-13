fun main() {
    print("Ingrese x: ")
    val x = readln()!!.toDouble()
    print("Ingrese la inclinacion: ")
    val angulo = readln()!!.toDouble()

    println("La longitud de la escalera es de: ${calculo(x, angulo)}")
}
fun calculo( x:Double , angulo: Double){
    x / Math.sin(Math.toRadians(angulo))
}