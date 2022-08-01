/*
* Leer por teclado dos tablas de numeros enteros y mezclarlas en una tercera 
* de la forma: el 1ro de la tabla A - 1ro de la tabla B; el 2do de A - 2do de B: etc.
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Declarar ambos arreglos
        int arregloA[] = new int[10];
        int arregloB[] = new int[10];
        //Declarar el tercer arreglo donde combinaremos el arreglo A y el arreglo B
        int arregloC[] = new int[20];
        
        //Declarar conteo para agregar los datos del arreglo A y B en orden subsecuente
        int conteoA = 0, conteoB = 0;
        
        //Registrar los arreglos con un bucle for
        for (int i = 0; i < 10; i++) {
            //Solicitar Ingresar el numero en el arreglo A
            System.out.print((i+1)+"A. Ingresa un numero: ");
            //Registrar el numero digitado en el arreglo
            arregloA[i] = input.nextInt();
            //Solicitar Ingresar el numero en el arreglo B
            System.out.print((i+1)+"B. Ingresa un numero: ");
            //Registrar el numero digitado en el arreglo
            arregloB[i] = input.nextInt();
        }
        
        //Recorrer el arreglo A y el arreglo B y registrarlos en el Arreglo C
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                arregloC[i] = arregloA[conteoA];
                conteoA++;
            } else {
                arregloC[i] = arregloB[conteoB];
                conteoB++;
            }
        }
        
        //Recorrer el arreglo C y mostrar en pantalla
        //Reseteamos conte a a 1
        conteoA = 1;
        System.out.println("\n");
        for (int i = 0; i < 20; i+=2) {
            System.out.println(conteoA+". numero del arreglo A y B: "+arregloC[i]+", "+arregloC[i+1]);
            conteoA++;
        }
        
    }
    
}
