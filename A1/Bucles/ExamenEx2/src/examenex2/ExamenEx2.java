/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenex2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExamenEx2 {

    /**
     * Fes un programa que demani a l’usuari dos números enters: el mínim i el màxim.
El programa ha de calcular:
Quants números hi ha dins l’interval (inclosos el mínim i el màxim).
La suma de tots els números dins d’aquest interval (també incloent el mínim i el màxim).

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minim, maxim, suma_acum=0, cont_voltes=0;
        System.out.println("Quin es el minim");
        minim = sc.nextInt();
        System.out.println("Quin es el maxim");
        maxim = sc.nextInt();
        
        for (int i = minim; i <=maxim; i++) {
            suma_acum = suma_acum + i;
            cont_voltes++;
        }
        
        System.out.println("El nnumeros entre "+ minim + " i " + maxim + ": " + cont_voltes);
        System.out.println("La suma es " + suma_acum);
        
        
    }
    
}
