/*
* Pedir un número y calcular su factorial
*/
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar variable de tipo entero
        int n, i;
        long factorial;
        
        //Inicializamos factorial e iterador con valor de 1
        factorial = 1;
        i = 1;
        
        //Pedir al usuario que factorial desea calcular
        System.out.print("Indica numero factorial: ");
        n = input.nextInt();
        
        //Iniciar bucle while
        while (i <= n) {            
            factorial *= i;
            i++;
        }
        
        //Mostrar resultado
        System.out.println(n+"! = "+factorial);
    }
    
}
