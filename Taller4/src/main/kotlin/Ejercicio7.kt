fun main() {
    var lista_carros: MutableList<Pair<String, Double>> = mutableListOf()
    var placa = "test"
    var precio = 100.0
    while (!placa.isEmpty() && precio > 0) {
        print("Placa: ")
        placa = readln()!!
        print("Precio: ")
        precio = readln()!!.toDouble()
        lista_carros.add(Pair(placa, precio))
    }
    print("Placa a consultar ")
    var busqueda = readln()!!
    var preciobusqueda = buscar(lista_carros, busqueda)
    if (preciobusqueda > 0)
        println("El precio es ")
    else
        println("Vehiculo no encontrado")
}
fun buscar(cars: MutableList<Pair<String, Double>>, placa: String): Double {
    for (carro in cars) {
        if (carro.first.equals(placa)){
            return carro.second
        }
    }
    return 0.0
}