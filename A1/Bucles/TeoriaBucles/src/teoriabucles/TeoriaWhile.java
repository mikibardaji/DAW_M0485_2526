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
public class TeoriaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Que diga hola el numero de veces que diga el usuario
        Scanner sc = new Scanner(System.in);
        int veces;
        System.out.print("Cuantas veces quieres que te salude...");
        veces = sc.nextInt();
        int contador=1;
        while (contador<=veces)
        {
            System.out.println("Hola " + contador);
            contador = contador +1;
            System.out.println("-> " + contador);
            //++contador
            //contador += 1;
            //contador++
        }
        System.out.println("===== bucle contador empezando a 0 ======");
        contador=0;
        while (contador<veces)
        {
            System.out.println("Hola " + contador);
            contador = contador +1;
            System.out.println("-> " + contador);
            //++contador
            //contador += 1;
            //contador++
        }
        
        
    }
    
}
