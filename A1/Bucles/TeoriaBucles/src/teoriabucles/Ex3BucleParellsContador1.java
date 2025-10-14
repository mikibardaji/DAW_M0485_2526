/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

import java.util.Scanner;

/**
 * Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez
utiliza un contador sumando de 1 en 1.
 * @author mabardaji
 */
public class Ex3BucleParellsContador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int contador = 1; 
        System.out.println("Dime un numero");
        contador = src.nextInt();
        while (contador <= 200) {
            if (contador % 2 == 0) { 
                System.out.println("-->"+ contador);
            }
            contador++; 
        }
    }
    
}
