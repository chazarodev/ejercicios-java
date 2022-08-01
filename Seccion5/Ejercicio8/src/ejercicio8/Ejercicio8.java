/*
* Diseñar una aplicación que declare una tabla de 10 elementos enteros
* Leer mediante el teclado 8 números.
* Después se debe pedir un número y una posición e insertar este último número
* en la posición indicada desplazando a los demás números
*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declaramos un arreglo de 10 posiciones
        int array[] = new int[10];
        //Variable para colocar el último número en la posición indicada
        int numero, posicion;
        
        //Pedir al usuario registrar los números
        for (int i = 0; i < 8; i++) {
            System.out.print(i+".- Digita un numero: ");
            array[i] = input.nextInt();
        }
        
        System.out.print("Digita un numero: ");
        numero = input.nextInt();
        System.out.print("Digita una posicion: ");
        posicion = input.nextInt();
        
        //Recorrer un posición los elementos del arreglo
        for (int i = 7; i >= posicion; i--) {
            array[i+1] = array[i];
        }
        
        //Colocamos el numero en la posicion especificada
        array[posicion] = numero;
        
        //Mostrar el arreglo con forEach
        for(int elemento:array) {
            System.out.println(".-"+elemento);
        }
    }
    
}
