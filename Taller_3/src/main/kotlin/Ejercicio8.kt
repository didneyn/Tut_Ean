fun main() {
    print("Ingrese el numero")
    var num = readln()!!.toInt()
    println("Las numeros primos hasta ${num} son: ")
    for (i in 2 .. num) {
        if (primos(i)) {
            println("$i")
        }
    }
}
fun primos(num: Int): Boolean {
    return divisores(num) == 2
}