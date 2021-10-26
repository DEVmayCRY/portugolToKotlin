/*
    3) Desenvolva um sistema em que:
    Leia 4 (quatro) números;
    Calcule o quadrado de cada um;
    Se o valor resultante do quadrado for >= 1000, imprima-o e finalize;
    Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */


import kotlin.math.pow
fun main(args: Array<String>) {
    println("Digite 4 números: ")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num3 = readLine()!!.toInt()
    var num4 = readLine()!!.toInt()
    var numG1 = num1.toDouble().pow(2)
    var numG2 = num2.toDouble().pow(2)
    var numG3 = num3.toDouble().pow(2)
    var numG4 = num4.toDouble().pow(2)
    var numGTotal = numG1+numG2+numG3+numG4

    if(numGTotal >= 1000){
        println("Soma dos quadrados total é maior que mil, total = $numGTotal")
    }else{
        println("1º o Quadrado de $num1 = $numG1" +
                "\n2º o Quadrado de $num2 = $numG2" +
                "\n3º o Quadrado de $num3 = $numG3" +
                "\n4º o Quadrado de $num4 = $numG4")
    }
}