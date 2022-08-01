/*
* Leer dos series de 10 números enteros ordenados de forma creciente
* Fusionar los dos arreglos en un tercero de forma que sigan ordenados los números
*/
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar los tres arreglos
        int arreglo_uno[], arreglo_dos[], arreglo_tres[];
        
        //Declarar el espacio de cada arreglo
        arreglo_uno = new int[10];
        arreglo_dos = new int[10];
        arreglo_tres = new int[20];
        
        //Variable booleana para validar el orden de los arreglos
        boolean arreglo_ordenado = false;
        
        //Pedir el registro del primer arreglo
        System.out.println("Registrar los 10 numeros del arreglo uno");
        
        //Ingresar y validar que el arreglo sea en orden ascendente con un bucle do while
        do {
            //Registrar los números
            for (int i = 0; i < 10; i++) {
                System.out.print((i+1)+": ");
                arreglo_uno[i] = input.nextInt();
            }
            
            //Validar si esta ordenado
            for (int i = 0; i < 9; i++) {
                //Si el arreglo no es ascendente, entra a la condición y generamos un break;
                if (arreglo_uno[i] > arreglo_uno[i + 1]) {
                    arreglo_ordenado = false;
                    break;
                }
                
                arreglo_ordenado = true; //Cambiamos el valor a ordenado
           }
            
            if (arreglo_ordenado == false) {
                System.out.println("El arreglo introducido no esta ordenado de forma ascendente");
                System.out.println("Ingresa un nuevo arreglo");
            }
            
        } while (arreglo_ordenado == false);
        
        //Resetear el valor booleano a false
        arreglo_ordenado = false;
        
        //Pedir el registro del segundo arreglo
        System.out.println("Registrar los numeros del arreglo dos");
        
        //Ingresar y validar que el arreglo sea en orden ascendente con un bucle do while
        do {
            //Registrar los números
            for (int i = 0; i < 10; i++) {
                System.out.print((i+1)+": ");
                arreglo_dos[i] = input.nextInt();
            }
            
            //Validar si esta ordenado
            for (int i = 0; i < 9; i++) {
                //Si el arreglo no es ascendente, entra a la condición y generamos un break;
                if (arreglo_dos[i] > arreglo_dos[i + 1]) {
                    arreglo_ordenado = false;
                    break;
                }
                
                arreglo_ordenado = true;
            }
            
            if (arreglo_ordenado == false) {
                System.out.println("El arreglo introducido no esta ordenado de forma ascendente");
                System.out.println("Ingresa un nuevo arreglo");
            }
            
        } while (arreglo_ordenado == false);
        
        //Declarar dos iteradores para las comparaciones de cada posición de cada arreglo
        int i=0, j = 0, k = 0; //i arreglo_uno, j arreglo_dos, k arreglo_tres;
        
        //Leer ambos arreglos e insertarlos en el tercero de forma ordenada
        while (i<10 && j<10) {//Copiar hasta terminar con cualquiera de los dos arreglos,                
            if (arreglo_uno[i] < arreglo_dos[j]) {//Arreglo ascendente, por tanto
                arreglo_tres[k] = arreglo_uno[i]; //Agregamos el elemento menor de cada arreglo.
                i++; //Avanzamos uno en el iterador del arreglo_uno.
            } else {
                arreglo_tres[k] = arreglo_dos[j]; //Agregamos el elemento menor de cada arreglo.
                j++; //Avanzamos uno en el iterador del arreglo_dos.
            }
            k++; //Avanzamos uno en el iterador del arreglo_tres.
        }
        
        //Termina bucle while, significa que uno de dos arreglos se copió por completo en el tercer arreglo
        if (i == 10) {//Significa que el arreglo uno terminó de copiarse
            while(j < 10) {
                arreglo_tres[k] = arreglo_dos[j];//Terminamos de copiar el arreglo dos
                j++;
                k++;
            }
        } else {
            while (i < 10) {                
                arreglo_tres[i] = arreglo_uno[j];//Terminamos de copar el arreglo uno
                i++;
                k++;
            }
        }    
        
        //Mostrar el tercer arreglo con un bucle for each
        for (int numero:arreglo_tres) {
            System.out.print(numero+", ");
        }
    }
}
