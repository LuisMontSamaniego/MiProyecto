package com.example.miproyecto

class AnalizadorCalificaciones {
    var calificaciones = mutableListOf<Float>();

    fun captura()
    {
        println("Captura tus calificaciones");
        for (c in 1 ..7 )
        {
            println("Ingresa la calificacion ${c}: ");
            val cal: Float = readln().toFloat();
            calificaciones.add(cal);
        }
    }
    fun calcularPromedio(): Double
    {
        /*var promedio: Float = 0F;
        for (c in 1 ..7 )
        {
            promedio += calificaciones[c];
        }
        promedio = promedio / 7;
        return promedio;*/
        return calificaciones.average();
    }
    fun contarAprobadas(): Int
    {
       /*var aprobadas: Int = 0;
        for (c in 1 ..7 )
        {
            val cal: Float = calificaciones[c];
            if(cal >= 7)
            {
                aprobadas++;
            }
        }
        return aprobadas;
        */
        return calificaciones.count { it >= 7 };
    }
    fun contarReprobadas(): Int
    {
        /*var reprobadas: Int = 0;
        for (c in 1 ..7 )
        {
            val cal: Float = calificaciones[c];
            if(cal < 7)
            {
                reprobadas++;
            }
        }
        return reprobadas;
         */
        return calificaciones.count { it < 7 };
    }
    fun obtenerCalificacionMaxima(): Float?
    {
        return calificaciones.maxOrNull();
    }
    fun obtenerCalificacionMinima(): Float?
    {
        return calificaciones.minOrNull();
    }

}