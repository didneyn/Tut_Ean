fun main() {
    println("Ingrese X")
    val a :Int = readln().toInt()
    println("Ingrese Y")
    val b :Int = readln().toInt()
    println("Resultado de X2-2XY+Y2 de X=$a y Y=$b es: ${par(a,b)}")
}

fun par( x: Int, y: Int ): Int {
    return (x*2)-(2*x*y)+(2*y)
}