fun main(){
    // 3
    println("- atividade 3")
    print("- Digite a altura:: ")
    var metros = readLine()!!.toDouble()
    println("- Para homens: ${(72.7 * metros) - 58}")
    println("- Para mulheres: ${(62.1 * metros) - 44.7}")
}