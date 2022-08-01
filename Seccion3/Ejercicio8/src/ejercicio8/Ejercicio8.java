/*
    Pedir un número entre 0 y 99,999 y decir cuántas cifras tiene el número
*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        
        //Pedir número al usuario
        System.out.print("Digite un numero entre 0 y 99,999: ");
        numero = input.nextInt();
        
        if ((numero >= 0) && (numero <= 99999)) {
            if (numero <= 9) {
                System.out.println("El numero tiene 1 cifra");
            } else if ((numero >= 10) && (numero <= 99)) {
                System.out.println("El numero tiene 2 cifras");
            } else if ((numero >= 100) && (numero <= 999)) {
                System.out.println("El numero tiene 3 cifras");
            } else if ((numero >= 1000) && (numero <= 9999)) {
                System.out.println("El numero tiene 4 cifras");
            } else if ((numero >= 10000) && (numero <= 99999)) {
                System.out.println("El numero tiene 5 cifra");
            }
        } else {
            System.out.println("Numero digitado fuera de rango");
        }
    }
}
