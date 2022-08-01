/*
    Pedir tres número y mostrarlos ordenos de mayor a menor
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //Declarar las tres variables
        int a, b, c;
        
        //Pedir al usuario registrar tres números
        System.out.print("Digite el numero a: ");
        a = input.nextInt();
        System.out.print("Digite el numero b: ");
        b = input.nextInt();
        System.out.print("Digite el numero c: ");
        c = input.nextInt();
        
        //Determinar el orden descendente de los números
        if ((a > b) && (a > c)) { //Si a es mayor que b
            if (b > c) { //si b mayor que c, entonces: a, b, c
                System.out.println("Numeros en ordenados: "+a+", "+b+", "+c);
                return;
            }
            //Si no se cumple b > c, entonces: a, c, b
            System.out.println("Numeros en ordenados: "+a+", "+c+", "+b);
        } else if ((b > a) && (b > c)) { //1er condicion falsa, por tanto, b > a
            if (a > c) {// si a mayor que c, entonces: b, a, c
                System.out.println("Numeros en ordenados: "+b+", "+a+", "+c);
                return;
            }
                //De lo contrario c es mayor que a, por tanto: b, c, a
                System.out.println("Numeros en ordenados: "+b+", "+c+", "+a);            
        } else {//Primeras dos condiciones no se cumplen, por tanto, c es el número mayor
            if (a > b) {//Si a > b, por tanto: c, a, b
                System.out.println("Numeros en ordenados: "+c+", "+a+", "+b);
                return;
            }//No se cumple if, por tanto b > a
            System.out.println("Numeros en ordenados: "+c+", "+b+", "+a);
        }
    }
}
