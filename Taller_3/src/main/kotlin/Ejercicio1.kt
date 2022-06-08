fun main() {
    var precio:Double


    //Ahora, escriba un programa que permita leer el precio devarioslibros(finalizarcuandoelprecioesceroonegativo)
    // y mostrar para cada libro, el precio neto (usando la funcióndesarrolladaanteriormente)

    /**
     * Se realiza un Do while porque se pide que se muestre el precio neto para cada libro
     */
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

