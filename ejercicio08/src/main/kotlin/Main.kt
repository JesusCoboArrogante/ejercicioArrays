fun main(args: Array<String>) {
    var texto = ""
    Regex(texto)
    "//[a-zA-Z]".toRegex()
    println ("introduce una palabra")
    texto = readln()
    var array = CharArray(texto)
    palidromo(array)




}



fun palidromo (array: CharArray){
    var medida = array.size
    val media = null
    val segundo = arrayOf(media)

    var j = 0
    for (i in array.indices.reversed()){
        segundo [i] = array[i]
        j++

       println(segundo[i])

    }
    println(array)
}







