/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Aigua extends Pokemon {
    private int corassa;
    public Aigua() {
        super();
        LP =35;
        corassa=3;
    }

    public Aigua(TiposPokemon n) {
        super(n);
        LP=35;
        corassa=3;
    }

    public int getCorassa() {
        return corassa;
    }

    @Override
    public void recibirImpacto(Pokemon p) {
        double valor = p.Atac();
        if (corassa==0) //no tengo corassa
        {
            if (p instanceof Veri)
            {
                valor = valor *0.75;
            }

            LP -= valor;

            if (LP<=0)
            {
                vida =false;
            }
        }
        else
        {
            System.out.println("No recibo ataque por la coraza");
            corassa--;
        }
        MostrarEstadoPokemon();
    }

    
}
