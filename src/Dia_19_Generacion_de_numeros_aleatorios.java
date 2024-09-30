//Dia 19 - Generacion de Numeros Aleatorios.

/**
 * 1. Escribe un programa para generar un numero aleatorio.
 * 
 * 2. Escribe un programa para generar un numero aleatorio entre dos numeros enteros Lista de Lectura:
 *    
 *    Descubre porque la generacion de numeros aleatorios es importante en la programacion y algunas 
 *    comunes donde se requiere.
 */

//SOLUCION:

//Importamos el uso de Random.
import java.util.Random;

public class Dia_19_Generacion_de_numeros_aleatorios {

    public static void main(String[] args) {
        //1.
        //Generamos un numero aleatorio:
        Random random = new Random();
        int numeroAleatorio = random.nextInt(); //Generará un numero aleatorio, positivo o negativo.
        System.out.println("Este es el numero aleatorio generado: " + numeroAleatorio);

        //2.
        //Generamos un numero aleatorio entre dos numeros enteros:
        int min = 1;   //Valor minimo.
        int max = 100; //Valor maximo.
        int numeroAleatorioEntre = random.nextInt(max - min + 1) + min; //Generará un numero entre min y max.
        System.out.println("Este es el numero aleatorio entre " + min + " y " + max + ": " + numeroAleatorioEntre);
    }
    
}
