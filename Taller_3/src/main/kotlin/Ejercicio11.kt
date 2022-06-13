fun main() {
    print("Ingrese un numero entero positivo: ")
    var num = readln()!!.toInt()
    println("Los numeros perfectros hasta ${num} son: ")
    for (i in 1 .. num) {
        if (perfecto(i)) {
            println("$i")
        }
    }
}
fun perfecto(num: Int): Boolean {
    return sumaDivisores(num) == num
}