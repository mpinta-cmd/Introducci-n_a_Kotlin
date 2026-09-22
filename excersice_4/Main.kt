

fun main() {
    val lista_numeros_enteros =listOf(1, 35, 17,4,-8,6,20,8,9,34)
    var numero_mayor:Int=-10000000
    var numero_menor:Int=1000000
    var numeros_pares:Int=0
    var numeros_impares:Int=0
    var sumatoria: Double=0.0
    var promedio: Double=0.0
    for (number in 0.. (lista_numeros_enteros.size-1) ){
        println("${number+1}) ${lista_numeros_enteros[number]}")
        sumatoria=sumatoria+lista_numeros_enteros[number]
        if(lista_numeros_enteros[number]>numero_mayor){
            numero_mayor=lista_numeros_enteros[number]
            }
        if (lista_numeros_enteros[number]<numero_menor){
            numero_menor=lista_numeros_enteros[number]
            }
        if (lista_numeros_enteros[number] % 2==0){
            numeros_pares++
        } else if (lista_numeros_enteros[number] % 2==1){
            numeros_impares++
        }
        
            
        
        }
    promedio=sumatoria/lista_numeros_enteros.size
    println("El numero mayor de esta lista es: $numero_mayor")
    println("EL numero menor de esta lista es: $numero_menor")
    println("Numeros pares = $numeros_pares")
    println("Numeros impares = $numeros_impares")
    println("La sumatoria de esta lista fue de: $sumatoria")
    println("El promedio de esta lista es de: $promedio")
    }