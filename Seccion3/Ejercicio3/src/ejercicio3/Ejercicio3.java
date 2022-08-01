/*
    Escribir un programa que lea un caracter y por teclado
    y compruebe si es una letra mayúscula
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declarar como entero el caracter que vamos a solicitar al usuario.
        int asciiValue;
        
        //Pedir al usuario que escriba una letra
        System.out.print("Escriba una letra (a-z) en mayuscula o minuscula: ");
        asciiValue = input.next().charAt(0); //Guardar como caracter en la variable asciiValue
        
        if ((asciiValue >= 65) && (asciiValue <= 90)) {//Determinar si es mayuscula
            System.out.println("Es una letra mayuscula");
        } else if ((asciiValue >= 97) && (asciiValue <= 122)) { //Determinar si es minuscula
            System.out.println("Es una letra minuscula");
        } else {
            System.out.println("No es una letra"); //Caso contrario, no se digitó una letra
        }
       
    }
    
}
