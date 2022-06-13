fun main() {
    var precio:Double
    do{
        println("¿Cual es el precio del libro: ")
        precio = readln()!!.toDouble()
        println("El precio del libro es ${precioNeto(precio)}")
    }while (precio<=0);
}
fun precioNeto(precio_libro:Double):Double=
    when{
        precio_libro < 100_000 -> precio_libro * 0.88
        else -> precio_libro * 0.82
    }