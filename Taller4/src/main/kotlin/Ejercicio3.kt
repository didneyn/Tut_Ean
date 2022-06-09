fun main() {

    var palabras: MutableList<String> = mutableListOf()
    do{
        println("Exit")
        println("Ingrese la palabra")
        var t = readln()!!.toString()
        palabras.add( t)
    } while ( t !="Exit" )


    println("La lista tiene : ${verbos(palabras)} verbos terminados en ar - ir -er")
}
fun verbos (lista : MutableList<String>): Int{
    var cont=0
    for (palabra in lista){
       if( palabra.endsWith("ar") || palabra.endsWith("ir") ||palabra.endsWith("er"))
           cont++
    }
    return cont
}