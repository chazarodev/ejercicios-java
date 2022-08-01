/*
* Leer 10 números en un arreglo.
* Guardar en un arreglo los que son pares.
* Guardar en otro arreglo los que son impares
*/
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Definimos el primer arreglos
        int arreglo[] = new int[10];
        //Definir dos contadores que nos servirán para el iterador y un iterador
        int contadorPar = 0, contadorImpar = 0;
        
        //Pedir al usuario registrar numeros
        System.out.println("Registra 10 numeros enteros");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+": ");
            arreglo[i] = input.nextInt();
            
            if (arreglo[i] % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
        
        //Definimos los arreglos par e impar
        int arregloPar[] = new int[contadorPar];
        int arregloImpar[] = new int[contadorImpar];
        
        //Reseteamos los contadores a cero
        contadorPar = 0; 
        contadorImpar = 0;
        
        //Mostrar el arreglo
        System.out.print("El arreglo digitado es el siguiente: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i]+", ");
        }
        System.out.println("\n");//Salto de línea
        
        //Leer el arreglo y llenar segun el numero en el arreglo correspondiente
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {//El número es par
                //Asignamos el valor a la posición
                arregloPar[contadorPar] = arreglo[i];
                //Aumentar el contador par en 1
                contadorPar++;
            } else {//El número es impar
                //Asignamos el valor a la posición
                arregloImpar[contadorImpar] = arreglo[i];
                //Aumentamos el contador
                contadorImpar++;
            }
        }
        
        //Validar si hay números pares
        if (contadorPar > 0) {
            System.out.print("Los numeros pares son: ");
            for (int i = 0; i < contadorPar; i++) {
                System.out.print(arregloPar[i]+", ");
            }
            System.out.println("\n");//Salto de línea
        } else {
            System.out.println("\nNo hay numeros pares");
        }
        
        //Validar si hay números impares
        if (contadorImpar > 0) {
            System.out.print("Los numeros impares son: ");
            for (int i = 0; i < contadorImpar; i++) {
                System.out.print(arregloImpar[i]+", ");
            }
            System.out.println("\n");//Salto de línea
        } else {
            System.out.println("\nNo hay numeros impares");
        }
        
    }
    
}
