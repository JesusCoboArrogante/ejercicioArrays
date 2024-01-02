fun main(args: Array<String>) {
    var oceano = IntArray(20)
    val numero = 0
    jugador (numero)

}

fun jugador(numero: Int) {
    for (i in 1..4){
        println("donde quieres poner el barco")
        numero = readln().toIntOrNull()?:0
    }
}
