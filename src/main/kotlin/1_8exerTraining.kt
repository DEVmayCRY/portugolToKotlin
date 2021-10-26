/*
    8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
    for maior que 100, caso contrário imprimi-la com o valor zero.
*/

fun main(args: Array<String>) {
    print("O valor de N é: ")
    var n = readLine()!!.toInt()

    if(n>100){
        println(" N = $n")
    }else{
        n = 0
        println(" N menor que 100 portanto, N = $n ")
    }


}