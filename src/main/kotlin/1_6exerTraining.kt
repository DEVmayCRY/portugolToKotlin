/*
    6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
    categorias:
    Infantil A = 5 a 7 anos
    Infantil B = 8 a 11 anos
    Juvenil A = 12 a 13 anos
    Juvenil B = 14 a 17 anos
    Adultos = Maiores de 18 anos
*/

fun main(args: Array<String>) {
    print("Para determinar sua classificação de idade para natação, digite sua idade: ")
    val idade = readLine()!!.toInt()

    if(idade in 5..7){
        println("Infantil A.")
    }else if(idade in 8..11){
        println("Infantil B.")
    }else if(idade in 12..13){
        println("Juvenil A.")
    }else if(idade in 14..17){
        println("Juvenil B.")
    }else if(idade>=18){
        println("Adulto.")
    }else{
        println("Um bebê.")
    }
}