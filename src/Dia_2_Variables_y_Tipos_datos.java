// Dia 2 - Variables y tipos de datos.

/*
 * 1. Declare e inicialice variables para varios tipos de datos, incluidos:
 *  * enteros(int)
 *  * numeros de punto flotante(double)
 *  * cadenas de texto(String). Luego imprima cada variable en la consola.
 */


//SOLUCION:

public class Dia_2_Variables_y_Tipos_datos {
    public static void main(String[] args) {
        
        //Variables.

        //INT.
        int edad = 32;
        double sueldo = 530.0000;
        String nombre = "Victor Carrera";

        System.out.print(nombre + " " + " " + edad + " años" + " " + "tiene un sueldo de" +  " $" + sueldo);
    }
}

//Datos Java:

/**
 * 1. Aprender los terminos: Inicializacion/ Declaracion/ Asignacion de Variables.
 * R: INICIALIZACION:
 *    Es la combinacion de la declaracion y la asignacion en una sola linea.
 *    Esto asegura que la variable tiene un valor desde el principio.
 *
 * R: DECLARACION:
 *    Es el acto de definir el tipo de dato que la variable almacenara y es darle un nombre.
 *    En este paso, no se le asigna ningun valor a la variable.
 * 
 * R: ASIGNACION DE VARIABLES:
 *    Es el acto de darle un valor especifico a una variable.
 *    Si ya se ha declarado la variable, solo se le asigna un valor con el operador "=".
 * 
 * 2. Conozca la diferencia entre los tipos de datos primitivos y no primitivos.
 * 
 * R: TIPOS DE DATOS PRIMITIVOS:
 *    Son los tipos de datos mas basicos y estan integrados en el lenguaje Java.
 *    int/char/double/boolean/byte/short/long/float.
 * 
 * R: TIPOS DE DATOS NO PRIMITIVOS:
 *    Son los tipos de datos que no estan integrados directamente en el lenguaje Java.
 *    String/Arrays/Classes/Interfaces/Objects.
 * 
 * 3. Valores y tamaños predeterminados de tipos de datos primitivos.
 *    |Tipo Dato| Tamaño   | Valor Prede.|           Rango                                          |
 * R: | byte    |  8 bits  |     '0'     | -128 a 127                                               |
 *    | short   | 16 bits  |     '0'     | -32,768 a 32,767                                         |
 *    | int     | 32 bits  |     '0'     | -2,147,483,648 a 2,147,483,647                           |
 *    | long    | 64 bits  |     '0L'    |  -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807  |
 *    | float   | 32 bits  |     '0.0f'  | ±1.4E-45 a ±3.4E+38                                      |
 *    | double  | 64 bits  |     '0.0d'  | ±4.9E-324 a ±1.7E+308                                    |
 *    | char    | 16 bits  |'\u0000' (carácter Nulo) | '\u0000' a '\uffff' (0 a 65,535)             |
 *    | boolean | 1 bit    | 'false      | 'true' o 'false'                                         |
 */