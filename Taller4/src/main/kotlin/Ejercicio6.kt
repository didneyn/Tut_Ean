fun main() {
    print("Ingrese la cantidad de estudiantes ")
    var num = readln()!!.toInt()
    var students: MutableList<Pair<String, Int>> = mutableListOf()
    repeat(num) {
        println("Nombre del estudiante ${it + 1}:  ")
        var nombre = readln()!!.toString()
        println("Año de nacimiento del estudiante ${it + 1}:  ")
        var nacimiento = readln()!!.toInt()
        students.add(Pair(nombre, nacimiento))
    }
    println("El estudiante mas viejo es ${masViejo(students)}")
}
fun masViejo(students: MutableList<Pair<String, Int>>): String {
    var student = students[0]
    for (obj in students) {
        if (student.second > obj.second){
            student = obj
        }
    }
    return student.first
}