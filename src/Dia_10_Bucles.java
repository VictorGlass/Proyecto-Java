// Dia 10 - Bucles (para, mientras, hacer-mientras).

/*
 * 1. Escriba un programa que lea un número entero de entrada 'n' e imprima la suma de números enteros de 1 a 'n' 
 *    utilizando tres tipos diferentes de bucles: bucles for, while y do-while.
 * 2. Escriba un programa que lea un número entero de entrada 'n' e imprima la suma de números enteros pares de 1 a 'n' (use continuar)
 * 3. Escribe un programa que genere números aleatorios entre 1 y 100 hasta que encuentre un número divisible por 5 y 7. 
 *    Cuando encuentre el número, imprímalo y termine el bucle usando la instrucción break.
 */


import java.util.Random;
//import java.util.Scanner;
public class Dia_10_Bucles {
    public static void main(String[] args) {
        
        //1
        //Usando for.

        //Scanner scanner = new Scanner(System.in);

        //Leer numero entero como entrada usuario.
        //System.out.println("Introduce un numero entero: ");
        //int n = scanner.nextInt();

        //Suma usando for.
        //int sumaFor = 0;
        //for (int i = 1; i <= n; i++) {
        //    sumaFor += i;
        //}

        //System.out.println("Generando una suma usando bucle for: " + sumaFor);


        //Usando while.

        //int sumaWhile = 0;
        //int j = 1;

        //while (j <= n) {
        //    sumaWhile += j;
        //    j++;
        //}

        //System.out.println("Generando una suma usando bucle while: " + sumaWhile);


        //Usando do-while

        //int sumaDoWhile = 0;
        //int k = 1;

        //do {
        //    sumaDoWhile += k;
        //    k++;
        //} while (k <= n);

        //System.out.println("Generando una suma usando do-while: " + sumaDoWhile);


        //2.
        //System.out.println("Ahora vamos a generar sumas de enteros usando continue");
        
        //Leer numero entero 'n' desde el usuario.
        //System.out.println("Introduce un numero entero 'n: ");
        //int n = scanner.nextInt();

        //Inicializar una variable para almacenar la suma
        //int suma = 0;

        //Bucle para recorrer los numeros de 1 a n
        //for (int i = 1; i <= n; i++) {
            //Si el numero no es par, saltar la iteracion actual
        //    if (i % 2 != 0) {
        //        continue; //Saltar los numeros impares
        //    }
            //Sumar los numeros pares
        //    suma += 1;
        //}

        //Imprimir el resultado
        //System.out.println("La suma de los numeros enteros pares de 1 a " + n + " es: " + suma);

        //scanner.close();

        //3.
        //Crear un objeto Random para generar numeros aleatorios
        Random random = new Random();
        int numeroAletorio;

        //Bucle infinito hasta que se encuentre un numero divisible por 5 y 7
        while (true) {
            //Generamos un numero aleatorio
            numeroAletorio = random.nextInt(100) + 1;

            //Imprimimos el numero generado
            if (numeroAletorio % 5 == 0 && numeroAletorio % 7 == 0) {
                //Imprimir el numero y salir del bucle
                System.out.println("¡Encontrado! El numero " + numeroAletorio + " es divisible por 5 y 7");
                break; //Terminar el bucle
            }
        }

    }
}
