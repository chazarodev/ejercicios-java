/*
    Pedir una fecha al usuario y determinar si es correcta, tomando en cuenta
    como si todos los meses fueran de 30 dias
*/
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mes, anio;
        
        //Pedir digitar fecha al usuario
        System.out.print("Escriba un fecha valida");
        System.out.print("\nDia [1-30]: ");
        dia = input.nextInt();
        System.out.print("Mes [1-12]: ");
        mes = input.nextInt();
        System.out.print("Anio [1900-2099]: ");
        anio = input.nextInt();
        
        if ((anio >= 1900) && (anio <= 2099)) { 
            if ((dia > 0) && (dia <= 30)) { 
                switch(mes) {
                    case 1 -> { 
                        System.out.println(dia+"/Enero/"+anio);
                    }
                    case 2 -> {
                        System.out.println(dia+"/Febrero/"+anio);
                    }
                    case 3 -> {
                        System.out.println(dia+"/Marzo/"+anio);
                    }
                    case 4 -> {
                        System.out.println(dia+"/Abril/"+anio);
                    }
                    case 5 -> {
                        System.out.println(dia+"/Mayo/"+anio);
                    }
                    case 6 -> {
                        System.out.println(dia+"/Junio/"+anio);
                    }
                    case 7 -> {
                        System.out.println(dia+"/Julio/"+anio);
                    }
                    case 8 -> {
                        System.out.println(dia+"/Agosto/"+anio);
                    }
                    case 9 -> {
                        System.out.println(dia+"/Septiembre/"+anio);
                    }
                    case 10 -> {
                        System.out.println(dia+"/Octubre/"+anio);
                    }
                    case 11 -> {
                        System.out.println(dia+"/Noviembre/"+anio);
                    }
                    case 12 -> {
                        System.out.println(dia+"/Diciembre/"+anio);
                    }
                    default -> System.out.println("Mes no existe");
                }
            } else {
                System.out.println("Dia no valido");
            }
        } else {
            System.out.println("Anio no es valido");
        }
    }
}
