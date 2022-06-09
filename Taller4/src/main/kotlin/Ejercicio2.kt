fun main() {

    var altura= 0.0
    var lista: MutableList<Double> = mutableListOf()
    do{
        println("Ingrese la altura")
        altura = readln()!!.toDouble()
        if(altura>0.0 && altura<3.0)
            lista.add(altura)
    } while ( altura>0.0 && altura<3.0)

    var promedio =ciudadPromedio(lista)
    println("Promedio de altura de altura es: ${promedio}")
    println("cantidad de alturas bajo el promedio: ${ciudadMenor(lista,promedio)}")
}

fun ciudadMenor(list: MutableList<Double>, numero: Double): Int {
    var cont=0
    for (obj in list){
        if(obj<numero){
            cont++
        }
    }
    return cont
}

fun ciudadPromedio(list: MutableList<Double>): Double {
    var sum=0.0
    for (obj in list){
            sum +=obj
    }
    return sum/list.size
}



