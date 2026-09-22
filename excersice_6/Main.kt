class Product(var nombre:String , var precio:Int , var cantidad_dis:Int ){
    fun valor_total(){
        var multiplicacion:Int=0
        multiplicacion=precio*cantidad_dis
        println("El Valor total de inventario de: $nombre es de $multiplicacion")
    }
}




fun main() {
    val producto_1=Product("Pan",15000,7)
    val producto_2=Product("Leche",5200,5)
    val producto_3=Product("Cafe",3000,10)
    
    producto_1.valor_total()
    producto_2.valor_total()
    producto_3.valor_total()
}