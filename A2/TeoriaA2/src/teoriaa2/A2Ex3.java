/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaa2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class A2Ex3 {

    /**
     * Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b
     */
    public static void main(String[] args) {
        int num1, num2;
        //String f = "Pon el primer numero";
        num1 = preguntarNumero("Pon el primer numero");
        num2 = preguntarNumero("Pon el segundo numero");
        
        int pequenyo = minimo(num1, num2);
        System.out.println("El mas pequeño es " + pequenyo);
    }
    
    /**
     * devuelve el numero mas pequeño
     * @param a numero primero
     * @param b numero segundo
     * @return 
     */
    public static int minimo(int a, int b) {
        int minimo;
        if (a < b) {
            minimo = a;
        } else {
            minimo = b;
        }
        return minimo;
    }
    
    public static int preguntarNumero(String frase){
        Scanner sc = new Scanner(System.in);
        int number;
        
            System.out.print(frase);
            number = sc.nextInt();
        
        //sc.close();
        return number;
    }
}
