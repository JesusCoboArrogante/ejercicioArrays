fun main(args: Array<String>) {
    var num = " "
    println("introduce un numero")
    num = readln()
    var array = num.toCharArray()

    capicua(array)




}

fun capicua(array: CharArray) {

    var charUno = array.copyOf()

    for (i in array.indices){
        for (j in array.indices. reversed()){
            if (array[i] == array[j]){
                println("es capicua")
            }
        }


    }

}










