/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public abstract class EquipoFutbol {
    protected int id; //protected , es private excepto hijas
    protected String nombre;
    protected int edad; 
    
    
    public abstract void viajar(); //cada uno clases derivadas se codifica 
    public abstract void concentrarse();
}
