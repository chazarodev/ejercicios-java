/*
 * Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar 
 * la media de los positivos, negativos y contar el número de ceros
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Declarar variables
        int contadorCeros = 0, contadorP = 0, contadorN =0;
        float Positivos = 0, Negativos = 0, mediaP = 0, mediaN = 0;
        float[] numeros = new float[5];
        
        //Pedir números al usuario
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = input.nextFloat();
        }
        
        //Recorrer el arreglo con un bucle for
        for (int i = 0; i < 5; i++) {
            //Realizar condición para evaluar si el número es positivo, negativo o cero
            if (numeros[i] != 0){//Si número es distinto de cero
                if (numeros[i] > 0) {
                    Positivos += numeros[i];
                    contadorP++;
                } else if (numeros[i] < 0) {
                    Negativos += numeros[i];
                    contadorN++;
                }
            } else {
                //Si es igual a ceros el contador aumenta
                contadorCeros++;
            }
        }
        
        //Evaluar si hay números positivos o negativos para poder calcular la media
        if (Positivos != 0) {
            //Calcular la media
            mediaP = Positivos / contadorP;
            System.out.println("La media de los positivos: "+mediaP);
        } else {
            System.out.println("No hay numeros positivos");
        }
        
        if (Negativos != 0) {
            mediaN = Negativos / contadorN;
            System.out.println("La media de los negativos: "+mediaN);
        } else {
            System.out.println("No hay numeros negativos");
        }
        
        //mostrar conteo de 0
        System.out.println("Conteo de numeros cero: "+contadorCeros);
        
    }
    
}
