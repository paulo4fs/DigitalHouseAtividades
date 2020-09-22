package Exceptions

fun main() {
    var arr = arrayListOf<String>()
    arr.add("Pato")
    arr.add("Cachorro")
    arr.add("Gato")
    try {
        println(arr[3])
    } catch (ex: Exception) {
        println("num foi")
    }
    //teremos um erro
}