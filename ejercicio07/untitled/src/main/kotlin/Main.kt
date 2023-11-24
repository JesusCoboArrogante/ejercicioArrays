import kotlin.contracts.Returns

fun main(args: Array<String>) {
    var num = " "
    println("introduce un numero")
    num = readln()
    var array = num.toCharArray()
    arrais(array)







}

fun arrais(array: CharArray) {
var segundo = CharArray (array.size)

    for (i in array.indices.reversed()){
        print(array[i])
        segundo [i] = array[i]



    }
    for (j in array.indices){

    }
    println()
    println(array)
    println(segundo)
    if (segundo.contentEquals(array)){
        println("es capicua")
    }



}












