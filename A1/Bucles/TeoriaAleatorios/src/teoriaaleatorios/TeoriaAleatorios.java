/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaaleatorios;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class TeoriaAleatorios {

    /**
     * Maneras de generar valores aleatorios
     */
    public static void main(String[] args) {
        //exemple 1 generar aleatoris del 1 al 10
        Random rd = new Random();
        int aleatorio;
        for (int i = 0; i < 10; i++) {
            aleatorio = rd.nextInt(1,11);
             System.out.println(aleatorio);
        }
        

        //exemple 2 generar 10 aleatoris del 15 al 35
        for (int i = 0; i < 10; i++) {
            aleatorio = rd.nextInt(15, 36);
            System.out.println(aleatorio);
        }
        
        System.out.println("//exemple3 generar 10 aleatorios del -10 al 0 (incluido)");
        //exemple3 generar 10 aleatorios del -10 al 0 (incluido)
        for (int i = 0; i < 10; i++) {
            aleatorio = rd.nextInt(-10, 1);
            System.out.println(aleatorio);
        }        
        
        System.out.println("generar 15 aleatorios con decimlaes del 1 al 10");
        double aleatori_double;
        //exemple4 generar 15 aleatorios con decimlaes del 1 al 10
        for (int i = 0; i < 15; i++) {
            aleatori_double = rd.nextDouble(1, 10);
            System.out.println(aleatori_double);            
        }
    }
    
}
