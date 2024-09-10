// Dia 3 - Entrada y Salida.

/*
 * 1. Escriba un programa que lea la entrada del usuario e imprimalo en la consola.
 * 2. Modifique el programa para leer e imprimir entradas de diferentes tipos de datos
 *    (numeros enteros, numeros de coma flotante, cadenas).
 * 3. Escriba un programa para leer la entrada del usuario usando la clase.
 */


//SOLUCION:
import java.util.Scanner;

public class C_EntradaSalida {
    public static void main(String[] args) {
        
        //1.
        //Objeto Scanner sirve para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario que introduzca algun dato.
        System.out.println("Ingrese su nombre: ");

        //Lee la entrada del usuario y la almacena en una variable.
        String entrada = scanner.nextLine();

        //Ahora se imprime.
        System.out.println("Tu nombre es: " + entrada);

        //Se cierra el programa.
        scanner.close();

        //2.
        //Objeto Scanner sirve para leer la entrada del usuario.
        //Scanner scanner = new Scanner(System.in);

        //Leer entrada de numero entero.
        System.out.println("Introduzca un numero entero: ");
        int entero = scanner.nextInt();
        System.out.println("El numero entero introducido es: " + entero);

        //Leer entrada de numero decimal.
        System.out.println("Introduzca un numero decimal");
        float decimal = scanner.nextFloat();
        System.out.println("El numero decimal introducido es: " + decimal);

        //Colocando un scanner para la linea siguiente se evita el salto de linea en el programa
        scanner.nextLine();

        //Leer entrada de cadena.
        System.out.println("Introduzca su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Tu nombre es: " + nombre);

    
        //Cerramos el programa.
        scanner.close();

    }
}
