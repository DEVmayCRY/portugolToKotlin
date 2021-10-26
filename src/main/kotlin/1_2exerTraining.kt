/*
    2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
    horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
    por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
    armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
    trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
    excedente.
*/




fun main(args: Array<String>) {
    var c: Double
    var e: Double
    print("Quantas horas trabalhadas?:")
    var n = readLine()!!.toDouble()

    if(n <= 50.0){
        c = 10.0*n
        println("Você receberá R$$c")
    }else{
        c = 500.0+(n*20-1000)
        println("Você receberá R$$c, um total de R$${c-500} excedente.")
    }

}