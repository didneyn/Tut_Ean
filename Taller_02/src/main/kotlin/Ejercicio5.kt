fun main() {
    println("Radio Circulo Grande")
    var r = readln().toDouble()
    println("Radio Circulo Pequeño")
    var R = readln().toDouble()
    println("El area del circulo Grande es ${area(r)}")
    println("El area del circulo Pequeño es ${area(R)}")
    println("El area de la corona es ${corona(r,R)}")
}
fun area(r : Double) : Double{
    return (r*2)*Math.PI
}

fun corona(r : Double,R : Double) : Double{
    return area(r)-area(R)
}