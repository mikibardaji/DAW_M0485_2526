/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objecte;

import java.util.Random;

public class Moneda {

      private int valor;   

    public Moneda() {
        Random rand = new Random();
        this.valor = rand.nextInt(100) + 1; 
        //this.valor = rand.nextInt(1,101);  
    }
    public int getValor() {
        return valor;
    }
    public boolean hasPowerUp() {
        //si el numero de monedes es multiple de 3 te power up
        return (valor % 3 == 0);
        //long mls = System.currentTimeMillis();
        //return (mls % 3 == 0);
    }
}