// Dia 17 - Fecva.

/**
 * Escriba un programa que realice las siguientes tareas:
 * 
 * *Inicialice una variable de fecha con la fecha actual como valor e imprimala.
 * 
 * *Imprimir la epoca actual.
 * 
 * *Inicializar una variable de fecha con la fecha de 7 dias antes de la fecha actual.
 * 
 * *Compare 2 fechas con los metodos antes, despues y compareTo.
 * 
 * *Imprima la fecha actual en las siguientes zonas horarias: GMT, CST, IST
 */


//SOLUCION:

/**
 * Importamos las clases necesarias para el desafio.
 */
import java.time.LocalDate;                 //Usado para representar una fecha sin la hora(solo años, mes y dia)
import java.time.ZoneId;                    //Permite representar una fecha y hora en una zona horaria especifica.
import java.time.ZonedDateTime;             //Representa las zonas horarias, GMT entre otras.
import java.time.format.DateTimeFormatter;  //Sirve para dar formato a la fecha y hora de una manera legible.

public class Dia_17_Fecha {
    public static void main(String[] args) {
        
        //Inicializamos una variable de fecha con la fecha actual:
        LocalDate fechaActual = LocalDate.now();
        //Imprimimos:
        System.out.println("Esta es la fecha actual: " + fechaActual);

        //Imprimimos la epoca actual:
        System.out.println("Esta es la epoca actual: " + fechaActual.getEra());

        //Inicializamos una variable de fecha con la fecha de 7 dias antes:
        LocalDate fechaAnterior = fechaActual.minusDays(7);
        //Imprimimos:
        System.out.println("Esta es la fecha hace 7 dias: " + fechaAnterior);

        //Comparar dos fechas con los metodos antes, despues y compareTo:
        System.out.println("¿La fecha actual es despues de la fecha anterior? " + fechaActual.isAfter(fechaAnterior));
        System.out.println("¿La fecha actual es antes de la fecha anterior? " + fechaActual.isBefore(fechaAnterior));
        System.out.println("Comparacion (compareTo): " + fechaActual.compareTo(fechaAnterior));

        //Imprimimos la fecha actual en diferentes zonas horarias (GMT, CST, IST):
        ZonedDateTime fechaGMT = ZonedDateTime.now(ZoneId.of("GTML"));
        ZonedDateTime fechaCST = ZonedDateTime.now(ZoneId.of("CST"));
        ZonedDateTime fechaIST = ZonedDateTime.now(ZoneId.of("IST"));

        //Formateo de fechas:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        //Imprimimos:
        System.out.println("Fecha actual en GTML: "+ fechaGMT.format(formatter));
        System.out.println("Fecha actual en CST: "+ fechaCST.format(formatter));
        System.out.println("Fecha actual en IST: " + fechaIST.format(formatter));
    }
}
