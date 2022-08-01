/*
    Hacer un programa que tome dos números e indique el par e impar, o si ambos
    son pares o impares
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        
        //Pedir números al usuario
        System.out.print("Digite el primer numero: ");
        a = input.nextInt();
        System.out.print("Digite el segundo numero: ");
        b = input.nextInt();
        
        //Corrobar si los número son par o impar
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                System.out.println("\nAmbos numeros son pares");
                return;
            }
            System.out.println("numero "+a+" es par, "+b+" es impar");
            return;
        } else if (b % 2 == 0) {
            System.out.println("numero "+b+" es par, "+a+" es impar");
            return;
        }
        
        System.out.println("\nAmbos numeros son impares");
    }
}
