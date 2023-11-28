
fun main(args: Array<String>) {
    var num = " "
    println("introduce un numero")
    num = readln()
    var array = num.toCharArray()
    arrais(array)

}

fun arrais(array: CharArray) {
    var segundo = CharArray(array.size)
    var tercero = CharArray(array.size)
    var j = 0
    for (i in array.indices.reversed()) {
        segundo[j]= array[i]
        j+=1
        println(array[i])


    }
    for (i in array.indices) {
        tercero[i] = array[i]

    }
    println(segundo)


    if (tercero.contentEquals(segundo)) {
        println("es capicua")
    }else {
        println("no es capicua")
    }

}