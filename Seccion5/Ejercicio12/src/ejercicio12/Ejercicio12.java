/*
* Leer por teclado una tabla de 10 números enteros
* Teclear una posición entre el 0 y el 9
* Eliminar el número de dicha posición y no dejar espacios
*/
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Definimos el arreglo
        int arreglo[] = new int[10];
        
        //definimos el número que indicará la posición a eliminar
        int numero;
        
        //Pedir al usuario registrar 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print(i+": ");
            arreglo[i] = input.nextInt();
        }
        
        //Pedir la posición a eliminar entre el 0 y el 9
        do {
            System.out.print("Digita la posicion a eliminar [0 - 9]: ");
            numero = input.nextInt();
            if (numero < 0 || numero > 9) {
                System.out.println("Numero fuera de rango, vuelve a intentar\n");
            }
        } while (numero < 0 || numero > 9);
        
        //Indicar el número que se eliminó
        System.out.println("El numero "+arreglo[numero]+" se elimino del arreglo");
        
        //Recorrer el arreglo una posición del final hasta la posición indicada para eliminar el número
        for (int i = numero; i < 9; i++) {
            arreglo[i] = arreglo[i + 1]; 
        }
        
        //Mostrar el nuevo arreglo
        for (int i = 0; i < 9; i++) {
            System.out.print(arreglo[i]+", ");
        }
        System.out.println("\n");//Aplicar un salto de línea
        
    }
    
}
