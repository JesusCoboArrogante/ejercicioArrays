import kotlin.coroutines.Continuation

fun main(args: Array<String>) {
    val casillas = arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]")
    val mosca = arrayOf("A","B","C","D","[M]",)
    usuario(casillas)
        do {
            val posicion: Int
            println("donde esta la mosca")
            posicion = readln().toIntOrNull()?:0
            juego(mosca,posicion)
        }while (false)




}

fun usuario(casillas: Array<String>) {
    for (i in casillas.indices) {
        print(casillas[i])
    }
    println()
}


fun juego (mosca: Array<String>, posicion: Int){

        for (i in mosca.indices){
            if ("[M]" == mosca[posicion]){
                print("mosca muerta" )



            }else if (mosca[posicion +1] == "[M]" ||  mosca[posicion -1] == "[M]"){
                mosca.shuffle()
                print(mosca[i])
                println()
                println("casi pero no")


            } else{
                println("sigue jugando")

            }

        }



    println()

}




