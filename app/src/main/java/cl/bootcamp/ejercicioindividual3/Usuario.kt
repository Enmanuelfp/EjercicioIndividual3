package cl.bootcamp.ejercicioindividual3
//Ejercicio3
class Usuario (
    val nombre : String,
    val edad : Int,
    val trabajo : String?,
    val referencia : Usuario?

){

    fun mostrarDatos() {
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Trabajo: ${trabajo ?: "No especificado"}")
        println("Referencia: ${referencia?.nombre ?: "No especificado"}")
        println()
    }


}

fun main(){

    val usuario1 = Usuario("Enmanuel",31,"repartidor",null)
    val usuario2 = Usuario("Maria",30,"Garzona",null)

    usuario1.mostrarDatos()
    usuario2.mostrarDatos()
//FIN EJERCICIO 3 Y COMIENZO EJERCICIO 4

    val listaUsuarios = ListaDeUsuarios()

    val usuario3 = Usuario(nombre = "Juan Pérez", edad = 30, trabajo = "Ingeniero", referencia = null)
    val usuario4 = Usuario(nombre = "Ana Gómez", edad = 25, trabajo = null, referencia = usuario1)
    val usuario5 = Usuario(nombre = "Carlos Ruiz", edad = 40, trabajo = "Doctor", referencia = null)

    listaUsuarios.agregarUsuario(usuario1)
    listaUsuarios.agregarUsuario(usuario2)
    listaUsuarios.agregarUsuario(usuario3)
    listaUsuarios.agregarUsuario(usuario4)
    listaUsuarios.agregarUsuario(usuario5)

    listaUsuarios.mostrarLista()

    println("Eliminando a Ana Gomez")
    listaUsuarios.eliminarUsuario("Ana Gómez")

    listaUsuarios.mostrarLista()

}