/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriastrings;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2String {

    /**
     * Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
además de si son iguales sin diferenciar entre mayúsculas y minúsculas.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una frase");
        String frase = sc.nextLine();
        System.out.println("Pon una SEGUNDA frase");
        String frase2 = sc.nextLine();
        
        if (frase.equals(frase2))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son diferentes");
        }
        
        
        if (frase.equalsIgnoreCase(frase2))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son diferentes");
        }        
        
    }
    
}
