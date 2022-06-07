import kotlin.math.ceil
fun main() {
    println("Ingrese estudiantes Gordos")
    val g = readln()!!.toInt()
    println("Ingrese estudiantes flacos")
    val f :Int= readln()!!.toInt()
    println("Ingrese la cantidad de sillas")
    val s = readln()!!.toInt()

    println("Se necesitan ${bus(g,f,s)} buses ")
}

fun bus(gordos:Int, flacos:Int, sillas: Int) :Int {
    require(sillas>0 && gordos>=0 && flacos>=0)
    return ceil((gordos*2 +flacos) /sillas.toDouble()).toInt()
}
