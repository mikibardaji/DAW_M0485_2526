/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriastrings;

import java.util.Scanner;

/**
 * Fes un programa que escriguis un string i una lletra, 
 * i et digui totes les posicions on es troba aquesta lletra
 * @author mabardaji
 */
public class Ex6String {
    
    public static void main(String[] args) {
    
        //Metodes charAt, ToLowerCase, equals, equalsIgnoreCase, 
        // substring, replaceAll, split
        solucionIndexOf();
       // solucionForCharaT();
         
    }

    private static void solucionForCharaT() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String frase = sc.nextLine();

        System.out.println("Que letra quieres buscar?");
        char letra = sc.next().charAt(0);
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra)
            {
                System.out.println("La letra " + letra + " se encuentra en la posición " + i);
            }
        }
    }

    private static void solucionIndexOf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String frase = sc.nextLine();

        System.out.println("Que letra quieres buscar?");
        char letra = sc.next().charAt(0);
        
        int posicio = frase.indexOf(letra); //-1 y si no me da la posición
        
        if (posicio == -1)
        {
            System.out.println("No esta la letra " + letra);
        }
        while (posicio != -1)
        {
           System.out.println("La letra " + letra + " se encuentra en la posición " + posicio); 
           posicio = frase.indexOf(letra,(posicio+1));
        }
        
        
        
        
    }
}
