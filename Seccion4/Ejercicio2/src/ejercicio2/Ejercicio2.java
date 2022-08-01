/*
    Leer un número e indicar sy es positivo o negativo
    terminar la ejecución cuando se digite el número 0
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        
        //Solicitar número
        System.out.print("Digite un numero entero: ");
        numero = input.nextInt();
        
        while(numero != 0) {
            if (numero > 0) {
                System.out.println("Positivo!");
            } else {
                System.out.println("Negativo!");
            }
            //Solicitar número de nuevo
            System.out.print("Digite un numero entero: ");
            numero = input.nextInt();
        }
        
        System.out.println("El numero es 0, termina ejecucion");
    }
    
}
