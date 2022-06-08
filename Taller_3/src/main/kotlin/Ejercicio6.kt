fun main() {
    println("Digite el numero entero positivo")

    var n = readln()!!.toInt()
    println("Tabla de multiplicar del $n")
    repeat(10){
        println("$n x ${(it+1)} = ${n*(it+1)}")
    }

}