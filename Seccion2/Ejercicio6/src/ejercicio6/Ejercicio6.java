/*
Realizar un programa que calcule el cuadrado de una suma (a + b)^2
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declaramos las variables
        double a, b, c, resultado, exponente = 2;
        
        //Ingresamos los datos
        System.out.print("Variable a = ");
        a = input.nextInt();
        System.out.print("Variable b = ");
        b = input.nextInt();
        
        //Realizar calculo
        c = a + b;
        resultado = Math.pow(c, exponente);
        
        //Mostrar resultado
        System.out.println("\nEl cuadrado de la suma de "+a+" y "+b+" es igual a = "+resultado);
    }
    
}
