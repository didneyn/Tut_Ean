fun main() {

    var notas: MutableList<Int> = mutableListOf()
    var cont =0
    do{
        cont ++
        println("Ingrese la nota del estudiante $cont")
        var t = readln()!!.toInt()
        if( t <= 100 )
        notas.add( t )
    } while ( t <= 100 )

    var result = estudiantes(notas)
    println("El promedio en la lista es de ${result.second}")
    println("Pasaron ${result.first} estudiantes")
    println("Perdieron ${notas.size-result.first} estudiantes")
}

fun estudiantes( list : MutableList<Int> ): Pair <Int,Int>{
    var perdieron =0
    var suma= 0
    for (nota in list){
        if(nota>60)
            perdieron++
        else
         suma+=nota
    }
    return perdieron to suma/list.size
}