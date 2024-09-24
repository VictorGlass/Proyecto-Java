// Dia 16 - Enumeraciones.

/**
 * Escriba un programa que realice las siguientes tares:
 * 
 * * Inicialice una enumeracion denominada weekdays que contiene cadenas de lunes a domingo.
 * * Imprimir todos los elementos en la enumeracion de dias de la semana.
 */

/**
 * Usando enum: Es una palabra clave en Java que se utiliza para definir un conjunto
 *              de constantes.
 *              En este caso, creamos una enumeracion llamada weekdays, y contendra
 *              los valores que pide el ejercicio.
 */

 //enum:
enum Weekdays {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

public class Dia_16_Enumeraciones {
    public static void main(String[] args) {
        System.out.println(); //Salto en el codigo
        //Usando un for podemos iterar la enumeracion y mostrar los dias.
        for (Weekdays day : Weekdays.values()) { //Para los dias de la enumeracion se tomaran los valores.
            System.out.println(day); //Imprimimos los dias.
        }
    }
}

/**
 * Datos de java.
 * 
 * 1. ¿Cuándo se deben usar enumeraciones en la programacion Java?
 * 2. ¿Podemos eliminar elementos de las enumeraciones? ¿Y por qué?
 */

/**
 * 1. R:
 *    Lo ideal es usarlas cuando tengamos un conjunto fijo de valores relacionados, como dias de la semana,
 *    estados de un pedido, etc.
 *    
 *    Proporcionan seguridad en tiempo de compilacion y mejoran la legibilidad y mantenimiento del codigo.
 * 
 * 2. R:
 *    No, las enumeraciones en Java son inmutables.
 *    Los valores no se pueden agregar ni eliminar en tiempo de ejecucion, ya que son constantes y estan 
 *    definidos en el codigo fuente.
 *    Para modificar una enumeracion, es necesario cambiar el codigo y recompilar.
 */

