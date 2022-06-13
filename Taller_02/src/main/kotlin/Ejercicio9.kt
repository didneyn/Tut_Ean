fun main() {
    print("Primer numero: ")
    var num1 = readln()!!.toInt()
    print("Segundo numero: ")
    var num2 = readln()!!.toInt()
    println("El mayor es : ${mayor(num1, num2)}")
}
fun mayor(num1: Int, num2: Int): Int {
    if (num1 > num2)
        return num1
    else
        return num2
}