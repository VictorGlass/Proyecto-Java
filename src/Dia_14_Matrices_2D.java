// Dia 14 - Matrices 2D.

/**
 *   [
 *   [23, 45, 78, 12],
 *   [56, 90, 34, 67],
 *   [89, 21, 43, 76]
 *   ]
 */

/* Escribe un programa que realice las siguientes tares:

 * * Inicialice una matriz 2D de 3x4 con los valores anteriores.
 *    
 * * Escriba una funcion que tome una matriz 2D como parametro y devuelva una matriz con el valor maximo de cada fila.
 *   Para el ejemplo anterior, la funcion debe devolver la matriz [78, 90, 89]
 * 
 * * Escriba una funcion que tome una matriz 2D como parametro y devuelva una matriz con el valor maximo de cada columna.
 *   Para el ejemplo anterior, la funcion debe devolver la matriz [89, 90, 78, 76]
 * 
 * * Escriba unafuncion que toma la matriz nxm como parametro y devuelva una transformacion mxn de la matriz 2D de entrada.
 * 
 */


public class Dia_14_Matrices_2D {
    public static void main(String[] args) {
        

        //Inicializar la matriz 2D de 3x4
        int[][] matriz = {
            {23, 45, 78, 12},
            {56, 90, 34, 67},
            {89, 21, 43, 76}
        };

        //Obtenemos el valor maximo de cada fila.
        int[] maximoFilas = obtenerMaximosFilas(matriz);
        System.out.println("Maximo de cada fila: ");
        
        for (int max : maximoFilas) {
            System.out.println(max + " ");
        }

        System.out.println();

        //Obtener el maximo de cada columna
        int[] maximosColumnas = obtenerMaximosColumnas(matriz);
        System.out.println("Maximo de cada columna: ");

        for (int max : maximosColumnas) {
            System.out.println(max + " ");
        }
        System.out.println();

        //Transformar la matriz.
        int[][] matrizTranspuesta = transponerMatriz(matriz);
        System.out.println("Matriz transpuesta: ");

        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                System.out.println(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Funcion para encontrar el valor maximo de cada fila.
    public static int[] obtenerMaximosFilas(int[][] matriz) {
        int[] maximos = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int max = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
            maximos[i] = max;
        }
        return maximos;
    }

    //Funcion para encontrar el valor maximo de cada columna
    public static int[] obtenerMaximosColumnas(int[][] matriz) {
        int columnas = matriz[0].length;
        int[] maximos = new int[columnas];
        for (int j = 0; j < columnas; j++) {
            int max = matriz[0][j];
            for (int i = 1; i < matriz.length; i++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
            maximos[j] = max;
        }
        return maximos;
    }

    //Funcion para transponer la matriz
    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }
}
