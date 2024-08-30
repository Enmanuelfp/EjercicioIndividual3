package cl.bootcamp.ejercicioindividual3

//Ejercicio4

class ListaDeUsuarios {
    private val listaDeUsuarios: MutableList<Usuario> = mutableListOf()

    fun agregarUsuario(usuario: Usuario){
        listaDeUsuarios.add(usuario)
        println("${usuario.nombre} ha sido agredo a la lista")
    }

    fun eliminarUsuario(nombre: String){
        val usuarioAEliminar = listaDeUsuarios.find { it.nombre == nombre }
        if (usuarioAEliminar != null){
            listaDeUsuarios.remove(usuarioAEliminar)
            println("$nombre ha sido removido de la lista.")
        } else {
            println("Usuario con nombre $nombre no encontrado.")
        }
    }

    fun mostrarLista() {
        if (listaDeUsuarios.isEmpty()) {
            println("La lista de usuarios está vacía.")
        } else {
            println("Lista de Usuarios:")
            listaDeUsuarios.forEach { it.mostrarDatos() }
        }
    }

}

