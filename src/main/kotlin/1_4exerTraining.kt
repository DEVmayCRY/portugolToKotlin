/*
    4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
    número é par ou ímpar, e se é positivo ou negativo.
*/

fun main(args: Array<String>) {
    print("Escreva um número: ")
    var num = readLine()!!.toInt()

    if(num%2 == 0){
        print("O numero é par, ")
        if(num>=0){
            print("e positivo.")
        }else{
            print("e negativo.")
        }
    }else{
        print("O numero é impar, ")
        if(num>=0){
            print("e positivo.")
        }else{
            print("e negativo.")
        }
    }
}