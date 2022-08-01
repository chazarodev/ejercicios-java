/*
*Pedir 10 números. Mostrar la medía de los números positivos, la media de los
*números negativos y la cantidad de ceros
*/
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarar las variables en float
        float mediaPositivos, mediaNegativos, sumaP = 0, sumaN = 0;
        //Declarar en int los contadores y números a registrar
        int numero, contadorPositivo = 0, contadorNegativo = 0, contadorCeros = 0;
        
        //Pedir al usuario registrar 10 números con el bucle for
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el "+i+" numero: ");
            numero = input.nextInt();
            
            //Evaluar si el número es positivo, negativo o cero
            if (numero > 0) {
                contadorPositivo++;
                sumaP += numero;
            } else if (numero < 0) {
                contadorNegativo++;
                sumaN += numero;
            } else {
                contadorCeros++;
            }
        }
        
        //Evaluar si se introdujeron numeros positivos y negativos
        if (contadorPositivo > 0 ) {
            mediaPositivos = sumaP / contadorPositivo;
            System.out.println(sumaP);
            System.out.println("La media de los numeros positivos: "+mediaPositivos);
        } else {
            System.out.println("No se introdujeron numeros positivos");
        }
        
        if (contadorNegativo > 0) {
            mediaNegativos = sumaN / contadorNegativo;
            System.out.println("La media de los numeros negativos: "+mediaNegativos);
        } else {
            System.out.println("No se introdujeron numeros negativos");
        }
        
        //mostrar la cantidad de ceros
        System.out.println("La cantidad de ceros: "+contadorCeros);
    }
    
}
