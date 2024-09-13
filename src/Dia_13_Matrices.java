// Dia 13 - Matrices.

/*
 * 1. Escribe un programa para declarar e inicializar una matriz de numeros enteros.
 *    
 *   * Recorre la matriz y calcula el promedio de los numeros.
 * 
 * 2. Escribir un programa para copiar elementos de una matriz a otra matriz.
 * 
 * * Inicialice un StringBuffer con el valor "Hello" y agregue un espacio y "World" e imrpimelo.
 * * Inicialice un StringBuilder con el valor de "Hello" y agregue un espacio y "World" e imprimelo.
 */

import java.util.Scanner;

public class Dia_13_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración e inicialización de la matriz
        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamaño = scanner.nextInt();
        int[] matriz = new int[tamaño];

        // Llenar la matriz
        System.out.println("Ingrese los números enteros:");
        for (int i = 0; i < tamaño; i++) {
            matriz[i] = scanner.nextInt();
        }

        // Calcular el promedio
        int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            suma += matriz[i];
        }

        double promedio = (double) suma / tamaño;
        System.out.println("El promedio de los números es: " + promedio);

        scanner.close();
    }
}

/**
 * Datos de Java:
 * 
 * 1. Aprende la diferencia entre copia superficial y la copia profunda de matrices.
 * 2. Obtenga informacion sobre la excepcion de indice de matriz fuera de limites.
 * 
 * Copia superficial: Es cuando copias una referencia al mismo objeto. Si el contenido
 *                    del objeto cambia, ambas referencias reflejaran esos cambios.
 * 
 * Copia profunda: Es cuando creas una nueva instancia del objeto y copias el contenido
 *                 en lugar de solo la referencia. Esto asegura que los cambios en una
 *                 no afectan a la otra.
 * 
 * Excepcion "Indice de matriz fuera de limites".
 *            
 * Esta excepcion ocurre cuando intentas acceder a un indice que esta fuera del rango
 * valido de una matriz.
 * Por ejemplo, si un array de tamaño 5, intentar acceder a array[5] lanzará esta excepcion ya que 
 * el indice válido es de 0 a 4.
 */