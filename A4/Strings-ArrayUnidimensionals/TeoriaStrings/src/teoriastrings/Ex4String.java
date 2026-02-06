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
public class Ex4String {

    /**
     * Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0

     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Pon una frase ");
        String frase = sc.nextLine().toLowerCase();
        frase = frase.toLowerCase();
        int n_a=0, n_e = 0, n_i = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)=='a') // frase[i]
            {
                n_a++;
            }
            else if (frase.charAt(i)=='e')
            {
                n_e++;
            }
            else if(frase.charAt(i)=='i')
                    {
                        n_i++;
                    }
                
        }
        System.out.println("A's : " + n_a);
        System.out.println("E's : " + n_e);
        System.out.println("I's : " + n_i);
    }
    
}
