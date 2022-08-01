/*
    Pedir dos número e indicar cuál es el mayor o si son número iguales
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar las variables
        int a, b;
        
        //Pedir los números al usuario
        System.out.print("Digite el numero a: ");
        a = input.nextInt();
        System.out.print("Digite el numero b: ");
        b = input.nextInt();
        
        if (a != b) {//Si a es distinto a es distinto a b
            if (a > b) {//Si a es mayor a b
                System.out.println("El numero "+a+" es mayor a "+b);
            } else {//Caso contrario
                System.out.println("El numero "+b+" es mayor a "+a);
            }
            return; //Termina ejecución del programa
        }
        
        //Si no entramos a la condicional
        System.out.println("Los numeros son iguales");
   
    }
    
}
