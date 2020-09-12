fun main(){
    var array1 = arrayOf(1, 3, 5, 7, 9)
    var array2 = arrayOf(0, 2, 4, 6, 8)
    var array3 = arrayListOf<Int>()
    for(index in 0..4){
        array3.add(array1[index])
        array3.add(array2[index])
    }
    println(array3)
}
/*Faça um Programa que leia dois vetores com 5 elementos cada. Gere um terceiro vetor de 10 elementos, cujos valores
deverão ser compostos pelos elementos intercalados dos dois outros vetores.
[1, 3, 5, 7, 9]
[0, 2, 4, 6, 8]

----

[1, 0, 3, 2, 5, 4, 7, 6, 9, 8]
*/