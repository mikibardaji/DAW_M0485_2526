/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public final class Veri extends Pokemon {
    public boolean defensa;

    public Veri() {
        super();
        LP = 50;
        defensa = false;
    }

    public Veri(TiposPokemon n) {
        super(n);
        LP = 50;
        defensa = false;
    }

    @Override
    public void recibirImpacto(Pokemon p) {
        double valor = p.Atac();
        
        if (p instanceof Electric)
        {
            valor = valor *0.75;
        }
        if (defensa)
        {
            valor = valor*0.5; //defensa activada
        }
        LP -= valor;
        
        if (LP<=15)
        {
            defensa = true;
        }
        if (LP<=0)
        {
            vida =false;
        }
        MostrarEstadoPokemon();
    }

    
}
