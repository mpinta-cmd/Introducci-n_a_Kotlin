class Contact(var nombre:String, var telefono:String ,var email:String)
      fun agregar_contacto(lista: MutableList<Contact>,  nuevo_contacto:Contact){
          lista.add(nuevo_contacto)
          println("El siguiente contacto ${nuevo_contacto.nombre} fue agregado correctamente")
      }
      fun mostrar_contactos(lista: MutableList<Contact>){
          for (i in 0 .. (lista.size-1)){
              val contacto= lista[i]
              println("${i+1}) nombre= ${contacto.nombre}, telefono= ${contacto.telefono}, correo= ${contacto.email}")
          }
      }
      fun buscar_por_nombre(lista: MutableList<Contact>,  nombre_para_buscar: String){
          var confirmacion:Boolean=false
          for (i in 0 .. (lista.size-1)){
              val contacto = lista[i]
              if (contacto.nombre==nombre_para_buscar){
                println("${i+1}) nombre= ${contacto.nombre}, telefono= ${contacto.telefono}, correo= ${contacto.email}")  
                confirmacion=true
                  }
          }
          if (confirmacion){
              println("Contacto encontrado")
          }
          else{
              println("Contacto no encontrado")
          }
      }
      fun eliminar_por_nombre(lista: MutableList<Contact>,  nombre_para_eliminar: String){
          var confirmacion : Boolean=false 
          for (i in 0 .. (lista.size-1)){
               val contacto = lista[i]
               if (contacto.nombre==nombre_para_eliminar){
                   lista.removeAt(i)
                   confirmacion=true
                   break
                   }
           }
          if (confirmacion){
              println("Contacto eliminado")
          }
          else {
              println("Contacto no encontrado")
          }
      }


fun main() {
    val contactos =mutableListOf (
    Contact("carlos","321","carlos@"),
    Contact("juan","123","juan@"),
    Contact("luisa","456","luisa@"),
    Contact("natalia","654","natalia@"),
    Contact("gloria","987","gloria@")
    )
    mostrar_contactos(contactos)
    println(" ")
    buscar_por_nombre(contactos,"Mateo Pinta")
    println(" ")
    val contacto_1=Contact("Mateo Pinta","321527","m.pinta@")
    agregar_contacto(contactos,contacto_1)
    println(" ")
    mostrar_contactos(contactos)
    println(" ")
    buscar_por_nombre(contactos,"carlos")
    println(" ")
    eliminar_por_nombre(contactos,"juan")
    println(" ")
    mostrar_contactos(contactos)
}
