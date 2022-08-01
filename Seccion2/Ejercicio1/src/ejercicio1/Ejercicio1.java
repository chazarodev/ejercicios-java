package ejercicio1;
/* Realizar un programa que pida tres calificaciones de un alumno y muestre la suma de
    las tres calificaciones
*/

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner calificaciones = new Scanner(System.in);
        //Declarar variables
        float c1, c2, c3, suma;
        
        //Pedir las tres calificaciones al usuario
        System.out.print("Primer calificacion: ");
        c1 = calificaciones.nextFloat();
        System.out.print("Segunda calificacion: ");
        c2 = calificaciones.nextFloat();
        System.out.print("Tercera calificacion: ");
        c3 = calificaciones.nextFloat();
        
        //Realizar la suma y mostrar el resultado en pantalla
        suma = c1 + c2 + c3;
        System.out.println("\nSuma de las tres calificaciones: "+suma);
    }
    
}
