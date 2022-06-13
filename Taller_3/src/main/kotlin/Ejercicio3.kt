fun main() {
    var salir = "N"
    while (salir != "S"){
        print("Salario")
        var salario = readln()!!.toDouble()
        print("ventas")
        var ventas = readln()!!.toDouble()
        var result = comisionVenta(ventas)
        println("La comision es ${result} el salario sera de  ${salario + result}")
        println("Salir Y/N")
        salir = readln()!!.uppercase()
    }
}
fun comisionVenta (ventas: Double): Double {
    when {
        ventas > 50000 -> return 0.15 * (ventas - 50000)
        else -> return 0.0
    }
}
