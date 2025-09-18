package com.example.miproyecto

fun main()
{
    /*val analizador = AnalizadorCalificaciones();
    analizador.captura();
    println("Tu promedio es: ${analizador.calcularPromedio()}");
    println("Tienes ${analizador.contarAprobadas()} aprobadas");
    println("Tienes ${analizador.contarReprobadas()} reprobadas");
    println("Tu calificacion maxima es ${analizador.obtenerCalificacionMaxima()}");
    println("Tu calificacion minima es ${analizador.obtenerCalificacionMinima()}");

     */
    val agenda = Agenda()

    do{
        println("Mi Agenda")
        println("1. Añadir nuevo contacto")
        println("2. Mostrar todos los contactos")
        println("3. Buscar contacto")
        println("4. Salir")
        println("**Elige una opcion**")
        val opcion: Int = readln().toInt()
        when (opcion)
        {
            1 -> {
                println("Agrega el nombre del usuario")
                val nombre = readln()
                println("Agrega su numero de telefono")
                val telefono = readln()

                agenda.agregarContacto(nombre, telefono)
            }
            2 -> {
                agenda.mostrarTodosLosContactos()
            }
            3 -> {
                println("Ingresa el nombre para buscar: ")
                val nombre = readln()
                val contacto = agenda.buscarContacto(nombre)
                if (contacto != null) {
                    println("Contacto encontrado: ${contacto.nombre} - Teléfono: ${contacto.telefono}")
                } else {
                    println("No se encontró el contacto.")
                }
            }
            4 -> {
                println("Estas saliendo de la agenda")

            }
            else -> println("Esta opcion no esta disponible")

        }
    }while (opcion != 4)

}