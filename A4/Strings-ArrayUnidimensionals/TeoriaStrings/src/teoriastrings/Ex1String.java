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
public class Ex1String {

    /**
     * @param args the command line arguments
     * Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
        de la cadena en una línea distinta.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una frase");
        String frase = sc.nextLine();
        
        String[] palabras = frase.split(" ");
        for (String word : palabras) {
            System.out.println(word);
        }
    }
    
}
