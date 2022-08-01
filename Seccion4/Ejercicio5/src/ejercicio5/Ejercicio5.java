/*
    Realizar un juego para adivinar un número aleatorio entre 0-100.
    Pedir números indicando si el número aleatorio es mayor o menor
    al numero tecleado por el usuario.
    El proceso termina cuando el usuario acierta.
    Mostrar el numero de intentos
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar variables
        double random; 
        int numero, intentos = 0;
        
        //Inicializar número aleatorio
        random = Math.round(Math.random()*100);
        
        //Pedir al usuario adivinar el numero
        System.out.println("Intente adivinar el numero");
        System.out.print("\nDigite un numero entre el 0 y el 100: ");
        numero = input.nextInt();
        
        while(numero != random) {
            intentos++;
            if (numero > random) {
                System.out.println("El numero aleatorio es menor");
            } else {
                System.out.println("El numero aleatorio es mayor");
            }
            //Volver a pedir al usuario ingresar un numero
            System.out.print("\nDigite un numero entre el 0 y el 100: ");
            numero = input.nextInt();
        }
        
        System.out.println("Adivinaste! Lo lograste en "+intentos+" intentos");
    }
    
}
