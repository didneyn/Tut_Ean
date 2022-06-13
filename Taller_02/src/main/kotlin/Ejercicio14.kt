fun main() {
    var nombre: String
    var edad: Int
    print("Nombre del primer hermano: ")
    nombre = readln()!!.toString()
    print("Edad del primer hermano: ")
    edad= readln()!!.toInt()
    val h1 = Hermano(nombre, edad)
    print("Nombre del segundo hermano: ")
    nombre = readln()!!.toString()
    print("Edad del segundo hermano: ")
    edad = readln()!!.toInt()
    val h2 = Hermano(nombre, edad)
    print("Nombre del tercer hermano: ")
    nombre = readln()!!.toString()
    print("Edad del tercer hermano: ")
    edad = readln()!!.toInt()
    val h3 = Hermano(nombre, edad)
    println("El hermano mayor se llama : ${nombre(h1, h2, h3)}")
}

class Hermano(
    var nombre: String,
    var edad: Int)

fun nombre(h1: Hermano, h2: Hermano, h3: Hermano): String {
    var hermano: Hermano
    hermano = h1
    if (hermano.edad < h2.edad) {
        hermano = h2
    }
    if (hermano.edad < h3.edad){
        hermano = h3
    }
    return hermano.nombre
}