/*
*Diseñar un programa que muestre el producto de los 10 primeros número impares
*/
package ejercicio11;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        //Declaramos e incializamos variables a 1; Producto se incia en 1 y no en 0, de lo contrario el resultado sería 0
        int i = 1, impar = 10;
        long producto = 1;
        
        while (impar > 0) { //Ejecutar hasta que impar sea 0
            
            if (i % 2 != 0) { 
                System.out.println(i);
                //Multiplicación iterativa;
                producto *= i;
                //se cumple la condición, impar disminuye
                impar --;
            }
            
            //Aumentamos el iterador en 1
            i++;
        }
        
        //Sale del bucle y mostramos el resultado en pantalla
        System.out.println("El producto de los 10 numeros impares es: "+producto);
    }
    
}
