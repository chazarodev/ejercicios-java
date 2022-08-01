/*
* Leer los datos correspondientes a dos tablas de 12 elementos númericos
* y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, 3 de A, 3 de B, etc.
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Declarar los arreglos
        int a[], b[], c[];
        //Conteo de los arreglos
        int conteoA = 0, conteoB = 0;
        
        //Establecer el espacio de los arreglos
        a = new int[12];
        b = new int[12];
        c = new int[24];
        
        //Pedir el registro de los arreglos
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1)+". Elemento de A: ");
            a[i] = input.nextInt();
            System.out.print((i+1)+". Elemento de B: ");
            b[i] = input.nextInt();
            System.out.println();//Salto de línea
        }
        
        //insertar los elementos en el arreglo c
        int j = 0; //Inicializar iterador j para registrar datos de los arreglos
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                c[j] = a[conteoA];
                j++;
                conteoA++;
                c[j] = a[conteoA];
                j++;
                conteoA++;
                c[j] = a[conteoA];
                j++;
                conteoA++;
            } else {
                c[j] = b[conteoB];
                j++;
                conteoB++;
                c[j] = b[conteoB];
                j++;
                conteoB++;
                c[j] = b[conteoB];
                j++;
                conteoB++;
            }
        }
        
        //El resultado del tercer arreglo
        System.out.println("\nResultado del arregloc");
        for (int i = 0; i < 24; i+=3) {
            System.out.print("Grupos de tres: "+c[i]+", "+c[i+1]+", "+c[i+2]+"\n");
        }
    }
}
