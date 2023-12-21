
fun main(args: Array<String>) {
    val loteria = IntArray(6)


    aleatorio(loteria)
    comparacion(loteria)


}

fun aleatorio(loteria: IntArray) {
    for (i in loteria.indices) {
        val ran = (1..5).random()
        loteria[i] = ran
        print("-${loteria[i]}-")

    }
    println()
}

fun comparacion (loteria: IntArray){


    for (i in loteria.indices){
        for (j in loteria.indices){
            var contador = 0
            if (loteria[i] == loteria[j]){
                contador++

                println(contador)
            }

        }
    }


}

