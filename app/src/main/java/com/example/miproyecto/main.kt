package com.example.miproyecto

fun main()
{
    val analizador = AnalizadorCalificaciones();
    analizador.captura();
    println("Tu promedio es: ${analizador.calcularPromedio()}");
    println("Tienes ${analizador.contarAprobadas()} aprobadas");
    println("Tienes ${analizador.contarReprobadas()} reprobadas");
    println("Tu calificacion maxima es ${analizador.obtenerCalificacionMaxima()}");
    println("Tu calificacion minima es ${analizador.obtenerCalificacionMinima()}");
}