/*
*Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Declarar el arreglo
        float[] numeros = new float[5];//Arreglo de 5 posiciones
        
        //Pedir los numeros al usuario
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el "+(i+1)+". numero: ");
            numeros[i] = input.nextFloat();//Almacenar el número en el arreglo
        }
        
        //Mostrar los números introducidos con un bucle forEach
        System.out.println("Los numeros introducidos son:");
        for (float numero:numeros) {
            System.out.print(numero+", ");
        }
    }
    
}
