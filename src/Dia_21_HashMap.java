//Dia 21 - HasMap.

/**
 * Escribe un programa que realice las siguientes tareas:
 * 
 * 1. Inicialice un mapa has llamado estudiantes con clave entera y valor de cadena
 *    para guardar los numeros de rollo y los nombres de los estudiantes.
 * 
 * 2. Agregar elementos al HasMap estudiantes.
 * 
 * 3. Acceda a los elementos del map hash de los estudiantes utilizando get() e imprima el nombre de los estudiantes.
 * 
 * 4. Comprobar si existe una clave en el map hash.
 * 
 * 5. Eliminar un elemento del map hash.
 * 
 * 6. Imprime el numero de elementos (tamaño) en el HashMap.
 * 
 * 7. Imprime todos los nombres de los estudiantes uno por uno recorriendo el HashMap usando keySet().
 * 
 * 8. Imprime todos los nombres de los estudiantes uno por uno recorriendo el HashMap usando entrySet().
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dia_21_HashMap {

    public static void main(String[] args) {
        
        //1.
        //Inicializamos un mapa hash llamado "estudiantes" con la clave entera y valor cadena:
        HashMap<Integer, String> estudiantes = new HashMap<>();

        //2.
        //Agregamos los elementos al HashMap "estudiantes":
        estudiantes.put(101, "Juan");
        estudiantes.put(102, "Ana");
        estudiantes.put(103, "Luis");
        estudiantes.put(104, "Maria");

        //3.
        //Accedemos a los elementos del HashMap estudiantes utilizando get(), imprimimos los nombre de los estudiantes:
        System.out.println("Nombre del estudiante con numero 101: " + estudiantes.get(101));
        System.out.println("Nombre del estudiante con el numero 102: " + estudiantes.get(102));

        //4.
        //Comprobamos si existe una clave en el MapHash:
        int claveBuscada = 103;
        if (estudiantes.containsKey(claveBuscada)) {
            System.out.println("El estudiante con el numero: " + claveBuscada + " esta en el mapa.");
        } else {
            System.out.println("El estudiante con el numero: " + claveBuscada + " no se encuentra en el mapa.");
        }

        //5.
        //Eliminamos un elemento del MapHash:
        estudiantes.remove(103);
        System.out.println("Se ha eliminado el estudiante con el numero 103.");

        //6.
        //Imprimimos el numero de elementos(tamaño) del MapHash:
        System.out.println("Numero de estudiantes en el mapa es de: " + estudiantes.size());

        //7.
        //Imprimimos todos los nombres de los estudiantes recorriendo el HashMap usando keySet():
        System.out.println("Nombres de los estudiantes usando keySet(): ");
        for (Integer clave : estudiantes.keySet()) {
            System.out.println("Estudiante con numero: " + clave + ": " + estudiantes.get(clave));
        }

        //8.
        //Imprimimos todos los nombres de los estudiantes recorriendo el HashMap usando entrySet():
        System.out.println("Nombres de los estudiantes usando entrySet(): ");
        for (Map.Entry<Integer, String> entrada : estudiantes.entrySet()) {
            System.out.println("Numero: " + entrada.getKey() + ", Nombre: " + entrada.getValue());
        }

    }
}

