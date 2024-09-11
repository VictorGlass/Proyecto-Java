// Dia 9 - Estado de cuenta de Switch.

/*
 * 1. Escriba un programa que lea el porcentaje y luego imprima su calificacion de letra
 *    correspondiente a (A, B, C, D o F) usando la declaracion switch.
 */

 import java.util.Scanner;
public class Dia_9_Estado_de_Cuenta_de_Switch {
    public static void main(String[] args) {
        
        //Iniciar el objeto Scanner.
        Scanner scanner = new Scanner(System.in);

        //Leer el porcentaje como entrada del usuario.
        System.out.println("Introduce el porcentaje: ");
        int porcentaje = scanner.nextInt();

        //Detectar la calificacion de letra correspondiente
        //usando switch.
        char calificacion;

        //Usando Switch.
        switch (porcentaje / 10) {
            case 10:
            case 9:
                calificacion = 'A';
                break;
            case 8:
            calificacion = 'B';
                break;
            case 7:
            calificacion = 'C';
                break;
            case 6:
            calificacion = 'D';
                break;
            default:
                calificacion = 'F';
                break;
        }

        System.out.println("La calificacion correspondiente es: " + calificacion);

        scanner.close();

    }
}


//Datos de Java.
/**
 * 1. Comprender las ventajas y desventajas de las instrucciones if-else y switch.
 */

/**
 * Instruccion If-else:
 * 
 * Ventajas: 
 * 
 * Flexibilidad: permite manejar condiciones complejas y multiples comparaciones. Es posible combinar condiciones con operadores logicos
 *               (&&, ||) para evaluar expresiones complejas.
 * 
 * Condiciones no numericas: Se puede usar para evaluar expresiones booleanas, cadenas de texto, y otros tipos de datos que no sean enteros
 *                           o caracteres, como boolean, String, etc.
 * 
 * Control granular: Permite tener control detallado sobre las condiciones, lo que es util cuando se necesita evaluar condiciones que no
 *                   pueden ser simplificadas en una simple comparacion de igualdad.
 * 
 * Desventajas:
 * 
 * Complejidad visual: si hay muchas condiciones, el codigo puede volverse dificil de leer y mantener. Los bloques largos de if-else pueden 
 *                     ser dificiles de seguir.
 * 
 * Rendimiento: En situaciones con muchas condiciones, if-else puede ser menos eficiente que switch, ya que las condiciones se evaluan en 
 *              secuencia hasta encontrrar una verdadera.
 * 
 * Instrunccion Switch:
 * 
 * Ventajas:
 * 
 * Legibilidad: Es mas legible cuando se tiene que evaluar una sola condicion contra varios valores posibles.
 *              Es mas facil de entender y seguir que una cadena larga de if-else.
 * 
 * Eficiencia: En muchos casos, switch es mas eficiente que if-else, especialmente cuando se compila, ya que 
 *             algunas implementaciones convierten un switch en una busqueda de tabla o en una serie de saltos optimizados.
 * 
 * Estructura clara: El uso de case y break hace que la estructura logica sea mas claera y menos propensa a errores en comparacion
 *                   con multiples if-else anidados.
 * 
 * Desventajas:
 * 
 * Limitaciones en tipos de datos: switch solo puede evaluar valores de tipo int, char, byte, short, enum, String, y algunos
 *                                 otros tipos de datos limitados.
 *                                 No puede evaluar condiciones complejas o expresiones booleanas directamente.
 * 
 * Manejo de rangos: No maneja bien las comparaciones de rangos de valores o condiciones complejas.
 *                   Si necesitas evaluar si un valor esta dentro de un rango, switch no es adecuado.
 * 
 * Potencial de errores: Olvidar un break puede llevar a errores logicos dificiles de detectar, ya que el programa
 *                       continuara evaluando los casos siguientes (fenomeno conocido como "fallthrough").
 * 
 * Conslusion:
 * 
 * Usa if-else cuando -> necesites evaluar condiciones complejas o no numericas.
 *                    -> las comparaciones impliquen rangos o combinaciones de multiples condiciones.
 * 
 * Usa switch cuando -> tienes que comparar un solo valor contra varios valores posibles.
 *                   -> buscas una solucion mas legible y potencialmente mas eficiente cuando hay muchas comparaciones sencillas de igualdad.
 */