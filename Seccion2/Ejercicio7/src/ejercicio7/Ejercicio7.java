/*Construir un programa que dado un número total de horas, devuelva
    número de semanas, días y horas equivalentes.
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar variables
        int semanas, dias, horas;
        
        //Solicitar el número de horas
        System.out.print("Total de horas: ");
        horas = input.nextInt();
        
        //Calcular semanas, días y horas
        semanas = horas / 168;
        dias = (horas / 24) - (semanas * 7);
        horas %= 24;
        
        System.out.println(semanas+" semanas");
        System.out.println(dias+" dias");
        System.out.println(horas+" horas");
    }
    
}
