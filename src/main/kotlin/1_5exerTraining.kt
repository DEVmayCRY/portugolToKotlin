/*
    5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
    indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
    varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
    suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
    intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
    notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
    medido e emita a notificação adequada aos diferentes grupos de empresas.
*/

fun main(args: Array<String>) {
    print("Indique o indice de poluição atual: ")
    val indices = readLine()!!.toDouble()

    if(indices < 0.3){
        println("Podem seguir as atividades normalmente.")
    }else if(indices in 0.3..0.4){
        println("Fabricas do grupo 1 e 2, suspender atividades.")
    }else if(indices >= 0.5){
        println("Todas as Fabricas devem suspender as atividades.")
    }

}