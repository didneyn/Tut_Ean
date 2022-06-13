fun main() {
    println("Ingrese el numero positivo: ")
    var num :Int=readln().toInt()
    for(i in 1 .. num){
        println("El factorial de $i es: ${factorial(i)}")
    }

}
fun factorial(num:Int):Int{
    var facto:Int=1
    for(i in 1 .. num){
        facto*=i
    }
    return facto
}