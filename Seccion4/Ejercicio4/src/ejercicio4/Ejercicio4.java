/*
    Pedir números hasta que se teclee un negativo,
    Mostrar la cantidad de numeros ingresados
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //DEclarar variables, inicializar contador en 0
        int numero, contador = 0;
        
        //Pedir números
        System.out.print("Digite un numero entero: ");
        numero = input.nextInt();
        
        while(numero >= 0) {
            contador++;//Aumentamos en 1 el contador
            //Volver a pedir número hasta que la condición sea false
            System.out.print("Digite un numero entero: ");
            numero = input.nextInt();
        }
        
        //Salimos del bucle y mostramos la cantidad de números tecleados
        System.out.println(+contador+" numeros fueron digitados");
    }
    
}
