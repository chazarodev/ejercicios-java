/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasemath;

import java.util.Scanner;

/**
 *
 * @author chaza
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double base, exponente, potencia, raiz;
        
        //Ingresar datos
        System.out.print("Ingrese una Base: ");
        base = entrada.nextFloat();
        System.out.print("Ingrese una Potencia a elevar: ");
        exponente = entrada.nextFloat();
        
        //Realizar operaciones con libreria Math
        potencia = Math.pow(base, exponente);
        raiz = Math.sqrt(base);
        
        //Imprimir resultado
        System.out.println("La raiz cuadrada de "+base+" es igual a: "+raiz);
        System.out.println("La potencia de "+base+" elevado al "+exponente+" es igual a: "+potencia);
    }
    
}
