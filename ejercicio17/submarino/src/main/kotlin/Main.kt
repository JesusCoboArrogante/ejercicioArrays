fun main(args: Array<String>) {

    val oceanoA = IntArray(5)

    val oceanoB = IntArray(10)

    jugador(oceanoA)
    println()

    escainet(oceanoB)
    println()
    juegoHumano(oceanoB, oceanoA)
}

fun juegoHumano(oceanoB: IntArray, oceanoA: IntArray,) {
    var barcoUndido = 0
    var terminatorUndido = 0
    var posicion = 0

        do {
            var coordenada = (0..4).random()
            println("introduce un numero")
            posicion = readln().toIntOrNull()?:0
            if (oceanoB[posicion] == 1){
                println("terminator hundido ")
                terminatorUndido++
                oceanoB[posicion] = 0
            }
            println("elige coordenada")
            println(coordenada)
            if (oceanoA[coordenada] == 4){
                println("barco hundidio")
                    barcoUndido++
                oceanoA[coordenada] = 0

            }

        }while (barcoUndido < 4 && terminatorUndido < 4 )

        if (barcoUndido == 4){

            println("fin del mundo")
            println("tus barcos muertos" + barcoUndido + "terminator elimunador " +terminatorUndido )



        }else if (terminatorUndido == 4){

            println("has ganado")
            println("tus barcos muertos " + barcoUndido + " terminator elimunador " + terminatorUndido )




        }
}

fun jugador(oceanoA: IntArray){
    var contador =0
    var numero = 0

        do {
            println("que empiece el juego")
            numero = readln().toIntOrNull()?:0
            if (oceanoA[numero] == 0 ){
                oceanoA[numero] = 4
                contador++


            }else{
                println("casilla ocupada")

            }

        }while (contador<4)



}



fun escainet (oceanoB: IntArray){
    var segundoContador = 0
    do {
        var aleatorio = (0..9).random()
        if (oceanoB[aleatorio] == 0){
            oceanoB[aleatorio] = 1
            segundoContador++
        }
        
    }while (segundoContador < 4)




}
