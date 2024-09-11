// Dia 7 - Operaciones Matematicas.

/*
 * 1. Escriba un programa que realice las siguientes tareas utilizando la clase Math.
 * 
 * * Maximo de 2 numeros.
 * * Minimo de 2 numeros.
 * * Raiz cuadrada de un numero.
 * * Suelo y techo de una carroza.
 * * Valor Abs de un doble.
 * 
 */

public class Dia_07_Operaciones_Matematicas {
    public static void main(String[] args) {
        

        int numero1 = 10;
        int numero2 = 20;
        //Maximo de 2 numero.
        int maximo = Math.max(numero1, numero2);
        System.out.println("El maximo de " + numero1 + " y " + numero2 + " es: " + maximo);

        //Minimo de 2 numeros.
        int minimo = Math.min(numero1, numero2);
        System.out.println("El minimo de " + numero1 + " y " + numero2 + " es: " + minimo);

        //Raiz cuadrada de un numero.
        double numero = 25.0;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raizCuadrada);

        //Suelo y techo de nna carroza.
        double cifra = 7.8;
        double suelo = Math.floor(cifra);
        double techo = Math.ceil(cifra);
        System.out.println("El suelo de " + cifra + " es: " + suelo);
        System.out.println("El techo de " + cifra + " es: " + techo);

        //Valor Abs de un doble.
        double numeroDoble = -15.5;
        double valorAnsoluto = Math.abs(numeroDoble);
        System.out.println("El valor absoluto de " + numeroDoble + " es: " + valorAnsoluto);
    }
}
