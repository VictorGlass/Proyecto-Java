//Dia 18 - Funciones.

/**
 * 1. Defina una funcion (metodo) "isPrime" que tome un numero entero como parametro
 *    y devuelva un valor booleano (verdadero/falso) si el numero entero es un numero primo.
 * 
 * 2. Defina una funcion que tome una cadena como parametro y devuelva el numero de vocales que contiene.
 * 
 */

public class Dia_18_Funciones {
    
    //1. Funcion para saber si un numero es primo.
    public static boolean isPrime(int numero) {
        if (numero <= 1) {
            return false; //Numeros menores o iguales a 1 no son primos.
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; //Si es divisible por algun numero no es primo.
            }
        }
        return true; //Si no tiene divisores es primo.
    }

    //2. Funcion para contar el numero de vocales de una cadena.
    public static int contarVocales(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU"; //Vocales en minuscula y mayuscula.

        for (int i =0; i < cadena.length(); i++) {
            if (vocales.indexOf(cadena.charAt(i)) != 1) {
                contador++; //Si es una vocal, incrementa el contador.

            }
        }
        return contador;
    }

    public static void main(String[] args) {
        //Probando la funcion isPrime
        int numero = 29;
        System.out.println("¿El numero " + numero + " es primo? " + isPrime(numero));

        //Probando la funcion contarVocales.
        String cadena = "Hola, Mundo!";
        System.out.println("La cadena \"" + cadena + "\" contiene: " + contarVocales(cadena) + " vocales.");
    }
}
