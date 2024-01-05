fun main(args: Array<String>) {

    var oceanoA = IntArray(10)
    var oceanoB = IntArray(10)
    var contador = 0


    do {
        println("que empiece el juego")
        var numero = (0..9).random()
        jugador(numero, oceanoA, contador)
        contador = jugador(numero, oceanoA, contador)

    }while (contador<4)



}

fun jugador(numero: Int , oceanoA: IntArray, contador: Int): Int{



        if (oceanoA[numero] == 0 ){
            oceanoA[numero] = 4
            contador+1

            return contador

        }




    return contador






}



fun escainet (oceanoB: IntArray){

    for (i in oceanoB.indices){
        var aleatorio = (0..19).random()
        if (oceanoB[i] != 8){
            oceanoB[aleatorio] = 8
        }else{

        }

    }
}
