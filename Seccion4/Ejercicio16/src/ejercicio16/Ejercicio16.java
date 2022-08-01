/*
*Pide un número al usuario entre el 0 y el 10 y mostrar la tabla de multiplicar de
* dicho número
*/
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, resultado;
        
        //Pedir el número al usuario entre el 0 y el 10 con un bucle do while
        do {            
            System.out.print("Ingresa un numero entre el 0 y el 10: ");
            numero = input.nextInt();
            
            //Mostrar al usuario si el número es mayor o menor
            if (numero > 10) {
                System.out.println("El numero es mayor a 10, intenta con otro numero\n");
            } else if(numero < 0) {
                System.out.println("El numero es menor a 0, intenta con otro numero\n");
            }
            
        } while (numero > 10 || numero < 0); // Si no cumple la condición volver a pedir el número
        
        //Cumple la condición, entonces, mostrar la tabla de multiplicar con un bucle for
        for (int i = 0; i <= 10; i++) {
            resultado = numero * i; //Realizar multiplicación
            System.out.println(numero+"*"+i+" = "+resultado); //Mostrar resultado en pantalla
        }
        
    }
    
}
