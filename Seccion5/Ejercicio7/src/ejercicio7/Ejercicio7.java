/*
* Leer por teclado una sere de 10 números enteros. La aplicación debe decirnos si los números
* estan ordenados de forma creciente, decreciente o si estan desordenados
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Declaramos un arreglo de 10 posiciones
        int arreglo[] = new int[10];
        
        //Declaramos variables para determinar un mínimo y un máximo
        int minMax;
        //Asginar valores booleanos como bandera
        boolean creciente = false, decreciente = false, iguales = false;
        
        //Pedimos al usuario registrar 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite el numero: ");
            arreglo[i] = input.nextInt();
        }
        
        //Asignar minMax a la posición cero del arreglo
        minMax = arreglo[0];
        
        //Comprobar si el arreglo es decreciente, creciente o desordenado
        for (int i = 0; i < 10; i++) { //Recorremos el arreglo
            if (i != 0) {//La posición ya no es la 0;
                //Entonces, evaluamos:
                if (arreglo[i] > minMax && arreglo[i-1] <= minMax) {
                    //Evaluamos creciente a true
                    creciente = true;
                    //Reasignamos el valor de minMax a la posición actual del arreglo
                    minMax = arreglo[i];
                } else if (arreglo[i] < minMax && arreglo[i-1] >= minMax){
                    //Evaluamos  decreciente a true
                    decreciente = true;
                    //Reasignamos el valor minMax a la posición actual
                    minMax = arreglo[i];
                }
            }
            System.out.println(creciente+" "+decreciente+" "+iguales);
        }
        
        
        //Indicar la forma del arreglo
        if (creciente == true && decreciente == true) { //Si ambos indicadores se activan, entonces,
            System.out.println("El arreglo esta desordenado"); //El arreglo está desordenado
        } else if (iguales == true && creciente == false && decreciente == false) { //Todos los números son iguales
            System.out.println("Todos los numeros son iguales");
        } else {//Em caso contrario solo un se activo, por tanto, evaluamos:
            if (creciente == true && decreciente == false) {//Si creciente es true y decreciente false:
                System.out.println("El arreglo esta ordenado de forma Creciente");//Es creciente
            } else if (decreciente == true && creciente == false) {//Si decreciente es true y creciente false
                System.out.println("El arreglo esta ordenado de forma Decreciente");//Es decreciente
            }
        }
    }
}
