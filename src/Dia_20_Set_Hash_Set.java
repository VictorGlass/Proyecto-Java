// Dia 20 - Set/HashSet.

/**
 * Escribe un programa que realice las siguientes tareas:
 * 
 * 1. Inicializar un conjunto de valores de cadena y agregarle elementos.
 * 
 * 2. Compruebe si existe un valor en el conjunto.
 * 
 * 3. Quitar un valor del conjunto.
 * 
 * 4. Imprime el numero de valores (tamaño) en el conjunto.
 * 
 * 5. Imprime todos los valores uno por uno recorriendo el conjunto.
 * 
 * 6. Eliminar todos los valores del conjunto.
 */


 //Importamos lo que utilizaremos.
import java.util.HashSet;
import java.util.Set;

public class Dia_20_Set_Hash_Set {

    public static void main(String[] args) {
        //1.
        //Inicializamos un conjunto de valores en cadena y le agregamos elementos:
        Set<String> conjunto = new HashSet<>();
        //Agregando elementos:
        conjunto.add("Lunes");
        conjunto.add("Martes");
        conjunto.add("Miercoles");
        conjunto.add("Jueves");
        conjunto.add("Viernes");
        

        //2.
        //Comprobamos si existe un valor en el conjunto:
        String valorBuscado = "Martes";
        if (conjunto.contains(valorBuscado)) {
            System.out.println(valorBuscado + " esta presente en el conjunto de valores.");
        } else {
            System.out.println(valorBuscado + " no se encuentra en el conjunto de valores.");
        }

        //3.
        //Quitamos un valor del conjunto.
        conjunto.remove("Viernes");
        System.out.println("Se ha eliminado el valor 'Viernes' del conjunto.");

        //4.
        //Imprimimos el numero de valores (tamaño) en el conjunto:
        System.out.println("El tamaño del conjunto de valores es: " + conjunto.size());

        //5.
        //Imprimimos todos los valores, uno por uno:
        System.out.println("Estos son los valores en el conjunto: ");
        for (String dia : conjunto) {
            System.out.println(dia);
        }

        //6.
        //Eliminamos todos los valores del conjunto:
        conjunto.clear();
        System.out.println("Todos los valores del conjunto han sido eliminados. Tamaño actual del conjunto: " + conjunto.size() );
    }
}