/*
    Un obrero necesita calcular su salario semanal el cual se obtiene de la siguiente manera:
    Si trabaja 40 horas o menos se le paga $16 por hora.
    Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20
    por cada hora extra.
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int horas, horasExtras, salario;
        
        //Solicitar Datos
        System.out.print("Nombre del Obrero: ");
        nombre = input.nextLine();
        System.out.print("Horas semanales trabajadas: ");
        horas = input.nextInt();
        
        //Condicional para determinar si las horas son mayor a 40
        if (horas <= 40) {
            //Se pagará $16 por hora
            salario = horas * 16;
        } else {
            //Calcular las horas extra
            horasExtras = horas - 40;
            //Igualar las horas a 40
            horas -= horasExtras;
            //Se pagará $16 por primeras 40 hrs, $20 por hora extra
            salario = (horas * 16) + (horasExtras * 20);
        }
        
        //Mostrar el salario semanal en pantalla    
        System.out.println("\nSalario semanal: $"+salario);
    }
    
}
