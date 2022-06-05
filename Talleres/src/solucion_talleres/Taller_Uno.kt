package solucion_talleres

fun main() {
    start()
}

fun start(){
    do{
        println("************************************")
        println("Hello World")
        println("My first application in Kotlin")
        println("Punto 1 = 1")
        println("Punto 2 = 2")
        println("Punto 3 = 3")
        println("Salir = 4")
        println("Ingrese una opción")

        var op = readLine()!!.toInt();

        when (op) {
            1 -> uno()
            2 -> dos()
            3 -> tres()
            4 -> println("Adios")
            else -> {
                print("Ingrese una opcion correxta")
            }
        }
    }while (op != 4);

}

fun uno () {
    do{
        println("************************************")
        println("Ingrese una letra desde la a hasta la f")
        println("Ingrese s para salir")
        println("Salir = 4")
        println("Ingrese una opción")

        var op = readLine()!!.toString();

        when (op) {
            "a" -> uno_a()
            "b" -> uno_b()
            "c" -> uno_c()
            "d" -> uno_d()
            "e" -> uno_e()
            "f" -> uno_f()
            else -> {
                print("Ingrese una opcion correcta")
            }
        }
    }while (op != "s");
}
fun dos () {
    do{
        println("************************************")
        println("Ingrese una letra desde la a hasta la c")
        println("Ingrese s para salir")
        println("Salir = 4")
        println("Ingrese una opción")

        var op = readLine()!!.toString();

        when (op) {
            "a" -> dos_a()
            "b" -> dos_b()
            "c" -> dos_c()
            else -> {
                print("Ingrese una opcion correcta")
            }
        }
    }while (op != "s");
}
fun tres () {
    do{
        println("************************************")
        println("Ingrese una letra desde la a hasta la q")
        println("Ingrese s para salir")
        println("Salir = 4")
        println("Ingrese una opción")
        var op = readLine()!!.toString();
        when (op) {
            "a" -> tres_a()
            "b" -> tres_b()
            "c" -> tres_c()
            "d" -> tres_d()
            "e" -> tres_e()
            "f" -> tres_f()
            "g" -> tres_g()
            "h" -> tres_h()
            "i" -> tres_i()
            "j" -> tres_j()
            "k" -> tres_k()
            "l" -> tres_l()
            "m" -> tres_m()
            "n" -> tres_n()
            "o" -> tres_o()
            "p" -> tres_p()
            "q" -> tres_q()
            "s" -> println("Adios")
            else -> {
                print("Ingrese una opcion correcta")
            }
        }
    }while (op != "s");
}

fun uno_a(){

}
fun uno_b(){

}
fun uno_c(){

}
fun uno_d(){

}
fun uno_e(){

}
fun uno_f(){

}

fun dos_a(){

}
fun dos_b(){

}
fun dos_c(){

}

fun tres_a(){
    //Realice una función que halle el área de un triángulo.
    println("************************************")
    println("Area de un triangulo")
    println("************************************")
    print("Ingrese la base: ")
    var a : Double = readLine()!!.toDouble()
    print("Ingrese la altura: ")
    var b : Double = readLine()!!.toDouble()
    var resultato= ((a*b)/2)
    println("Punto 3-a:\nEl Area del triangulo es = $resultato")
    var t :String
    continuar()
}
fun tres_b(){
    //Si alquilar una bicicleta tiene cierto valor y puede transportar dos personas, determine cuántas bicicletas
    //necesito y cuánto dinero voy a gastar en alquilarlas, para transportar a todos los estudiantes de la
    //universidad.

}
fun tres_c(){
    //Según el DANE, el número de desempleados corresponde al 8.15% de la población activa. Escriba una
    //función que permita determinar cuántas personas desempleadas hay actualmente en Colombia.
}
fun tres_d(){
    //Se desea determinar cuántos dólares se puede adquirir con cierta cantidad de pesos colombianos.
}
fun tres_e(){
    //Una empresa que contrata personal requiere determinar la edad de las personas que solicitan trabajo,
    //pero cuando se les realiza la entrevista sólo se les pregunta el año en que nacieron. Realice el algoritmo
    //para solucionar este problema.
}
fun tres_f(){
    //Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan. Considere
    //que el cobro es con base en las horas que lo disponen y que las fracciones de hora se toman como completas
    //yrealice una función que permita determinar el cobro.
}
fun tres_g(){
    //Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura. Considere que se
    //cobra por m2 y realice una funciòn que le permita saber cuánto cobrar a un cliente.
}
fun tres_h(){
    //Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en bicicleta,
    //considerando que lleva una velocidad constante. Realice una función para tal fin
}
fun tres_i(){
    //Realice un algoritmo para determinar cuánto pagará finalmente una persona por un artículo equis,
    //considerando que tiene un descuento de 5%, y debe pagar 19% de IVA (debe retornar el precio con descuento y
    //el precio final).
}
fun tres_j(){
    //Realice una función para determinar la nota final que obtendrá un alumno considerando que realiza tres
    //exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%, mientras que el tercero de
    //50%.
}
fun tres_k(){
    //Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la persona de menor
    //edad.
}
fun tres_l(){
    //El presidente de la república ha decidido estimular a todos los estudiantes de una universidad mediante la
    //asignación de becas mensuales, para esto se tomarán en consideración los siguientes criterios: Para alumnos
    //mayores de 18 años con promedio mayor o igual a 90, la beca será de $2000.00; con promedio mayor o igual
    //a 75, de$1000.00; para los promedios menores de 75 pero mayores o iguales a 60, de $500.00; a los demás se
    //les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar. A los alumnos
    //de 18 años o menores de esta edad, con promedios mayores o iguales a 90, se les dará $3000; con promedios
    //menores a 90 pero mayores o iguales a 80, $2000; para los alumnos con promedios menores a 80 pero mayores
    //o iguales a 60, se les dará $100, y a los alumnos que tengan promedios menores a 6 se les enviará carta de
    //invitación. Realice la función correspondiente.
}
fun tres_m(){
    //Escriba una función que halle el volumen de un cono
}
fun tres_n(){
    //En la universidad vamos a conectar los diversos computadores que hay en una sala de cómputo con cables. Se
    //necesita un cable para conectar dos computadores, y debe haber conexión entre todos los computadores.
    //Escriba una función que determine el número de cables a comprar a partir del número de computadores que
    //hay en la sala.
}
fun tres_o(){
    //Se sabe que una batería de celular contamina 175 litros de agua. ¿Cuántos litros de agua serán contaminados
    //por la población de una ciudad en un año si cada persona utiliza 2 baterías al semestre?
}
fun tres_p(){
    //Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes por segundo. Escriba una función
    //que permita determinar cuántos minutos y segundos debo esperar para descargar la última película de La
    //Mujer Maravilla.
}
fun tres_q(){

}
fun continuar(){
    print("Presione una tecla para continuar")
    readLine()
}