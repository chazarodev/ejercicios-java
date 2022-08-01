/*Pedir un número n, y mostrar todos los números
    del 1 al n
*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        //Pedir el número al usuario
        System.out.print("Ingrese el numero maximo de la serie: ");
        n = input.nextInt();
        
        //Realizar bucle
        for (int i = 1; i <= n; i++) {
            //Mostrar en pantalla el número
            System.out.println(i);
        }
    }
    
}
