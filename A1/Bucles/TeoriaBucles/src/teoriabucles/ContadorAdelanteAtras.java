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
public class ContadorAdelanteAtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int veces;
        System.out.print("Contare del 1 hasta el numero que me indiques...");
        veces = sc.nextInt();
        int contador = 0;
        while (contador<veces)
        {
            contador += 1;
            System.out.println(contador);
        }

        contador = 1;
        while (contador<=veces)
        {
            System.out.println(contador);
            contador += 1;
        }
        
        
    }
    
}
