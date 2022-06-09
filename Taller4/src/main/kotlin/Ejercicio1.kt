fun main(){
    var lista: MutableList<Int> = mutableListOf()
    println("Ingrese la edad")
    var edad = readln()!!.toInt()
    while (edad>0){
        lista.add(edad)
        println("Ingrese la edad")
        edad = readln()!!.toInt()
    }
    var result = siglo(lista)
    println("La cantidad de estudiantes nacidos del siglo paso es ${result.first}")
    println("El promedio de las edades es ${result.second}")
}

fun siglo( list : MutableList<Int> ): Pair <Int,Double>{
    var siglo_pasado =0
    var suma=0
    for (edad in list){
        if(edad>=22){
            siglo_pasado++
        }
        suma+edad
    }
    return siglo_pasado to (suma/list.count().toDouble())
}