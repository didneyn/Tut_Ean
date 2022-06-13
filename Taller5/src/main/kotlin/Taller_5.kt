class pendulo{
    private var l : Double = 0.0
    private var a : Double = 0.0

    constructor()

    constructor(l: Double, a: Double) {
        this.l = l
        this.a = a
    }

    fun getLongitud()=this.l
    fun getAceleracion()=this.a

    fun setLongitud(l: Double) { this.l = l }
    fun setAceleracion(a: Double) { this.a = a }

    fun  preriodoOcilacion():Double{
        return (2*Math.PI)*(Math.sqrt(a/l))
    }

}

data class pendulo2(
    private var l: Double= 0.0,
    private var a : Double
)

fun main() {
    var x = pendulo(2.0,2.0)
    println(  x.preriodoOcilacion() )
}