fun main() {
    val texto: String

    println ("introduce una palabra")
    texto = readln()
    val cambio = texto.toCharArray()

    val dere = derecho(texto.toCharArray())
    val rev = reverso(texto.toCharArray())
   polimorfismo(rev, dere )

}



fun derecho(cambio: CharArray): CharArray {
   val dere = CharArray(cambio.size)

    for (i in cambio.indices){
       dere [i] = cambio[i]

        //println(dere)

    }
    return dere

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

fun polimorfismo(rev: CharArray, dere: CharArray){
    if (dere.contentEquals(rev)){
        println("es capicua")
    }else{
        println("no lo es")
    }
}










