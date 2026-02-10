/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class PremiNegativoException extends Exception{
    
    int premio;

    public PremiNegativoException(int premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Se ha puesto un premio negativo -> " + premio;
    }
    
    
    
}
