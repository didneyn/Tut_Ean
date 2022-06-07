package solucion_talleres

import java.util.*

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
    println("************************************")
    println("1-a")
    println("************************************")
    print("Ingrese la x: ")
    var x : Double = readLine()!!.toDouble()
    print("Ingrese la m: ")
    var m : Double = readLine()!!.toDouble()
    print("Ingrese la n: ")
    var n : Double = readLine()!!.toDouble()

    var resultado= Math.sqrt(Math.pow( (x-m) ,2.0)/(n-1))
    println("Punto 1-a:\nEl resultado es = $resultado")
    continuar()
}
fun uno_b(){
    println("************************************")
    println("1-b")
    println("************************************")
    print("Ingrese la y: ")
    var y : Double = readLine()!!.toDouble()

    var resultado= -(Math.pow(y,3.0)-1)/((y+1)-(Math.sqrt(y+1)))
    println("Punto 1-b:\nEl resultado es = $resultado")
    continuar()
}
fun uno_c(){
    println("************************************")
    println("1-c")
    println("************************************")
    print("Ingrese la x: ")
    var x : Double = readLine()!!.toDouble()

    var resultado= x *  Math.pow((Math.pow(x,2.0)+1),3.0)
    println("Punto 1-c:\nEl resultado es = $resultado")
    continuar()
}
fun uno_d(){
    println("************************************")
    println("1-d")
    println("************************************")
    print("Ingrese la x: ")
    var x : Double = readLine()!!.toDouble()
    print("Ingrese la n: ")
    var n : Double = readLine()!!.toDouble()

    var resultado= 1-((Math.pow(x-2, 1.0 / n))/Math.pow(x,3.0))
    println("Punto 1-d:\nEl resultado es = $resultado")
    continuar()
}

/**
 * Enunciado: T = 1 - (((x-2)^(1/n))/(x^3))
 * Entradas
 * Variable n --> Double --> n
 * Variable x --> Double --> x
 * Salida
 * Cociente --> Double --> T
 */
fun resolverEcuacionD(n: Double, x: Double): Double {
    val T = 1 - (Math.pow((x - 2), 1/n)/Math.pow(x, 3.0))
    return T
}

/**
 * Enunciado: s = ((x!=y)&&(x<=y))
 * Entradas
 * Variable x --> Double --> x
 * Variable y --> Double --> y
 * Salida
 * Valor de verdad --> Boolean --> s
 */
fun resolverEcuacionE(x: Double, y: Double): Boolean {
    var s = ((x!=y)&&(x<=y))
    return s
}

/**
 * Enunciado: s = ((a>=b*c)||(b<=c))
 * Entradas
 * Variable a --> Double --> a
 * Variable b --> Double --> b
 * Variable c --> Double --> c
 * Salida
 * Valor de verdad --> Boolean --> s
 */
fun resolverEcuacionF(a: Double, b: Double, c: Double): Boolean {
    var s = ((a>=b*c)||(b<=c))
    return s
}

fun dos_a(){
    println("************************************")
    println("2-a")
    println("************************************")
    println("30+8*3/6-4%6")
    println("30+"+(8*3)+"/6-4%6")
    println("30+"+(8*3)+"/6-"+4%6)
    println("30+"+(8*3)/6+"-"+4%6)
    println("30+"+(((8*3)/6)-4%6));
    println(30+(((8*3)/6)-4%6));
    continuar()
}
fun dos_b(){
    println("************************************")
    println("2-b")
    println("************************************")
    println("30.0 / 20.0 -2.5 * 3.0")
    println(""+(30.0 / 20.0) + " -2.5 * 3.0")
    println(""+(30.0 / 20.0) + "-"+(2.5 * 3.0))
    println((30.0 / 20.0) -(2.5 * 3.0))
    continuar()
}
fun dos_c(){
    println("************************************")
    println("2-c")
    println("************************************")
    println("8/4/2*6")
    println(""+(8/4)+"/2*6")
    println(""+(8/4)/2+"*6")
    println(8/4/2*6)
    continuar()
}

/**
 * Enunciado: 8/4/2*6
 * Salida
 * Valor --> Int --> valor
 */
fun resolverOperacionC(): Int {
    /**
     * Explicación resolutiva de la precedencia de operadores:
     * 1. 8 / 4 = 2
     * 2. 2 / 2 = 1
     * 3. 1 * 6 = 6 (Resultado final)
     */
    var valor = 8/4/2*6
    return valor
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
    var resultado= ((a*b)/2)
    println("Punto 3-a:\nEl Area del triangulo es = $resultado")
    continuar()
}
fun tres_b(){
    //Si alquilar una bicicleta tiene cierto valor y puede transportar dos personas, determine cuántas bicicletas
    //necesito y cuánto dinero voy a gastar en alquilarlas, para transportar a todos los estudiantes de la
    //universidad.
    println("************************************")
    println("Alquiler de bicicleta")
    println("************************************")
    print("Ingrese el valor de la hora: ")
    var valorHora = readLine()!!.toDouble()
    print("Ingrese la cantidad de estudiantes: ")
    var estudiantes = readLine()!!.toInt()
    if ( estudiantes % 2 == 0 )
        estudiantes++
    var resultado = (estudiantes/2)*valorHora
    println("Punto 3-b:\npara transportar $estudiantes estudiantes se gasta un total de = $resultado por hora")
    continuar()
}
fun tres_c(){
    //Según el DANE, el número de desempleados corresponde al 8.15% de la población activa. Escriba una
    //función que permita determinar cuántas personas desempleadas hay actualmente en Colombia.
    println("************************************")
    println("8.15% Desempleo en colombia")
    println("************************************")
    print("Total de personas en colombia: ")
    var personas = readLine()!!.toDouble()
    var resultado = personas * 0.0815
    println("Punto 3-c:\n El total de personas desempleadas en colombia es de = $resultado")
    continuar()
}
fun tres_d(){
    //Se desea determinar cuántos dólares se puede adquirir con cierta cantidad de pesos colombianos.
    println("************************************")
    println("tasa de cambio dolar")
    println("************************************")
    print("Tasa del dolar hoy: ")
    var dollar = readLine()!!.toDouble()
    print("cantidad de pesos a convertir: ")
    var pesos = readLine()!!.toDouble()
    var resultado = pesos/dollar
    println("Punto 3-d:\n Con esos pesos puedes comprar un total de = $resultado dolares")
    continuar()
}
fun tres_e(){
    //Una empresa que contrata personal requiere determinar la edad de las personas que solicitan trabajo,
    //pero cuando se les realiza la entrevista sólo se les pregunta el año en que nacieron. Realice el algoritmo
    //para solucionar este problema.
    println("************************************")
    println("Calcular Edad")
    println("************************************")
    print("Ingrese el año de nacimiento: ")
    var ano = readLine()!!.toInt()
    var actualAno = Calendar.getInstance().get(Calendar.YEAR);
    var resultado = actualAno-ano
    println("Punto 3-e:\n La persona tiene un total = $resultado años")
    continuar()
}
fun tres_f(){
    //Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan. Considere
    //que el cobro es con base en las horas que lo disponen y que las fracciones de hora se toman como completas
    //yrealice una función que permita determinar el cobro.
    println("************************************")
    println("Estacionamiento")
    println("************************************")
    print("Ingrese el precio de la hora: ")
    var precioHora = readLine()!!.toDouble()
    print("Ingrese el precio de la fracción: ")
    var precioFraccion = readLine()!!.toDouble()

    print("Ingrese la hora la cantidad de horas: ")
    var horas = readLine()!!.toInt()
    print("Ingrese la hora la cantidad de minutos: ")
    var minutos = readLine()!!.toInt()
    if(minutos % 15 != 0){
        minutos+=15-(minutos % 15)
    }
    var resultado = (precioHora*horas)+(precioFraccion*(minutos/15))
    println("Punto 3-f:\n Debe pagar un total de = $resultado ")
    continuar()
}
fun tres_g(){
    //Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura. Considere que se
    //cobra por m2 y realice una funciòn que le permita saber cuánto cobrar a un cliente.
    println("************************************")
    println("La brocha gorda")
    println("************************************")
    print("Ingrese el valor del metro cuadrado: ")
    var valor = readLine()!!.toInt()
    print("Ingrese la cantidad de metros cuadrados: ")
    var metros = readLine()!!.toInt()
    var resultado = valor*metros
    println("Punto 3-g:\n Se debe cobrar un total de = $resultado")
    continuar()
}
fun tres_h(){
    //Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en bicicleta,
    //considerando que lleva una velocidad constante. Realice una función para tal fin
    println("************************************")
    println("Tiempo de trayecto")
    println("************************************")
    print("Ingrese la velocidad: ")
    var velocidad = readLine()!!.toDouble()
    print("Ingrese la distancia entre las ciudades: ")
    var distancia = readLine()!!.toDouble()
    var resultado = distancia/velocidad
    println("Punto 3-h:\n Se gastaria un total de = $resultado horas")
    continuar()
}
fun tres_i(){
    //Realice un algoritmo para determinar cuánto pagará finalmente una persona por un artículo equis,
    //considerando que tiene un descuento de 5%, y debe pagar 19% de IVA (debe retornar el precio con descuento y
    //el precio final).
    println("************************************")
    println("Pago por articulo")
    println("************************************")
    print("Ingrese el precio del articulo: ")
    var precio = readLine()!!.toDouble()
    var descuento=precio*0.95
    var total=descuento*1.19
    println("Punto 3-i:\n El articulo con descuento es de = $descuento \n debe pagar un total de $total con iva")
    continuar()
}
fun tres_j(){
    //Realice una función para determinar la nota final que obtendrá un alumno considerando que realiza tres
    //exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%, mientras que el tercero de
    //50%.
    println("************************************")
    println("nota final")
    println("************************************")
    print("Ingrese la nota del primer examen: ")
    var examen1 = readLine()!!.toDouble()
    print("Ingrese la nota del segundo examen: ")
    var examen2 = readLine()!!.toDouble()
    print("Ingrese la nota del tercer examen: ")
    var examen3 = readLine()!!.toDouble()
    var total= ((examen1+examen2)*0.25)+(examen3*0.5)
    println("Punto 3-j:\n La nota final es de $total")
    continuar()
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
    println("************************************")
    println("volumen de un cono")
    println("************************************")
    print("Ingrese la altura: ")
    var altura = readLine()!!.toDouble()
    print("Ingrese el radio: ")
    var radio = readLine()!!.toDouble()

    var total= (1/3)* altura * Math.PI * Math.pow(radio,2.0)
    println("Punto 3-j:\n El volumen es = $total")
    continuar()
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
    println("************************************")
    println("Contaminacion de baterias")
    println("************************************")
    print("Ingrese la cantidad de personas: ")
    var personas = readLine()!!.toInt()
    var resultado = (personas*2)*175
    println("Punto 3-o:\n Se contaminaria un total de  = $resultado litros de agua en un año")
    continuar()
}
fun tres_p(){
    //Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes por segundo. Escriba una función
    //que permita determinar cuántos minutos y segundos debo esperar para descargar la última película de La
    //Mujer Maravilla.
    println("************************************")
    println("Tiempo de descarga")
    println("************************************")
    print("Ingrese la cantidad de megabits de la pelicula: ")
    var tamaño = readLine()!!.toDouble()

    var resultado = tamaño/4
    var segundos = resultado%60
    resultado = (resultado-segundos)/60
    println("Punto 3-p:\n Se demora un total de = $resultado minutos con $segundos segundos")
    continuar()
}
fun tres_q(){
    println("************************************")
    println("Valor Presente")
    println("************************************")
    print("ingrese c: ")
    var c = readLine()!!.toDouble()
    print("ingrese t: ")
    var t = readLine()!!.toDouble()
    print("ingrese n: ")
    var n = readLine()!!.toDouble()

    var resultado = c/Math.pow((1+t),n)
    println("Punto 3-q:\n El valor presente es de = $resultado")
    continuar()
}
fun continuar(){
    print("Presione una tecla para continuar")
    readLine()
}

/**
 * Enunciado: Realice un algoritmo para determinar cuánto pagará
 * finalmente una persona por un artículo equis, considerando que
 * tiene un descuento de 5%, y debe pagar 19% de IVA (debe retornar
 * el precio con descuento y el precio final).
 * Entradas
 * Costo del artículo --> Double --> costoArticulo
 * Salida
 * Valor final a pagar --> Double --> valorFinal
 */
fun calcularCostoRealArticulo(costoArticulo: Double): Double {
    var valorFinal = (costoArticulo + (costoArticulo * 0.19)) - (costoArticulo * 0.05)
    return valorFinal
}

/**
 * Enunciado: Realice una función para determinar la nota
 * final que obtendrá un alumno considerando que realiza tres
 * exámenes, de los cuales el primero y el segundo tienen una
 * ponderación de 25%, mientras que el tercero de 50%.
 * Entradas
 * Nota primer examen --> Double --> notaPrimerExamen
 * Nota segundo examen --> Double --> notaSegundoExamen
 * Nota tercer examen --> Double --> notaTercerExamen
 * Salida
 * Nota final --> Double --> notaFinal
 */
fun calcularNotaFinal(
    notaPrimerExamen : Double,
    notaSegundoExamen: Double,
    notaTercerExamen : Double): Double {
    val baseCalificativa = 5.0
    var notaFinal = (((notaPrimerExamen * 25) / baseCalificativa)  +
            ((notaSegundoExamen * 25) / baseCalificativa)  +
            ((notaTercerExamen  * 50) / baseCalificativa)) * 0.05
    return notaFinal
}

/**
 * Enunciado: Se tiene el nombre y la edad de tres personas.
 * Se desea saber el nombre y la edad de la persona de menor edad.
 * Entradas
 * personas --> Array<Pair<String, Int>> --> personas
 * Salida
 * Persona de menor edad --> String --> nombrPersonaMenorEdad
 */
fun calcularPersonaMenorEdad(personas: Array<Pair<String, Int>>): String {
    var i = 0
    for (persona in personas) {
        if (personas.get(0).second > persona.second) {
            var temporal = persona
            personas.set(i, personas.get(0))
            personas.set(0, temporal)
        }
        i++
    }
    var nombrPersonaMenorEdad = personas.get(0).first
    return "$nombrPersonaMenorEdad es la persona de menor edad."
}

/**
 * Clase Beca
 * Descripción: Tipo de dato necesario para crear el ArrayList de la función calcularBecas
 * Propiedades:
 * Nombre del estudiante --> String --> nombreEstudiante
 * Edad --> Int --> edad
 * Promedio académico --> Double --> promedio
 * Valor de la beca --> Doube --> valorBeca
 */
data class Beca<T1, T2, T3, T4> (
    var nombreEstudiante: String,
    var edad            : Int,
    var promedio        : Double,
    var valorBeca       : Double)

/**
 * Enunciado: El presidente de la república ha decidido estimular a todos
 * los estudiantes de una universidad mediante la asignación de becas mensuales,
 * para esto se tomarán en consideración los siguientes criterios: Para alumnos
 * mayores de 18 años con promedio mayor o igual a 90, la beca será de $2000.00;
 * con promedio mayor o igual a 75, de$1000.00; para los promedios menores de 75
 * pero mayores o iguales a 60, de $500.00; a los demás se les enviará una carta
 * de invitación incitándolos a que estudien más en el próximo ciclo escolar. A
 * los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales
 * a 90, se les dará $3000; con promedios menores a 90 pero mayores o iguales a 80,
 * $2000; para los alumnos con promedios menores a 80 pero mayores o iguales a 60,
 * se les dará $100, y a los alumnos que tengan promedios menores a 6 se les enviará
 * carta de invitación. Realice la función correspondiente.
 * Entradas
 * Listado de estudiantes: nombre, edad y promedio por fila --> Array<Triple<String, Int, Double>> --> estudiantes
 * Salida
 * Informe de las becas --> String --> informe
 */
fun calcularBecas(estudiantes: Array<Triple<String, Int, Double>>): String {
    var becas: ArrayList<Beca<String, Int, Double, Double>> = arrayListOf()
    var valorBeca: Double = 0.00
    for (estudiante in estudiantes) {
        if (estudiante.second > 18) {
            if (estudiante.third >= 90) {
                valorBeca = 2000.0
            } else if (estudiante.third >= 75) {
                valorBeca = 1000.0
            } else if (estudiante.third >= 60) {
                valorBeca = 500.0
            } else {
                valorBeca = 0.0
            }
        } else {
            if (estudiante.third >= 90) {
                valorBeca = 3000.0
            } else if (estudiante.third >= 80) {
                valorBeca = 2000.0
            } else if (estudiante.third >= 60) {
                valorBeca = 100.0
            } else {
                valorBeca = 0.0
            }
        }
        becas.add(Beca(estudiante.first, estudiante.second, estudiante.third, valorBeca))
    }
    var informe = ""
    for (beca in becas) {
        var (nombreEstudiante, edad, promedio, tipoBeca) = beca
        if (tipoBeca != 0.0) {
            informe += "- $nombreEstudiante de $edad años, con promedio de $promedio, obtuvo una beca de $$tipoBeca.\n"
        } else {
            informe += "- $nombreEstudiante de $edad años, con promedio de $promedio, no obtuvo beca por lo tanto se le enviará una invitación.\n"
        }
    }
    return informe
}

/**
 * Enunciado: Escriba una función que halle el volumen de un cono.
 * Entradas
 * Radio --> Double --> radio
 * Altura --> Double -->altura
 * Salida
 * Volumen del cono --> Double --> volumen
 */
fun calcularVolumenCono(radio: Double, altura: Double): Double {
    val PI: Double = 3.141592
    var volumen = (PI * Math.pow(radio, 2.0) * altura) / 3.0
    return volumen
}

/**
 * Enunciado: En la universidad vamos a conectar los diversos computadores
 * que hay en una sala de cómputo con cables. Se necesita un cable para conectar
 * dos computadores, y debe haber conexión entre todos los computadores. Escriba
 * una función que determine el número de cables a comprar a partir del número de
 * computadores que hay en la sala.
 * Entradas
 * Total de computadores a conectar --> Int --> totalComputadores
 * Salida
 * Cantidad de cables a comprar --> Int --> totalCables
 */
fun calcularCantidadCables(totalComputadores: Int): Int {
    var totalCables = totalComputadores / 2
    return totalCables
}

/**
 * Enunciado: Se sabe que una batería de celular contamina 175 litros de agua.
 * ¿Cuántos litros de agua serán contaminados por la población de una ciudad en
 * un año si cada persona utiliza 2 baterías al semestre?
 * Entradas
 * Cantidad total de habitantes --> Int --> habitantes
 * Salida
 * Litros de agua contaminada por año --> Int --> totalLitros
 */
fun calcularLitrosAguaContaminada(habitantes: Int): Int {
    var totalLitros = 175 * (habitantes * 4)
    return totalLitros
}

/**
 * Enunciado: Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes
 * por segundo. Escriba una función que permita determinar cuántos minutos y segundos
 * debo esperar para descargar la última película de La Mujer Maravilla.
 * Entradas
 * Peso en GB de la película de La Mujer Maravilla --> Double --> pesoPelicula
 * Salida
 * Tiempo total de descarga de la película --> String --> tiempoDescarga
 */
fun calcularTiempoDescarga(pesoPelicula: Double): String {
    var megas = pesoPelicula * 1000.0
    var totalSegundosDescarga = (megas / 4.0).toInt()
    var minutos = totalSegundosDescarga / 60
    var segundos = totalSegundosDescarga % 60
    if (!(minutos > 0 && segundos > 0)) {
        segundos = 0
    }
    var tiempoDescarga = "La película de La Mujer Maravilla se terminará de descargar en $minutos " +
            "minutos con $segundos segundos."
    return tiempoDescarga
}

/**
 * Enunciado: El valor presente de un cierto capital de dinero a una tasa de interés
 * durante años se encuentra a partir de la fórmula: VP = C/((1+t)^n)
 * Escriba una función que determine el valor presente a partir de los datos de entrada dados.
 * Entradas
 * Capital de dinero --> Double --> C
 * Tasa de interés --> Double --> t
 * Cantidad de años --> Double --> n
 * Salida
 * Valor presente --> Double --> VP
 */
fun calcularVP(C: Double, t: Double, n: Double): Double {
    val VP = C/(Math.pow((1+t), n))
    return VP
}