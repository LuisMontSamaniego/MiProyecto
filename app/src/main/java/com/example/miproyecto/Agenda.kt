package com.example.miproyecto

class Agenda {
    private val contactos = mutableListOf<Contacto>()
    fun agregarContacto(nombre: String, telefono: String)
    {
        val contacto = Contacto(nombre, telefono)
        contactos.add(contacto)
    }
    fun mostrarTodosLosContactos()
    {
        if(contactos.isNotEmpty())
        {
            println("\n--- Lista de Contactos ---")
            for (i in contactos.indices) {
                val contacto = contactos[i]
                println("${i + 1}. Nombre: ${contacto.nombre} , Teléfono: ${contacto.telefono}")
            }

        }
        else
        {
            println("No hay ningun dato de contacto registrado")
        }
    }
    fun buscarContacto(nombre: String): Contacto?
    {
        val busqueda = contactos.find{it.nombre.equals(nombre, ignoreCase = true)}
        return busqueda
    }
}