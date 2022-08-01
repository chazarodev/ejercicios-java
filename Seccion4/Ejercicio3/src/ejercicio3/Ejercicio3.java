
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        
        //Solicitar número
        System.out.print("Digite un numero entero: ");
        numero = input.nextInt();
        
        while(numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("Par!");
            } else {
                System.out.println("Impar!");
            }
            //Solicitar número de nuevo
            System.out.print("Digite un numero entero: ");
            numero = input.nextInt();
        }
        
        System.out.println("El numero es 0, termina ejecucion");
    }
    
}
