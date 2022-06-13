fun main() {
    println("Ingrese A")
    var a= readln().toDouble()
    println("Ingrese B")
    var b= readln().toDouble()
    println("Ingrese C")
    var c= readln().toDouble()
    println("El area del triangulo es: ${areaTerreno(a,b,c)}")
}
fun areaRectangulo(b: Double, a : Double) :Double{
    return b*a
}
fun hipotenusa(a:Double,b:Double):Double{
    return Math.sqrt( Math.pow(a,2.0) * Math.pow(b,2.0) )
}
fun areaTriangulo(a:Double,b:Double,c:Double):Double{
    return (a+b+c)/2
}
fun areaTerreno(a:Double,b:Double,c:Double){
    var result = areaRectangulo(b,c)
    result+= areaTriangulo ((a-c),b,hipotenusa((a-c),b))
    return
}