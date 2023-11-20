fun main(args: Array<String>) {
   var numVector = 0
    do {
        println("introduce un numero")
        numVector = readln().toIntOrNull()?:0
    }while (numVector>10)


    val arrayVector = arrayOf(11,12,13,14,15,16,17)
    imprimirVector(arrayVector,numVector)

    maxVector(arrayVector)
    burbuja(arrayVector)



}
fun imprimirVector (arrayVector: Array<Int>, numVector: Int){

    println("el numero es " + arrayVector[numVector-1])
}

fun maxVector (arrayVector: Array<Int>){
    var maximo = 0
    var menor = 19
    var media = 0
    arrayVector.shuffle()
    for (indice in arrayVector.indices){
        print(arrayVector[indice])
       println("=$indice")
        media += arrayVector[indice]
        if (arrayVector[indice]>maximo){
            maximo = arrayVector[indice]


        }else if (arrayVector[indice]< menor) {
            menor = arrayVector[indice]
        }


    }
    println("el mayor es $maximo en el indice es ${arrayVector.indexOf(maximo)}")
    println("el menor es $menor en el indice es ${arrayVector.indexOf(menor)}")
    println("la media es " + media/2)

}

fun burbuja (arrayVector: Array<Int>){
    var contador = 0
    arrayVector.shuffle()


    for (i in 0 until arrayVector.size){
        for (j in 0 until arrayVector.size -1){



            if (arrayVector[j] > arrayVector[j + 1 ]){
                contador = arrayVector[j]
                arrayVector[j] = arrayVector[j + 1]
                arrayVector[j + 1] = contador


            }



            print("-${arrayVector[j]}-")







        }


    }

}
