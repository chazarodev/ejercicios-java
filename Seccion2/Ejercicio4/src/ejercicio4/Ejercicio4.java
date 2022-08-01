/*Una compania de venta de carros usados, paga a su personal de ventas 
    un salario de $1000 dólares mensuales, más una comisión de $150 dólares
    por cada carro vendido, más el 5% del valor de la venta por carro.
    Cada mes el capturista de la empresa ingresa en la computadora los datos
    pertinentes. Hacer un programa que calcule e imprima el salario mensual
    de un vendedor
*/ 
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declarar las variables
        final int salarioMensual = 1000, comision = 150; 
        int carrosVendidos, totalComision;
        float comisionPorcentaje = 0.05f, totalPrecio, totalPorcentaje, salarioTotal;
        String vendedor;
        
        //Insertar el nombre del vendedor
        System.out.print("Vendedor: ");
        vendedor = input.nextLine();
        
        //Insertar la cantidad de carros vendidos
        System.out.print("Cantidad de carros vendidos en el mes: ");
        carrosVendidos = input.nextInt();
        
        //Insertar el precio total de los carros vendidos
        System.out.print("Precio total de los carros vendidos: $");
        totalPrecio = input.nextFloat();
        
        //Calcular total de comisiones y salarioTotal
        totalComision = carrosVendidos * comision;
        totalPorcentaje = totalPrecio * comisionPorcentaje;
        salarioTotal = salarioMensual + totalComision + totalPorcentaje;
        
        //Mostrar desgloce y total del salario mensual del vendedor
        System.out.println("\nSalario mensual: $"+salarioMensual);
        System.out.println("-----------------");
        System.out.println("Comision por carro vendido: $"+comision);
        System.out.println("Carros vendidos en el mes: $"+carrosVendidos);
        System.out.println("-----------------");
        System.out.println("Total comisiones: $"+totalComision);
        System.out.println("Total Comision al 5%: $"+totalPorcentaje);
        System.out.println("-----------------");
        System.out.println("Salario total neto: $"+salarioTotal);
    }
    
}
