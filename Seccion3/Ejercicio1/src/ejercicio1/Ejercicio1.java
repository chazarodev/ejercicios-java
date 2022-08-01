/*Crear un programa que lea un número entero y muestre si el número
    es multiplo de 10
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar variables
        int numero;
        String resultado;
        
        //Solicitar número al usuario
        System.out.print("Digite un numero: ");
        numero = input.nextInt();
        
        //Realizar condición ternaria
        resultado = (numero % 10) == 0 ? 
                "El numero "+numero+" es multiplo de 10" : 
                "El numero "+numero+" NO es un multiplo de 10";
        
        //Mostrar resultado en pantalla
        System.out.println("\n"+resultado);
        
    }
    
}
