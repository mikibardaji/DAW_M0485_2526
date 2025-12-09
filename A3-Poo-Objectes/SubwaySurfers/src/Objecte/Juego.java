/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objecte;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Juego {
    
    private Jugador jugador;
    private String nivel;

    public Juego(String nom, String nivell) {
    
       if (nivell.equals("facil") || nivell.equals("dificil"))
       {
        this.nivel = nivell;
       } 
       else
       {
       this.nivel = "facil";
       } 
       
       this.jugador = new Jugador(nom);
       
       
        
    }
    
    
public void jugar() {

        System.out.println("----- COMENÇA EL JOC -----");
        System.out.println("Jugador: " + jugador.getNom());
        System.out.println("Nivell: " + nivel);
        System.out.println("---------------------------");
        Random rd = new Random();
        Obstacle ob;
        while (jugador.getEnergia() > 0) {

            jugador.correr();

            int dificultat = rd.nextInt(1, 3);
            if (dificultat==1)
            {
                ob = new Obstacle("barrera");
            }
            else
            {
                ob = new Obstacle("tren");
            }
            jugador.xocar(ob);
            //ob.interactuar(jugador);
            Moneda coin = new Moneda();
            jugador.recollirMoneda(coin);
           
            System.out.println("Distància: " + jugador.getDistancia() +
                               " | Energia: " + jugador.getEnergia() +
                               " | Punts: " + jugador.getPuntuacio());
            System.out.println("---------------------------------------");
            if (coin.hasPowerUp()) {
                System.out.println("Power-Up ACTIVAT: corres el triple!");
            } else {
                System.out.println("Power-Up DESACTIVAT");
            }            
        }

    
        System.out.println("===== FI DE LA PARTIDA =====");
        System.out.println("Metres recorreguts: " + jugador.getDistancia());
        System.out.println("Monedes aconseguides: " + jugador.getPuntuacio());
    }
    
    
    
    
    
    
  
    
}
