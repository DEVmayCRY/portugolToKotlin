/*
    7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
    (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
*/

fun main(args: Array<String>) {
    println("Digite a base e a altura do triangulo respectivamente: ")
    val base = readLine()!!.toInt()
    val altura = readLine()!!.toInt()

    if(base > 0 && altura > 0){
        println("A area do triangulo é: ${(base*altura)/2}cm")
    }else{
        println("Numero inválido, tente digitar números positivos.")
    }
}