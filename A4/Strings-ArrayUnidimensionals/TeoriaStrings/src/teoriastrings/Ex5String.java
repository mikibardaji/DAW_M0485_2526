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
public class Ex5String {

    /**
     * Desenvolupeu un programa que demani a l’usuari el seu nom i l’escrigui amb la primera lletra en majúscules 
     * i la resta en minúscules. Haureu de retallar la primera posició, pasarla a majuscula, i tornarla a "empegar".
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon tu nombre ");
        String frase = sc.nextLine();
        String primeraLetra = frase.substring(0, 1).toUpperCase();
        String restoLetras = frase.substring(1).toLowerCase();
        
        frase = primeraLetra + restoLetras;
        System.out.println(frase);
    }
    
}
