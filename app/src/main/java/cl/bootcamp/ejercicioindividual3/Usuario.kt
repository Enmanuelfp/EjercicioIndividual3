package cl.bootcamp.ejercicioindividual3

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
}