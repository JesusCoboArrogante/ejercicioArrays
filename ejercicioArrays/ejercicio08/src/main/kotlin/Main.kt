fun main() {
    val texto: String

    println ("introduce una palabra")
    texto = readln()
    val cambio = texto.toCharArray()

    val rev = reverso(texto.toCharArray())
   polimorfismo(rev, cambio )

}





fun reverso(cambio: CharArray): CharArray{
    val rev = CharArray(cambio.size)

    var j = 0
    for (i in cambio.indices.reversed()){
        rev[j] = cambio[i]
        j++



    }
    return rev
}

fun polimorfismo(rev: CharArray, cambio: CharArray){
    if (cambio.contentEquals(rev)){
        println("es capicua")
    }else{
        println("no lo es")
    }
}










