// Dia 12 - StringBuffer y StringBuilder.

/*
 * 1. Escribe un programa que realice las siguientes tareas:
 * 
 * * Inicialice un StringBuffer con el valor "Hello" y agregue un espacio y "World" e imrpimelo.
 * * Inicialice un StringBuilder con el valor de "Hello" y agregue un espacio y "World" e imprimelo.
 */

public class Dia_12_StringBuffer_y_StringBuilder {
    public static void main(String[] args) {

        //Usemos StringBuffer
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" ");     //Agregamos un espacio
        buffer.append("World"); //Agregamos "World"
        System.out.println("Usando StringBuffer: " + buffer.toString());

        //Usemos StringBuilder
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" ");    //Agregamos un espacio
        builder.append("World");//Agregamos "World"
        System.out.println("Usando StringBuilder: " + builder.toString());
        

    }
}


//Datos de Java:

/**
 * 1. Conoce la diferencia entre String, StringBuffer y StringBuilder.
 * 2. Aprende cuando se deben preferir StringBuffer y StringBuilder en lugar de un String.
 */



 /**
  * 1.
  * StringBuffer: Es una clase mutable, lo cual significa que su contenido puede cambiar sin
                  crear nuevos objetos.
                  Es 'thread-safe', lo que significa que es seguro para el uso en entornos multiples hilos,
                  pero tiene una ligera penalizacion en el rendimiento debido a la sincronizacion.
    
    StringBuilder: Es muy similar al anterior en cuanto a funcionalidad, pero no es 'thread-safe'.
                   Como no esta sincronizado, tiene un rendimiento ligeramente mejor que StringBuffer en
                   situaciones de un solo hilo.

    2.
    En Java, las clases String, StringBuffer, y StringBuilder tienen distintos propósitos y características. 
    Es importante saber cuándo usar cada una de ellas para escribir código eficiente y claro. 
    Aquí te explico cuándo debes preferir StringBuffer o StringBuilder en lugar de String.

    1. Inmutabilidad de String: String es inmutable, lo que significa que una vez que creas una instancia de una cadena de caracteres, no puedes modificar su contenido. 
                                Cualquier operación que parezca modificar la cadena (como concatenación) realmente crea un nuevo objeto String, 
                                lo que puede ser costoso en términos de memoria y rendimiento, especialmente si realizas muchas concatenaciones dentro de un bucle.


    Cuándo usar String: Usa String cuando no necesitas modificar el valor de la cadena. Ejemplos:
                        Almacenar una constante.
                        Realizar comparaciones simples.
                        Trabajar con cadenas pequeñas y un número limitado de operaciones de concatenación.

    2. Mutabilidad de StringBuffer y StringBuilder
    
    Tanto StringBuffer como StringBuilder son mutables, lo que significa que puedes modificar el contenido de la cadena sin crear nuevos objetos. 
    Estas clases son ideales cuando necesitas realizar múltiples modificaciones o concatenaciones en una cadena.

    Diferencia clave: StringBuffer es sincronizado y thread-safe, lo que significa que varios hilos pueden acceder a él de forma segura, pero esto lo hace un poco más lento.
                      StringBuilder no es sincronizado, por lo que es más rápido, pero no es seguro en entornos multihilo.

    Cuándo usar StringBuffer: Usa StringBuffer cuando necesites modificar cadenas en un entorno de múltiples hilos y la seguridad de los hilos sea una prioridad.

    Cuándo usar StringBuilder:  Usa StringBuilder en entornos de un solo hilo o cuando el acceso simultáneo no sea un problema. 

    Es preferible para la mayoría de las situaciones donde se realizan muchas operaciones sobre cadenas.

    3. Comparación de Rendimiento: String es muy eficiente para operaciones de lectura cuando las cadenas no se modifican, 
                                   pero para operaciones frecuentes de concatenación o modificación de texto, el rendimiento 
                                   puede verse afectado porque cada operación crea un nuevo objeto.

    StringBuilder es más rápido que String y StringBuffer para concatenaciones múltiples debido a la ausencia de sincronización.

    StringBuffer es más lento que StringBuilder debido a la sincronización, pero es necesario cuando se trabaja con múltiples hilos.

    Resumen: ¿Cuándo preferir cada uno?
    String: Cuando trabajes con cadenas que no se modificarán (ejemplo: constantes o comparaciones simples).
    StringBuilder: Para concatenar o modificar cadenas en un solo hilo, donde se requiere alta eficiencia.
    StringBuffer: Cuando trabajas con concatenaciones o modificaciones en un entorno multihilo.

  */