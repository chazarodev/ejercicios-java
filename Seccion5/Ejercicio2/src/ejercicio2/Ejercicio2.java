/*
* Guardar 5 números en un arreglo, pero mostrarlos en pantalla
* en el orden inverso al introducido
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Declarar el arreglo
        float[] numeros = new float[5];
        
        //Pedir los números con un bucle for
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = input.nextFloat();
        }
        
        //Mostrar los numeros en pantalla en el orden inverso
        System.out.println("Los numeros se mostraran empezando desde el ultimo numero digitado\n");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i]+", ");
        }
    }
    
}
