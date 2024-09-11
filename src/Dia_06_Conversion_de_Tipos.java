// Dia 6 - Conversion de tipos.

/*
 * 1. Escribe un programa que realice estas tareas.
 * 
 * * Convertir una cadena en un numero entero.
 * * Convertir una cadena en un float.
 * * Convertir un numero entero en una cadena mediante el metodo valueOf().
 * * Convertir un numero entero en una cadena mediante el metodo toString().
 * 
 */

//SOLUCION:

public class Dia_06_Conversion_de_Tipos {
    public static void main(String[] args) {
        

        //Convertir una cadena en un numero entero.
        String cadenaEntero = "123";
        int numeroEntero = Integer.parseInt(cadenaEntero);
        System.out.println("Cadena convertida en entero: " + numeroEntero);

        //Convertir una cadena en un float.
        String cadenaFloat = "123,45";
        float numeroFloat = Float.parseFloat(cadenaFloat);
        System.out.println("Cadena convertida a float: " + numeroFloat);

        //Convertir un numero entero en una cadena mediante el metodo valueOf().
        int numero = 456;
        String cadenaDesdeValueOf = String.valueOf(numero);
        System.out.println("Numero entero convertifo a cadena usando valueOf: " + cadenaDesdeValueOf);

        //Convertir un numero entero en una cadena usando toString().
        String cadenaDesdeToString = Integer.toString(numero);
        System.out.println("Entero convertido en cadena usando toString(): " + cadenaDesdeToString);
    }
}
