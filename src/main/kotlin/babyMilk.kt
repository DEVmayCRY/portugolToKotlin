import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val colherPo: Double = 1.0
    var calc: Double
    var colherTotalR1: Double
    var microoMetaAm: Double = 0.1428571428571429
    var microoMetaGel: Double = 0.1904761904761905
    var colherTotalI: Int
    var tempMicrooGel: Double
    var tempMicrooAm: Double


    print("Quantas colheres vai usar para fazer o mamá?: ")
    var agua: Double = readLine()!!.toDouble()
    colherTotalR1 = (agua/30)*colherPo
    var colherTotalR2 = colherTotalR1
    colherTotalR2 = colherTotalR2.toInt().toDouble()
    calc = colherTotalR1-colherTotalR2
    tempMicrooAm = agua*microoMetaAm
    tempMicrooGel = agua*microoMetaGel

    if(calc >= 0.0 && calc < 0.5){
        println("Vai precisar de ${colherTotalR2.roundToInt()} medidores de leite em pó.\n" +
                "Colocar ${tempMicrooAm.roundToInt()} segundos no micro-ondas\n" +
                "ou ${tempMicrooGel.roundToInt()} segundos, caso o leite esteja gelado.")
    }else{
        println("Vai precisar de ${colherTotalR2.roundToInt()} medidores e meio de leite em pó.\n" +
                "Colocar ${tempMicrooAm.roundToInt()} segundos no micro-ondas\n" +
                "ou ${tempMicrooGel.roundToInt()} segundos, caso o leite esteja gelado.")
    }







}