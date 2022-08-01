/*
    Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca
    un número negativo
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar variables ya que utilizaremos método math
        int numero, potencia;
        
        //Solictar número al usuario
        System.out.print("Digite un numero entero: ");
        numero = input.nextInt();
        
        //Verificar si el número es positvo, entramos a la condición
        while(numero >= 0) {
            //Calcular la potencia del número
            potencia = (int)Math.pow(numero, 2);
            System.out.println(numero+"^2 = "+potencia);
            
            //Volver a pedir el número
            System.out.print("Digite un numero entero: ");
            numero = input.nextInt();
        }
    }
    
}
