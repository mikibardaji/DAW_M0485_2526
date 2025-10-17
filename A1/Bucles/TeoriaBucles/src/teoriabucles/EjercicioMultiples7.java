/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class EjercicioMultiples7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("por que numero empiezo");
        int num = sc.nextInt();
        int contador_multiples=0;
        do{
           if(num%7==0)
           {
               System.out.println(num);
               contador_multiples++; //es el que cuenta 
               //y el que tiene que decir cuando se para
           }
            num++;
        }while(contador_multiples<10);
        
        System.out.println("final");
        
    }
    
}
