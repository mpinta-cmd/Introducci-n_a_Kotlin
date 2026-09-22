/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val numero_1: Int=10
    val numero_2: Int=10
    val operacion: String= "resta"
    when (operacion){
        "suma" -> println("$numero_1+$numero_2=${numero_1+numero_2}")
        "resta" -> println("$numero_1-$numero_2=${numero_1-numero_2}")
        "multiplicacion" -> println("$numero_1*$numero_2=${numero_1*numero_2}")
        "division"-> if (numero_2 == 0){
                             println("no se puede dividir por cero")   
        }
                      else {
                          println("$numero_1/$numero_2=${numero_1/numero_2}")
                      }
    }
}