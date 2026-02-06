/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Caja {
    private int premio;
    private boolean abierta;
    private boolean elegida;
    //pot haver-hi més atributs
    //algun altre metode???
    public Caja(int premio) {
        this.premio = premio;
        abierta = false;
        elegida = false;
    }
    
    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
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
