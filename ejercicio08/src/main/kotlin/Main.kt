fun main(args: Array<String>) {
    var texto = ""
    Regex(texto)
    "//[a-zA-Z]".toRegex()
    println ("introduce una palabra")
    texto = readln()
    var ascci = texto.toIn


   palidromo(ascci)




}



fun palidromo (ascci: ByteArray){

    val segundo = intArrayOf(ascci.size)
    var j = 0
    for (i in ascci.indices.reversed()){
        segundo [i] = ascci[i].toInt()
        j++

       println(segundo[i])

    }

}









