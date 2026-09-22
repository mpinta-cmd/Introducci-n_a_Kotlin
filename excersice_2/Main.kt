/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val estudiante: String = "Mateo Pinta"
    val nota_1:Double=2.0
    val nota_2: Double=2.0
    val nota_3:Double=2.0
    val prom:Double
    prom =(nota_1+nota_2+nota_3)/3
    if (prom>=3.0){
        if(prom>=4.5){
            println("El estudiante $estudiante tuvo un promedio excelente de: $prom")
        }
        else{
            println("El promedio de $estudiante fue de: $prom")
        }
        }
    else{
        println("El estudiante $estudiante REPROBO con un promedio de $prom")
    }  
    
    
}