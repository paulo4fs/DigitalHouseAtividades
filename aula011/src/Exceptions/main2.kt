package Exceptions

fun main() {
    var arr = arrayListOf<String?>(null)
    arr.add("Pato")
    arr.add("Cachorro")
    arr.add("Gato")
    try {
        println(arr[2])
        println(arr[5])
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
    //teremos um erro
}