/*
    Pedir numeros hasta introducir uno negativo, calcular la media
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        float numero, media, suma = 0;
        
        System.out.print("Introduzca un numero: ");
        numero = input.nextFloat();
        
        while(numero >= 0) {
            contador++;
            suma += numero;
            System.out.print("Digite el siguiente numero: ");
            numero = input.nextFloat();
        }
        
        if (contador == 0) {
            System.out.println("Error no se puede dividir");
        } else {
            media = suma / contador;
            System.out.println("\nLa media de los numeros digitados es: "+media);            
        }
    }
    
}
