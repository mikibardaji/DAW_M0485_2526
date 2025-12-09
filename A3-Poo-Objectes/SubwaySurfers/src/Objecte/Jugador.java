/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objecte;

/**
 *
 * @author mabardaji
 */
public class Jugador {

    private String nom;
    private int puntuacio;
    private int distancia;
    private int energia;
    private boolean powerUp;
    private final int DISTANCIA_CORRER = 2;
    private final int AUMENTO_POWER_UP = 3;
    
    public Jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.distancia = 0;
        this.energia = 50;
        this.powerUp = false;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isPowerUp() {
        return powerUp;
    }

    public void correr() {
        int inc = powerUp ? DISTANCIA_CORRER*AUMENTO_POWER_UP : DISTANCIA_CORRER;
        //actualitzem distancia
        distancia += inc;

        System.out.print("Corrent: ");
        for (int i = 0; i < inc; i++) 
            System.out.print("- ");
        System.out.println(distancia + " metres");
    }

    public void recollirMoneda(Moneda m) {
        puntuacio += m.getValor();
        System.out.println("Moneda recollida: +" + m.getValor());

        if (m.hasPowerUp()) {
            powerUp = true;
            System.out.println("Power-Up aconseguit!");
        }
    }

    public void xocar(Obstacle ob) {
        energia -= ob.getDificultat();
        if (energia < 0) energia = 0;

        powerUp = false;

        System.out.println("Xoc amb " + ob.getTipo() +
                           " dificultat " + ob.getDificultat());
    }
}
