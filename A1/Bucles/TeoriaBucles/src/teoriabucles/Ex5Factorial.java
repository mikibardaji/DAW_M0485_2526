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
public class Ex5Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que factorial quieres saber? ");
        int numero = sc.nextInt();
        int factorial_acum=1;
 
        for (int i = 1; i <= numero; i++) { //asi obtendre el 1,2,3,4,5
            System.out.print(i + "X" + factorial_acum );
            factorial_acum = factorial_acum * i;
            System.out.println("="+  factorial_acum);
        }
        
        System.out.println("Factorial -> " + factorial_acum);
    }
    
}
