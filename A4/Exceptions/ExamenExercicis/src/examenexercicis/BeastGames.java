/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenexercicis;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class BeastGames {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos jugadores hay");
        int jugadores = sc.nextInt();
        
        int[] dineroJugadores = new int[jugadores];
        dineroJugadores[0] = 1000000;
        int dineroQuedaJugador;
        for (int i = 0; i < dineroJugadores.length; i++) {
            
            if (dineroJugadores[i]>0)
            {
                do{
                System.out.println("Cuanto dinero quieres de " + dineroJugadores[i] 
                        + " jugador " + (i+1) + "?" );
                dineroQuedaJugador = sc.nextInt();
                }while(dineroQuedaJugador<0 || dineroQuedaJugador>dineroJugadores[i]);

                if (i< (dineroJugadores.length-1)) //no estoy en la ultima posicion
                {
                    dineroJugadores[i+1] = dineroJugadores[i] -  dineroQuedaJugador;
                }
                
                dineroJugadores[i] = dineroQuedaJugador; 
            }
            
            
        }
        
        
        for (int i = 0; i < dineroJugadores.length; i++) 
        {
            System.out.println("El jugador " + (i+1) 
                    + " tiene " + dineroJugadores[i] + "€");
        }
        
        
        
    }
}
