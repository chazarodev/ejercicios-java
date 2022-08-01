/*
    Realizar el 20% de descuento en las compras mayores a $300,
    Calcular la cantidad a pagar
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float descuento = 0.2f;
        float totalCompra, totalDescuento, totalPagar;
        
        //Solicitar el monto a pagar
        System.out.print("Total de la compra: $");
        totalCompra = input.nextFloat();
        
        //Determinar si la compras es mayor a $300
        if (totalCompra > 300) {
            totalDescuento = totalCompra * descuento;
            totalPagar = totalCompra - totalDescuento;
            System.out.println("\nMonto de la compra: $"+totalCompra);
            System.out.println("Decuento aplicado del 20%: $"+totalDescuento);
            System.out.println("Total a pagar: $"+totalPagar);
            return;
        }
        
        totalPagar = totalCompra;
        System.out.println("\nTotal a pagar: $"+totalPagar);
                
    }
    
}
