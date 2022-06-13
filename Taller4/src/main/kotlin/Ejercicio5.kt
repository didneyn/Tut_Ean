fun main() {
    var ciudades: MutableList<String> = mutableListOf()
    var ciudad = "pass"
    while (!ciudad.isEmpty()) {
        print("Ingrese la ciudad a agregar: ")
        ciudad = readln()!!.toString()
        ciudades.add(ciudad.lowercase())
    }
    print("Ingrese la ciudad a buscar: ")
    var busqueda = readln()
    if (existe(ciudades, busqueda))
        println("La ciudad esta en la lista")
    else
        println("La ciudad no esta en la lista")
}

fun existe(lista_ciudades: MutableList<String>, ciudad_a_buscar: String): Boolean {
    if (ciudad_a_buscar in lista_ciudades)
        return true
    return false
}