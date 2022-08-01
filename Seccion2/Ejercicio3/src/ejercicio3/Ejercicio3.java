/* Guillermo tiene N dólares, Luis tiene la mitad de lo que posee Guillermo
    Juan tiene la mitad de lo que poseen Guillermo y Luis Juntos.
    Hacer un programa que calcule e imprima la cantidad de dinero
    que tienen entre los tres.
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declarar las variables.
        float dolaresGuillermo, dolaresLuis, dolaresJuan, totalDolares;
        
        //Ingresar la cantidad de dólares que tiene Guillermo
        System.out.print("Cantidad de dolares que posee Guillermo: $");
        dolaresGuillermo = input.nextFloat();
        
        //Obtener la cantidad de dólares de Luis
        dolaresLuis = dolaresGuillermo / 2;
        System.out.println("\nGuillermo tiene $"+dolaresGuillermo+" dolares."
                + "\nPor tanto, Luis tiene $"+dolaresLuis+" dolares");
        
        //Obtener la cantidad de dólares de Juan
        dolaresJuan = (dolaresGuillermo + dolaresLuis) / 2;
        System.out.println("Entonces, Juan tiene $"+dolaresJuan+" dolares");
        
        //Calcular el total de los dólares que tienen entre los tres
        totalDolares = dolaresGuillermo + dolaresLuis + dolaresJuan;
        System.out.println("\nLa suma total de dolares que tienen los tres es de: $"+totalDolares+" dolares");
    }
    
}
