
fun main(args: Array<String>) {
    var num = " "
    println("introduce un numero")
    num = readln()
    var array = num.toCharArray()
    arrais(array, num)

}

fun arrais(array: CharArray, num: String) {
    var segundo = CharArray(array.size)
    var tercero = CharArray(array.size)
    var j = 0
    for (i in array.indices.reversed()) {
        segundo[j] = array[i]
        j ++



    }
    for (i in array.indices) {
        tercero[i] = array[i]

    }



    if (tercero.contentEquals(segundo)) {
        println("$num es capicua")
    }else {
        println("$num no es capicua")
    }

}