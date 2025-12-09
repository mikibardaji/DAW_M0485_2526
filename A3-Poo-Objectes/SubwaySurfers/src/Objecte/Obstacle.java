/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objecte;

import java.util.Random;

public class Obstacle {
    private String tipo;
    private int dificultad;

    private static final int minBarrera = 1;
    private static final int maxBarrera = 5;
    private static final int minTren = 5;
    private static final int maxTren = 10;

    
    //es private perque el crida desde la mateixa classe
    
    //pero desde altres classes no podre crear un objecte passant-li aquest atributs
    private Obstacle(String tipo, int dificultad) {
        this.tipo = tipo;
        this.dificultad = dificultad;
    }

    public Obstacle(String tipo) {
        Random rand = new Random();

        this.tipo = tipo;
        if (tipo.equals("barrera")) {
            dificultad = rand.nextInt(minBarrera, maxBarrera+1);
        } else {
            dificultad = rand.nextInt(minTren, maxTren + 1) ;
        }
    }

    public int getDificultat() {
        return dificultad;
    }

    public String getTipo() {
        return tipo;
    }

//    public void interactuar(Jugador jugador) {
//        if (jugador != null) {
//            jugador.actualitzarDistancia(this.getDificultat());
//        }
//    }

    public static Obstacle obstaculomaximo() {
        return new Obstacle("tren", maxTren);
    }
    
    public void setDificultat(int dificultad) {
        this.dificultad = dificultad;
    }
}
 