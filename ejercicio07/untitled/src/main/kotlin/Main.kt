import kotlin.contracts.Returns

fun main(args: Array<String>) {
    var num = " "
    println("introduce un numero")
    num = readln()
    var array = num.toCharArray()
    arrais(array)










}

fun arrais(array: CharArray) {
var segundo = CharArray(array.size)
var tercero = CharArray (array.size)

    for ( i in array.indices.reversed()){

        segundo [i]  = array[i]
        println("Indice: $i, valor: ${array[i]}")


    }
    for (i in array.indices){
        tercero [i] = array[i]

    }
    println(segundo)


    if (tercero == segundo){
        println("es capicua")
    }














}












