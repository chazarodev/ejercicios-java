/*
 * Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de $1000
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sueldo, sumaSueldo = 0, mayorMil = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+ "Ingresa un sueldo: ");
            sueldo = input.nextInt();
            sumaSueldo += sueldo;
            if (sueldo > 1000) {
                mayorMil++;
            }
        }
        
        System.out.println("La suma de los sueldos igual a: "+sumaSueldo);
        
        if (mayorMil > 0) {
            System.out.println("Sueldos mayores a mil: "+mayorMil);
        } else {
            System.out.println("No hay sueldos mayores a $1000");
        }
    }
    
}
