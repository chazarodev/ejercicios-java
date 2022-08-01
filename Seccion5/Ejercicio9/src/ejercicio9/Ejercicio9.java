/*
* Leer por teclado una tabla de 10 número enteros
* desplazarlos una posición hacia abajo
* el de la posicion 0 pasa a la posición 1, así consecutivamente
* el último elemento del arreglo pasa a ocupar la posicion 0
*/
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Definir el arreglo de 10 posiciones
        int arreglo[] = new int[10];
        //Definimos una variable auxiliar
        int aux;
        
        //Pedir al usuario digitar los números
        for (int i = 0; i < 10; i++) {
            System.out.print("Posicion "+i+": ");
            arreglo[i] = input.nextInt();
        }
        
        //asiganmos el valor de aux con el último valor del arreglo
        aux = arreglo[9];
        
        //Desplazar los números una posición
        for (int i = 9; i > 0; i--) {
            arreglo[i] = arreglo[i - 1];
        }
        
        //Asignamos el valor de la posicion[0] a auxiliar
        arreglo[0] = aux;
        
        //Mostramos el arreglo desplazado
        for (int numero:arreglo) {
            System.out.print(numero+", ");
        }
    }
    
}
