fun main() {
    var elevator = Elevator()
    var option: Int
    do {
        println("Menu Operaciones Ascensor \n" +
                "1.  Definir atributos del ascensor \n" +
                "2.  subir un piso \n" +
                "3.  bajar un piso \n" +
                "4.  Numero de pisos que atiende el ascensor \n" +
                "5.  Piso Actual \n" +
                "6.  Salir \n")
        println("Ingrese el numero de la operacion a realizar: ")
        option = readln()!!.toInt()
        when (option) {
            1 -> {
                println("Cantidad de pisos: ")
                elevator.pisos = readln()!!.toInt()
                println("Cantidad de sotanos: ")
                elevator.sotanos = readln()!!.toInt()
                println("Ascensor establecido")
            }
            2 -> {
                println("subiendo un piso ... ")
                elevator.siguientepiso()
            }
            3 -> {
                println("Bajando un piso ... ")
                elevator.pisoanterior()
            }
            4 -> println("Estan operando ${elevator.pisosFuncionando()} pisos")
            5 -> println("Ascensor en el piso ${elevator.pisoActual}")
            6 -> println("EXIT")
            else -> println("Ingrese una opcion valida")
        }

    } while (option != 6)
}
data class  Elevator(
    var pisos: Int = 1,
    var sotanos: Int = 0,
    var pisoActual: Int = 1,
) {
    fun siguientepiso() {
        var next_floor_number = pisoActual + 1
        pisoActual = when {
            next_floor_number > pisos -> pisos
            next_floor_number.equals(0) -> 1
            else -> next_floor_number
        }
    }
    fun pisoanterior() {
        var previous_floor_number = pisoActual - 1
        pisoActual = when {
            previous_floor_number < -sotanos -> -sotanos
            previous_floor_number.equals(0) -> -1
            else -> previous_floor_number
        }
    }
    fun pisosFuncionando(): Int = pisos + sotanos
}