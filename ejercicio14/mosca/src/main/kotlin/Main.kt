import kotlin.coroutines.Continuation

fun main(args: Array<String>) {
    val casillas = arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]")
    val mosca = arrayOf("[ ]","[ ]","[ ]","[ ]","[M]",)
    usuario(casillas)
    do {
        val posicion: Int
        println("donde esta la mosca")
        posicion = readln().toIntOrNull()?:0
        juego(mosca,posicion)
    }while (!false)


}

fun usuario(casillas: Array<String>) {
    for (i in casillas.indices) {
        print(casillas[i])
    }
    println()
}


fun juego (mosca: Array<String>, posicion: Int): Boolean {
    for (i in mosca.indices){

        if (mosca[i] == posicion.toString()){
            print(mosca[i])
            print("mosca muerta")
            return true

        }

    }
    println()
    return false
}


