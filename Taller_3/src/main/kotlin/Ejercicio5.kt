fun main() {
    var n : Int
    println("Hasta que numero deseas la sumatoria")
    n = readln()!!.toInt()
    var suma=0
    var i=1
    repeat(n){
        suma+=i
        println("repeticion $i: $suma" )
        i++
    }
}