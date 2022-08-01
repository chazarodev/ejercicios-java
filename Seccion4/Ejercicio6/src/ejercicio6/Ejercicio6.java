/*
    Pedir números hasta que se teclee un 0
    mostrar la suma iterativa de los numeros digitados
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declarar variables, inicializar suma en 0
        int numero, suma = 0;
        
        //Pedir registrar numero al usuario
        System.out.print("Ingrese un numero entero: ");
        numero = input.nextInt();
        
        while(numero != 0) {
            //a la variable suma, sumar el numero ingresado
            suma += numero;
            //Pedir un nuevo número
            System.out.print("Ingrese un numero entero: ");
            numero = input.nextInt();
        }
        
        //Mostrar la suma en pantalla
        System.out.println("\nLa suma de los numeros registrados es igual a: "+suma);
    }
    
}
