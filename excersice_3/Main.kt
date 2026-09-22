

fun main() {
    var sumatoria:Int=0
    val numero = 10
    for (number in 1..10){
        println("$numero*$number=${numero*number}")
        sumatoria=sumatoria+numero*number
    }
    println("La sumatoria fue de $sumatoria") 
}