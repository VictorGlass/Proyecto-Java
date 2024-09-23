// Dia 15 - Array List.

/*
 * Escribe un programa que realice las siguientes tareas:
 * 
 *  * Inicialice un ArrayList denominada weekdays que contiene cadenas de lunes a domingo.
 *  * Imprime todos los elementos de la lista de matrices de la semana.
 *  * Ordene los elementos de los dias de la semana alfabeticamente en orden creciente e imprimalos de nuevo.
 *  * Ordene los elementos de los dias de la semana alfabeticamente en orden creciente y vuelva a imprimirlos.
 *  * Escriba una funcion que tome una ArrayList y un caracter como parametros y elimine todos los elementos de la lista
 *    de matriz que comiencen con el caracter dado.
 *    
 *    Por ejemplo: 
 *    Si los parametros son los dias de la semana y el caracter 't', entonces los martes y 
 *    jueves deben eliminarse de la lista de arrays weekdays
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Dia_15_Array_List {
    public static void main(String[] args) {
        
        //Iniciamos el ArrayList con los dias de la Semana.
        ArrayList<String> weekdays = new ArrayList<>();
        weekdays.add("Lunes");
        weekdays.add("Martes");
        weekdays.add("Miercoles");
        weekdays.add("Jueves");
        weekdays.add("Viernes");
        weekdays.add("Sabado");
        weekdays.add("Domingo");

        //Imprimimos los elementos de la lista.
        System.out.println("Estos son los dias de la Semana: ");
        for (String day : weekdays) {
            System.out.println(day);
        }

        //Ordenamos alfabeticamente en orden creciente y volvemos a imprimir.
        Collections.sort(weekdays);
        System.out.println("\nEstos son los dias ordenados alfabeticamente: ");
        for (String day : weekdays) {
            System.out.println(day);
        }

        //Ordenamos en orden inverso y volvemos a imprimir.
        Collections.sort(weekdays, Collections.reverseOrder());
        System.out.println("\nEstos son los dias en orden inverso: ");
        for (String day : weekdays) {
            System.out.println(day);
        }

        //Eliminamos los elementos que comiencen con un caracter dado
        char eliminarCon = 'M';
        eliminarDiasPorCaracter(weekdays, eliminarCon);
        System.out.println("\nDias despues de eliminar los que empiezan con '" + eliminarCon + "':");
        for (String day : weekdays) {
            System.out.println(day);
        }
    }

    //Funcion con la cual eliminaremos los elementos que comiencen con un caracter dado.
    public static void eliminarDiasPorCaracter(ArrayList<String> lista, char caracter) {
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String dia = iterator.next();
            if (dia.toLowerCase().charAt(0) == Character.toLowerCase(caracter)) {
                iterator.remove();
            }
        }
    }
}
