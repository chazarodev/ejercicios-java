/* Hacer un programa que calcule e imprima el salario semanal de un empleado
    a partir de sus horas trabajadas y de su salario por hora
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declarar las variables
        float salario, salarioSemanal;
        int horasTrabajadas;
        String nombreTrabajador;
        
        //Pedir datos al usuario
        System.out.print("Nombre del trabajador: ");
        nombreTrabajador = input.nextLine();
        System.out.print("Salario por hora que percibe: $");
        salario = input.nextFloat();
        System.out.print("Horas trabajadas durante la semana: ");
        horasTrabajadas = input.nextInt();
        
        //Calcular salario semanal y mostrar en pantalla
        salarioSemanal = salario * horasTrabajadas;
        System.out.println("\nEl salario semanal de "+nombreTrabajador+" es de $"+salarioSemanal);
    }
    
}
