/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaa2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class A2Ex5 {

    /**
     * Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
6.
     */
    public static void main(String[] args) {
//        int millas = preguntarNumero("Pon millas y las transformo a km?");
//        double km = millas_a_kilometros(millas);
//        System.out.println("En km son " + km);
        System.out.println(holaquetal(0));
    }
    
    
    public static boolean holaquetal(int x)
    {
        if (x==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public static double millas_a_kilometros(int millas)
    {
        final double UN_KM = 1.60934;
        return millas*UN_KM;
    }
    
    
    public static int preguntarNumero(String frase){
        Scanner sc = new Scanner(System.in);
        int number;
        
            System.out.print(frase+" ");
            number = sc.nextInt();
        
        //sc.close();
        return number;
    }
}
