package solucion_tallers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FuncionesKtTest {

    @Test
    fun resolverEcuacionD() {
        assertEquals(0.99074074074074074074074074074074, ejercicios.resolverEcuacionD(2.0, 6.0))
    }

    @Test
    fun resolverEcuacionE() {
        assertEquals(true, ejercicios.resolverEcuacionE(4.0, 8.0))
    }

    @Test
    fun resolverEcuacionF() {
        assertEquals(true, ejercicios.resolverEcuacionF(1.0, 2.0, 3.0))
    }

    @Test
    fun resolverOperacionC() {
        assertEquals(6, ejercicios.resolverOperacionC())
    }

    @Test
    fun calcularCostoRealArticulo() {
        assertEquals(1140.0, ejercicios.calcularCostoRealArticulo(1000.0))
    }

    @Test
    fun calcularNotaFinal() {
        assertEquals(2.75, ejercicios.calcularNotaFinal(2.5, 2.5, 3.0))
    }

    @Test
    fun calcularPersonaMenorEdad() {
        assertEquals("Juan es la persona de menor edad.", ejercicios.calcularPersonaMenorEdad(arrayOf(Pair("Maria", 50), Pair("Juan", 40), Pair("Fernando", 69))))
    }

    @Test
    fun calcularBecas() {
        assertEquals("- Ernesto de 20 años, con promedio de 82.4, obtuvo una beca de $1000.0.\n" +
                "- Luisa de 19 años, con promedio de 63.0, obtuvo una beca de $500.0.\n" +
                "- Carlos de 22 años, con promedio de 85.8, obtuvo una beca de $1000.0.\n" +
                "- Juana de 24 años, con promedio de 97.0, obtuvo una beca de $2000.0.\n" +
                "- Carolina de 21 años, con promedio de 90.5, obtuvo una beca de $2000.0.\n" +
                "- Mateo de 25 años, con promedio de 30.3, no obtuvo beca por lo tanto se le enviará una invitación.\n" +
                "- Maria de 19 años, con promedio de 77.7, obtuvo una beca de $1000.0.\n" +
                "- Pedro de 17 años, con promedio de 86.0, obtuvo una beca de $2000.0.\n" +
                "- Antonia de 18 años, con promedio de 63.0, obtuvo una beca de $100.0.\n" +
                "- Ana de 16 años, con promedio de 47.0, no obtuvo beca por lo tanto se le enviará una invitación.\n" +
                "- Mauricio de 15 años, con promedio de 65.5, obtuvo una beca de $100.0.\n" +
                "- Angelica de 18 años, con promedio de 89.1, obtuvo una beca de $2000.0.\n" +
                "- Esteban de 17 años, con promedio de 93.0, obtuvo una beca de $3000.0.\n" +
                "- Sara de 16 años, con promedio de 62.0, obtuvo una beca de $100.0.\n",
            ejercicios.calcularBecas(arrayOf(
                Triple("Ernesto", 20, 82.4),
                Triple("Luisa", 19, 63.0),
                Triple("Carlos", 22, 85.8),
                Triple("Juana", 24, 97.0),
                Triple("Carolina", 21, 90.5),
                Triple("Mateo", 25, 30.3),
                Triple("Maria", 19, 77.7),
                Triple("Pedro", 17, 86.0),
                Triple("Antonia", 18, 63.0),
                Triple("Ana", 16, 47.0),
                Triple("Mauricio", 15, 65.5),
                Triple("Angelica", 18, 89.1),
                Triple("Esteban", 17, 93.0),
                Triple("Sara", 16, 62.0)
            )))
    }

    @Test
    fun calcularVolumenCono() {
        assertEquals(1206.371328, ejercicios.calcularVolumenCono(8.0, 18.0))
    }

    @Test
    fun calcularCantidadCables() {
        assertEquals(8, ejercicios.calcularCantidadCables(16))
    }

    @Test
    fun calcularLitrosAguaContaminada() {
        assertEquals(70000, ejercicios.calcularLitrosAguaContaminada(100))
    }

    @Test
    fun calcularTiempoDescarga() {
        assertEquals("La película de La Mujer Maravilla se terminará de descargar en " +
                "4 minutos con 10 segundos.", ejercicios.calcularTiempoDescarga(1.0))
    }

    @Test
    fun calcularVP() {
        assertEquals(1.024, ejercicios.calcularVP(100.0, 1.5, 5.0))
    }
}