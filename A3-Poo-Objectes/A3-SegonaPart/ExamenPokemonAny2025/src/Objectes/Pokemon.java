/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public abstract class Pokemon implements AccionesCombate { //abstract impide crear objetos pokemon new Pokemon...
    protected final TiposPokemon nom; //inicialmen es error perque no l'hem inicialitzat
    protected double LP;
    protected boolean vida;

    public Pokemon()
    {
        nom = TiposPokemon.BADGYAL;
        vida = true;
    }
    
    public Pokemon(TiposPokemon n)
    {
        nom = n;
        vida = true;
    }
    
    
    
    
    public TiposPokemon getNom() {
        return nom;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Pokemon))
        {
            return false;
        }

        final Pokemon other = (Pokemon) obj;
        return this.nom.equals(nom) ;
    }

    public double getLP() {
        return LP;
    }

    public boolean isVida() {
        if (LP<=0)
        {
            vida = false;
        }
        return vida;
    }

    @Override
    public int Atac()
    {
        Random rd = new Random();
        int ataque = rd.nextInt(11);
        System.out.println(nom + " ataca amb força " + ataque);
        return ataque;
    }

    protected void MostrarEstadoPokemon()
    {
        System.out.print(nom + " " + LP + " LP ");
        if (vida) //==true
        {
            System.out.print("viu ");
        }
        else
        {
            System.out.print("mort ");
        }
        for (int i = 1; i < LP; i++) {
            System.out.print("=");
        }
        System.out.println("");
        
            
    }

    @Override
    public String toString() {
        return nom + " con vida " + LP;
    }
    
    
    
}
