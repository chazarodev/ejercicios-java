/*
* Leer 5 elementos númericos que se introducirán ordenados de forma ascendente
* Los guardaremos en un array de tamaño 10
* Leer un número n e insertarlo en orden en el lugar correspondiente para que el array continue ordenado
*/
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar el array de tamaño 10
        int arreglo[] = new int[10];
        //Declarar max y el número a ingresar después de digitado el arreglo y el valor máximo para ordenar
        int numero, max=0;
        
        //Pedir cinco digitos al usuario para llenar el arreglo indicando que sean de forma ascendente
        System.out.println("Digita 5 numeros de forma ordenada ascendente");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print((i + 1)+": ");
                arreglo[i] = input.nextInt();
            } while (arreglo[i] < max);
            max = arreglo[i];
            System.out.print("\n");
        }
        
        //Solicitar el nuevo numero
        System.out.print("Digita un nuevo numero: ");
        numero = input.nextInt();
        //Igualamos numero a la última posición del arreglo
        arreglo[5] = numero;
        
        //Colocar el nuevo numero en el lugar correspondiente de acuerdo al orden
        for (int i = 4; i > 0; i--) {
            if (arreglo[i] > arreglo[i+1]) { //Evaluamos si la posicion actual es mayor a numero
                arreglo[i+1] = arreglo[i]; //El valor de la posicion actual la recorremos un espacio
                arreglo[i] = numero; //numero lo colocamos en la posicion actual
            }
        }
        
        //Mostramos el arreglo
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i]+", ");
        }
        
    }
    
}
