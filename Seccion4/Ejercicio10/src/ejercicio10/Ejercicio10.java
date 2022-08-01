/*
*Pedir 10 número y hacer la suma total
*/
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar variable para número, iterador y la suma
        int n, i, suma = 0;
        
        //Inicializar el iterador en 1
        i = 1;
        
        while (i <= 10) {            
            System.out.print("Digita el numero "+i+": ");
            //Guardamos valor dentro de n
            n = input.nextInt();
            //Actualizamos el resultado de suma
            suma += n;
            //Aumentamos el iterador en 1
            i++;
        }
        
        //Salimos del bucle y mostramos la suma en pantalla
        System.out.println("La suma de los 10 numeros ingresados es: "+suma);
    }
    
}
