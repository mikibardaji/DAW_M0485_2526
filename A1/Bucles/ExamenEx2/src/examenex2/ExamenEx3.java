/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenex2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExamenEx3 {

    /**
     * Al començar, el programa ha de demanar:

 Introdueix el caràcter per representar el combustible:
Recorda: per llegir un sol caràcter, pots fer servir String i després charAt(0).
Es comença amb 100 litres de combustible.
La barra de combustible plena será 25 vegades el carácter que hagis triat (És 25 perquè és representara el número de combustible dividit entre 4, en  aquest cas 100/4)

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter_deposito;
        final int DEPOSITO_LLENO = 100;
        int litros_deposito, deposito_percentage, litros_viaje;
        System.out.print("Que caracter quieres para mostrar el deposito: ");
        caracter_deposito = sc.next().charAt(0);
        litros_deposito  = DEPOSITO_LLENO;
        
        do
        {
            //Pintar deposito            
            pintaEstadoDeposito(litros_deposito, caracter_deposito);   //A2 substituye lineas 37-42
//             System.out.print("[");
//            //deposito_percentage = litros_deposito/4;
//            for (int i = 1; i <= (litros_deposito/4); i++) {
//                System.out.print(caracter_deposito);
//            }
//            System.out.println("]" + litros_deposito + "L");
            //pedir datos actualitzar litros
            litros_viaje = pedirLitrosViaje(); //A2 sustituye lineas 45-49
//            do
//            {
//            System.out.print("Cuantos litros has gastado en el viaje? ");
//                litros_viaje = sc.nextInt();
//            }while(litros_viaje<0);
            litros_deposito = actualizarDeposito(litros_deposito,litros_viaje);
        }while(litros_deposito>0);
        
        
        System.out.println("Fin de deposito");
        
    }
    
    public static void pintaEstadoDeposito(int litros_deposito, char caracter_deposito)
    {
             System.out.print("[");
            //deposito_percentage = litros_deposito/4;
            for (int i = 1; i <= (litros_deposito/4); i++) {
                System.out.print(caracter_deposito);
            }
            System.out.println("]" + litros_deposito + "L");
        
    }
    
    public static int pedirLitrosViaje()
    {
        Scanner sc = new Scanner(System.in);
        int litros_viaje;
        do
        {
        System.out.print("Cuantos litros has gastado en el viaje? ");
            litros_viaje = sc.nextInt();
        }while(litros_viaje<0);
        return litros_viaje;
    }
    
    public static int actualizarDeposito(int litros_deposito, int litros_viaje)
    {
        return litros_deposito - litros_viaje;
    }
}
