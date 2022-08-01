/*
* Dadas las edades y altura de 5 alumnos, mostrar la edad y estatura media,
* la cantidad de alumnos mayores a 18 años y la cantidad de alumnos que
* miden más de 1.75
*/
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declaramos variables
        int edad, sumaEdad = 0, mayorEdad = 0, MayorEstatura = 0;
        float estatura, sumaEstatura = 0, mediaEdad = 0, mediaEstatura = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Edad alumno "+i+": ");
            edad = input.nextInt();
            System.out.print("Estatura alumno "+i+": ");
            estatura = input.nextFloat();
            
            if (edad >= 18) {//Si es mayor de edad
                mayorEdad++; //Aumentamos en uno el conteo
            }
            
            if (estatura >= 1.75) {//Si mide 1.75 o más
                MayorEstatura++; //Aumenta en 1 el conteo
            }
            
            //Suma iterativa de edad y estatura
            sumaEdad += edad;
            sumaEstatura += estatura;
            
        }
        
        //calcular la media de edad y estatura
        mediaEdad = sumaEdad / 5;
        mediaEstatura = sumaEstatura / 5;
        
        //Comprobar si hay mayores de edad
        if (mayorEdad == 0) {
            System.out.println("No hay alumnos mayores de Edad");
        } else {
            System.out.println(mayorEdad+" alumnos son mayores de edad");
        }
        
        //Comprobar si existen alumnos mayores a 1.75 mts
        if (MayorEstatura == 0) {
            System.out.println("No hay alumnos mayores a 1.75m");
        } else {
            System.out.println(MayorEstatura+" alumnos miden mas de 1.75m");
        }
        
        //Mostrar el calculo de las medias en pantalla
        System.out.println("Le media de edad es: "+mediaEdad);
        System.out.println("Le media de estatura es: "+mediaEstatura);
    }
    
}
