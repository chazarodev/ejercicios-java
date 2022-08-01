/*
* Leer 10 números por teclado
* desplazar los números n posiciones
* las posiciones a desplazar es digitado por el usuario
*/
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar un arreglo de 10 posiciones
        int arreglo[] = new int[10];
        //Declarar una variable auxiliar y otra para el numero de desplazamientos
        int aux, desplazamiento;
        
        //Solicitar los números del arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print("Posicion "+i+": ");
            arreglo[i] = input.nextInt();
        }
        
        //Pedir el número de posiciones a desplazar
        do {            
            System.out.print("Digite numero de posiciones a desplazar: ");
            desplazamiento = input.nextInt();
        } while (desplazamiento < 0);
        
        //Recorrer con un bucle anidado las posiciones
        for (int i = 0; i < desplazamiento; i++) {
            //aux se iguala al valor la posicion[9]
            aux = arreglo[9];
            for (int j = 9; j > 0; j--) {
                arreglo[j] = arreglo[j - 1];
            }
            //La posicion[0] cero del arreglo toma el valor de aux
            arreglo[0] = aux;
        }
        
        //Mostrar el nuevo arreglo con las posiciones desplazadas
        System.out.println("El arreglo se desplazo "+desplazamiento+" posiciones");
        for (int numero:arreglo) {
            System.out.print(numero+", ");
        }
    }
    
}
