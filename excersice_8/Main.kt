fun saludo( nombre:String?):String{
    if (nombre.isNullOrBlank()){
        return "hola niño auca"
    }
    else{
        return "Hola $nombre"
    }
}

fun main() {
    println("1)")
    println(saludo("trompon"))
    println("2)")
    println(saludo("  "))
    println("3)")
    println(saludo(null))
    println("4)")
    println(saludo(""))
}
