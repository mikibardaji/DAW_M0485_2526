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
public class Ex3Bucle1alN {

    /**
     * Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá
por teclado.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int num_inicio = 1;
        System.out.println("pone un numero");
        numero = sc.nextInt();
        while (num_inicio<=numero) {
            System.out.println(num_inicio);
            num_inicio++;
        }
    }
    
}
