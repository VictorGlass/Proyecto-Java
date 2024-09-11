// Dia 8 - Declaraciones condicionales (if-else).

/*
 * 1. Escriba un programa que lea un numero entero como entrada del usuario e imprima si el numero es par o impar en la consola.
 * 2. Escriba un programa que tome 3 numeros como entrada e imprima el mas grande de ellos.
 * 3. Escriba un programa que compruebe si un año es bisiesto o no.
 */

import java.util.Scanner;

public class Dia_8_Declaraciones_Condicionales {
    public static void main(String[] args) {
        

        //1.Escriba un programa que lea un numero entero como entrada 
        //  del usuario e imprima si el numero es par o impar en la consola.

        //Iniciar el objeto Scanner.
        Scanner scanner = new Scanner(System.in);

        //Leer un numero entero como entrada del usuario.
        System.out.println("Ingresa un numero y te dire si es par o impa.");
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();

        //Verificar si es par o impar.
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
        System.out.println();

        //2.Escriba un programa que tome 3 numeros como 
        //  entrada e imprima el mas grande de ellos.

        //Leer tres numeros como entrada del usuario.
        System.out.println("Vamos a calcular cual de los 3 numeros que ingreses es el mayor!");
        System.out.println("Introduce el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int num3 = scanner.nextInt();

        //Encontrar el mayor de los tres numeros ingresados.
        int mayor;
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El mayor de los tres numeros ingresados es: " + mayor);


        //3.Escriba un programa que compruebe si un año es bisiesto o no.

        //Leer el año como entrada del usuario.
        System.out.println("Te dire si es bisiesto o no! ");
        System.out.println("Introduce un año: ");
        int anio = scanner.nextInt();

        //Comprobar si el año es bisiesto.
        boolean esBisiesto;
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    esBisiesto = true;
                } else {
                    esBisiesto = false;
                }
            } else {
                esBisiesto = true;
            }
        } else {
            esBisiesto = false;
        }
         if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
         } else {
            System.out.println("El año es " + anio + " no es bisiesto.");
         }

        scanner.close();
    }
}
