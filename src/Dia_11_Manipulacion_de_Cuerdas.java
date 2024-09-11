// Dia 11 - Manipulacion de cuerdas.

/*
 * 1. Escribe un programa que realice las siguientes tares:
 * 
 * Longitud de la cadena:                 |  -> Calcule e imprima la longitud de una cadena determinada.
 *                                        |
 * Concatenacion de cadenas:              |  -> Concatene dos cadenas e imprima el resultado.
 *                                        |
 * Comparacion de cadenas:                |  -> Compare dos cadenas e imprima si son iguales o no.
 *                                        |
 * Conversion de mayusculas y minusculas: |  -> Convierta una cadena determinada a mayusculas y minusculas e imrpima el resultado.
 *                                        |
 * Recorte de cadenas:                    |  -> Elimine los espacios en blanco iniciales y finales de una cadena determinada e imprima el resultado.
 *                                        |
 * Extraccion de subcadenas:              |  -> Extraiga una subcadena dada e imprimala.
 *                                        |
 * Division de cadenas:                   |  -> Divide una cadena determinada en subcadenas en funcion de un delimitador e imprime las subcadenas resultantes.
 *                                        |
 * Inversion de cadena:                   |  -> Invierte una cadena dada e imprime el resultado.
 *                                        |
 * Busqueda de cadenas:                   |  -> Busca una subcadena especifica dentro de una cadena dada en imrpima si se encuentra o no.
 */

import java.util.Scanner;

public class Dia_11_Manipulacion_de_Cuerdas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. Longitud de la cadena
        System.out.println("Ingrese una cadena para calcular su longitud:");
        String cadena = scanner.nextLine();
        System.out.println("Longitud de la cadena: " + cadena.length());

        // 2. Concatenación de cadenas
        System.out.println("\nIngrese la primera cadena para concatenar:");
        String cadena1 = scanner.nextLine();
        System.out.println("Ingrese la segunda cadena para concatenar:");
        String cadena2 = scanner.nextLine();
        String concatenada = cadena1 + " " + cadena2;
        System.out.println("Resultado de la concatenación: " + concatenada);

        // 3. Comparación de cadenas
        System.out.println("\nIngrese la primera cadena para comparar:");
        String cadena3 = scanner.nextLine();
        System.out.println("Ingrese la segunda cadena para comparar:");
        String cadena4 = scanner.nextLine();
        if (cadena3.equals(cadena4)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

        // 4. Conversión a mayúsculas y minúsculas
        System.out.println("\nIngrese una cadena para convertir a mayúsculas y minúsculas:");
        String cadena5 = scanner.nextLine();
        System.out.println("En mayúsculas: " + cadena5.toUpperCase());
        System.out.println("En minúsculas: " + cadena5.toLowerCase());

        // 5. Recorte de cadenas
        System.out.println("\nIngrese una cadena con espacios iniciales y finales para recortar:");
        String cadena6 = scanner.nextLine();
        System.out.println("Cadena recortada: '" + cadena6.trim() + "'");

        // 6. Extracción de subcadenas
        System.out.println("\nIngrese una cadena para extraer una subcadena:");
        String cadena7 = scanner.nextLine();
        System.out.println("Ingrese el índice de inicio:");
        int inicio = scanner.nextInt();
        System.out.println("Ingrese el índice de fin:");
        int fin = scanner.nextInt();
        scanner.nextLine(); // Para consumir el salto de línea restante
        System.out.println("Subcadena extraída: " + cadena7.substring(inicio, fin));

        // 7. División de cadenas
        System.out.println("\nIngrese una cadena para dividir:");
        String cadena8 = scanner.nextLine();
        System.out.println("Ingrese el delimitador:");
        String delimitador = scanner.nextLine();
        String[] subcadenas = cadena8.split(delimitador);
        System.out.println("Subcadenas resultantes:");
        for (String subcadena : subcadenas) {
            System.out.println(subcadena);
        }

        // 8. Inversión de cadena
        System.out.println("\nIngrese una cadena para invertir:");
        String cadena9 = scanner.nextLine();
        String invertida = new StringBuilder(cadena9).reverse().toString();
        System.out.println("Cadena invertida: " + invertida);

        // 9. Búsqueda de cadenas
        System.out.println("\nIngrese una cadena para buscar dentro de otra:");
        String cadena10 = scanner.nextLine();
        System.out.println("Ingrese la subcadena a buscar:");
        String subcadena = scanner.nextLine();
        if (cadena10.contains(subcadena)) {
            System.out.println("La subcadena se encontró dentro de la cadena.");
        } else {
            System.out.println("La subcadena no se encontró.");
        }

        scanner.close();
    }
}
