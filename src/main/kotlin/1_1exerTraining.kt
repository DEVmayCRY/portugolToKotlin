/*
    1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
    de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
    regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
    excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
    verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
    da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
    ZERO.
*/

fun main(args: Array<String>) {
    var e: Double
    var m: Double
    var pesoMax: Double = 50.0
    var valorMulta: Double = 4.0

    print("Coloque o peso total dos tomates: ")
    var p: Double = readLine()!!.toDouble()

    if(p > pesoMax){
        e = (p - pesoMax)
        m = e*valorMulta
        println("Peso máximo excedido em ${e}kg, o valor da multa será de R$$m")
    }else{
        e = 0.0
        m = 0.0
        println("Peso máximo não excedido, excesso: $e, multa: $m")
    }



}