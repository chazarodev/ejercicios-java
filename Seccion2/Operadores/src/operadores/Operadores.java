/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author chaza
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float numero1,numero2,suma,resta,multiplicacion,division,residuo;
        
        //Pedimos dos números al usuario
        System.out.print("Digite dos numeros: ");
        //almacenamos en las variables los números digitados por el usuario 
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        //Obtener la operaciones aritmeticas de los número ingresados
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        residuo = numero1 % numero2;
        
        //Imprimir el resultado
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El residuo es: "+residuo);
    }
    
}
