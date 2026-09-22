fun isPrime(number: Int):String{
    var contador: Int=0
    var division:Int=0
    for(i in 1 .. number ){
        division=number % i
        if(division==0){
            contador++
        }
    }
    if(contador>2){
        return "El numero: $number es compuesto"
    }
    else{
        return "El numero:$number es primo"
    }
}

fun factorial(number: Int):String{
    var multiplicacion:Int=1
    for(i in number downTo 1){
        multiplicacion=multiplicacion*i
    }
    return "$number! = $multiplicacion"
}

fun isEven(number: Int):String{
    if(number%2 == 0){
        return "El numero: $number es par"
    }
    else{
        return "El numero: $number es impar"
    }
}

fun main() {
    val number=10
    println(isPrime(number))
    println(factorial(number))
    println(isEven(number))
    }