fun main() {
    print("Ingrese el numero: ")
    var num = readln()!!.toInt()
    println("El $num tiene ${divisores(num)} divisores")
}
fun divisores(num: Int): Int {
    var count = 0
    repeat(num) {
        if (num % (it + 1) == 0) {
            count += 1
        }
    }
    return count
}