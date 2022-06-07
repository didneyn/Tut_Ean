fun main() {
    println("¿Cual es el dia de hoy?")
    print ("Mañana es "+dia( readLine()!!.toString()))
}
fun dia ( x:String ):String{
    val manana : String
    manana = when (x) {
        "Lunes"->"Martes"
        "Martes"->"Miercoles"
        "Miercoles"->"Jueves"
        "Jueves"->"Viernes"
        "Viernes"->"Sabado"
        "Sabado"->"Domingo"
        "Domingo"->"Lunes"
        else -> {
            "Dia Invalido"
        }
    }
    return manana
}