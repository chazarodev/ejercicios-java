/*
* Leer 10 números enteros, almacenarlos en un arreglo y mostrarlos en el siguiente orden:
* 1ro, 10mo, 2do, 9no, 3ro, 8vo, 4to, 7mo, 5to, 6to.
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Declarar variables
        int maxI = 9;
        int[] numeros = new int[10];
        
        //Pedir números al usuario
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = input.nextInt();
        }
        
        //Mostrar los números como pide el ejercicio
        for (int i = 0; i < 5; i++) {
            //Empezar a imprimir desde la primera posición
            System.out.print(numeros[i]+", ");
            //Realizar otro bucle empezando desde la posición final
            for (int j = 9; j >= 5; j--) {
                //Evaluar si la posición es igual a maxI; cuando no se cumpla, lograremos salir del bucle.
                if (j == maxI) {
                    //Entonces imprimimos el número
                    System.out.print(numeros[j]+", ");
                }
            }
            //Salimos del bucle for que empieza desde la última posición
            maxI--; //Disminuimos en uno maxI, para evaluar como true la siguiente entrada al bucle.
        }
        
    }
    
}
