/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public final class Electric extends Pokemon{ //final no permetra classes derivades
    protected int superAtac;
    
    public Electric() {
        super();
        LP =40;  
        superAtac=2;
    }

    public Electric(TiposPokemon n) {
        super(n);
        superAtac=2;
        LP=40;
    }

    @Override
    public int Atac() {
        int ataque = super.Atac(); 
        ataque += superAtac;
        superAtac++;
        return ataque;
    }

    @Override
    public void recibirImpacto(Pokemon p) {
        double valor = p.Atac();
        
        if (p instanceof Aigua)
        {
            valor = valor *0.75;
        }
        
        LP -= valor;
        
        if (LP<=0)
        {
            vida =false;
        }
        MostrarEstadoPokemon();
    }

    
}
