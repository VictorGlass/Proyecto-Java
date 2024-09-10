// Dia 4 - Operaciones Aritmeticas Basicas.

/*
 * 1. Escribir un programa que declare dos variables enteras y realizar operaciones
 *    aritmeticas(suma, resta, multiplicacion, division) sobre ellas. Imprime los resultados en la consola
 * 2. Escribe un programa que calcule el area de un rectangulo.
 *    Pide al usuario que introduzca la longitud(entero) y el ancho(entero) del rectangulo.
 *    Calcula el area (largo * ancho) e imprime el resultado en consola.
 * 3. Modifica el programa anterior para leer decimales como el largo y ancho,
 *    y genera el area a dos puntos decimales.
 * 
 */

//SOLUCION:

import java.util.Scanner;

public class OperacionesAritmeticasBasicas {
    public static void main(String[] args) {
        
        //1.
        //Variables Enteras:
        //int num1 = 2;
        //int num2 = 2;
        //int num3 = 2;
        //int num4 = 2;
        //int num5 = 2;
        //int num6 = 2;
        //int num7 = 2;
        //int num8 = 2;
        //SUMA:
        //int suma = num1 + num2;
        //RESTA:
        //int resta = num3 - num4;
        //MULTIPLICACION:
        //int multiplicar = num5 * num6;
        //DIVISION:
        //int division = num7 / num8;

        //System.out.println();
        //System.out.println("La suma de: " + num1 + " y" + " " + num2 + " " + "es: " + suma);
        //System.out.println();
        //System.out.println("La resta de: " + num3 + " y" +  " " + num4 + " " + "es: " + resta);
        //System.out.println();
        //System.out.println("La multiplicacion de: " + num5 + " y" + " " + num6 + " " + "es: " + multiplicar);
        //System.out.println();
        //System.out.println("La divion de: " + num7 + " y" + " " + num8 + " " + "es: " + division);

        //2.
        //Scanner scanner = new Scanner(System.in);

        //Solicitando al usuario:
        //System.out.println("Bienvenido, calculemos el area de un rectangulo con numeros enteros");
        //System.out.println("Ingresa la longitud del rectangulo: ");
        //int longitud = scanner.nextInt();
        //System.out.println();
        //System.out.println("Ingresa el ancho del rectangulo: ");
        //int ancho = scanner.nextInt();

        //Calculamos el area del rectangulo:
        //int area = longitud * ancho;

        //Mostramos en consola:
        //System.out.println("La longitud es: " + longitud + " y" + " " + ancho + " " + " y su area es de: " + area);

        //Cierra el objecto Scanner:
        //scanner.close();

        //3.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido, calculemos el area de un rectangulo con numeros decimales");
        System.out.println("Ingresa el largo del rectangulo: ");
        double largo = scanner.nextDouble();
        System.out.println("Ingresa el ancho del rectangulo: ");
        double ancho = scanner.nextDouble();

        //Calculamos el area del rectangulo:
        double area = largo * ancho;

        //Mostramos en consola:
        System.out.println("El largo es: " + largo + " y el ancho es: " + ancho + " y su area es de: " + area);

        //Cierra el objeto Scanner:
        scanner.close();

    }
}
