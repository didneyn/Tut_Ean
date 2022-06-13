fun main() {
    print("Ingrese el numero: ")
    var num = readln()!!.toInt()
    println("La suma de los divisores es ${sumaDivisores(num)}")
}
fun sumaDivisores(num: Int): Int {
    var suma = 0
    repeat(num - 1) {
        if (num % (it + 1) == 0) {
            suma += it + 1
        }
    }
    return suma
}