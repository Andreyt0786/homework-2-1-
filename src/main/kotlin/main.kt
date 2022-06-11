

fun main () {
    val minPay = 35
    val amount = 10099
    val percent = amount *0.75/100
    val comission = if(minPay>percent) minPay else percent
    println ("Kомиссия за перевод = $comission рублей" )
}