/*La calificación final de un alumno de informática se calcula con base a las
calificaciones de cuatro aspectos de su rendimiento académico: participación,
primer examen parcial, segundo examen parcial, y examen final. Sabiendo que las calificaciones
anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%
Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declaramos las variables
        float participacion, primerExamen, segundoExamen, examenFinal, calificacionFinal;
        
        //Pedir registro de calificaciones
        System.out.print("Participacion: ");
        participacion = input.nextFloat();
        System.out.print("1er Examen parcial: ");
        primerExamen = input.nextFloat();
        System.out.print("2do Examen parcial: ");
        segundoExamen = input.nextFloat();
        System.out.print("Examen final: ");
        examenFinal = input.nextFloat();
        
        //calcular calificación final
        calificacionFinal = (participacion * 0.1f) + (primerExamen * 0.25f) + (segundoExamen * 0.25f) + (examenFinal * 0.4f);
        
        //Mostrar en pantalla la calificación final
        System.out.println("\nCalificacion final: "+calificacionFinal);
    }
    
}
