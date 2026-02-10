/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 * caja para tener premios en metalico
 * @author mabardaji
 */
public class Caja {
    private int premio;
    private boolean abierta;
    private boolean elegida;
    //pot haver-hi més atributs
    //algun altre metode???
    public Caja(int premio)  {
        //this.premio = premio;
        abierta = false;
        elegida = false;
        if (premio>=0)
        {
            this.premio = premio;
        }
        else
        {
            
            this.premio = 0; //que se quede con un valor posible
            //throw new PremiNegativoException(premio);
           //NO LANZO LA EXCEPCION PORQUE SI LA LANZO EL OBJETO 
           //queda aun a null! y por tanto queda incorrecto.
        }
    }
    
    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) throws Exception {
        if (premio>=0)
        {
            this.premio = premio;
        }
        else
        {
            throw new PremiNegativoException(premio);
        }
        
    }

    public boolean isAbierta() {
        return abierta;
    }

    public boolean isCerrada() { //creo este getter
        return abierta==false;
    }
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public boolean isElegida() {
        return elegida;
    }

    //constructors, els que cregueu, potser no cal amb otts els atributs ja que els caixes sempre estan tancades
    public void setElegida(boolean elegida) {
        this.elegida = elegida;
    }

    //getters setters

}
