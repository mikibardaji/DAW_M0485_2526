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
public class A2Ex4 {

    /**
     * Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
5.
     */
    public static void main(String[] args) {
        int num = preguntarNumero("Pon un numero y te dire que es ");
        int signo = dimeSigno(num);
        mostrarResultadoSigno(signo);
    }
    
    
    public static void mostrarResultadoSigno(int s)
    {
        if (s == -1) {
            System.out.println("El numero es negativo.");
        } else if (s == 0) {
            System.out.println("El numero es cero.");
        } else {
            System.out.println("El numero es positivo.");
        }
    }
    
    public static int dimeSigno(int a) 
        {
            int signo;
               if (a < 0) {
                signo= -1;
            } else if (a == 0) {
                signo = 0;
            } else {
                signo = 1;
            }
           return signo;
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
