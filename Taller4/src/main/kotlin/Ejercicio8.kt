fun main() {
    print("Cantidad de triangulos ")
    var num: Int = readln()!!.toInt()
    var lista: MutableList<Triple<String, Double, Double>> = mutableListOf()
    repeat(num) {
        println("nombre triangulo ${it + 1}:  ")
        var nombre = readln()!!.toString()
        println("base triangulo ${it + 1}:  ")
        var base = readln()!!.toDouble()
        println("altura triangulo ${it + 1}:  ")
        var altura = readln()!!.toDouble()
        lista.add(Triple(nombre, base, altura))
    }
    var triangulo_mayor_area = mayor(lista)
    println("El triangulo de mayor area es $triangulo_mayor_area")
    println("El area del triangulo $triangulo_mayor_area es ${areaMayor(lista, triangulo_mayor_area)}")
}
fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}
fun mayor(lista: List<Triple<String, Double, Double>>): String {
    var result = lista[0]
    for (triangulo in lista) {
        if (areaTriangulo(result.second,result.third) < areaTriangulo(triangulo.second,triangulo.third))
            result=triangulo
    }
    return result.first
}
fun areaMayor(lista: List<Triple<String, Double, Double>>, buscar: String): Double {
    var triangulo = lista.first { x -> x.first.equals(buscar) }
    if (triangulo != null)
        return areaTriangulo(triangulo.second,triangulo.third)
    return -1.0
}