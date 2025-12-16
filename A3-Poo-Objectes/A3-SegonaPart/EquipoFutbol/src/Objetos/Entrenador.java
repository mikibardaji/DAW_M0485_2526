/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Entrenador extends Entrenamiento {
    
    private boolean tieneTitulo;

    public Entrenador(boolean tieneTitulo, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.tieneTitulo = tieneTitulo;
    }

    public boolean isTieneTitulo() {
        return tieneTitulo;
    }
    
    //constructor con titulo a cierto por defecto
    public Entrenador(int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.tieneTitulo = true;
    }
    
    
    public void dirigirPartido()
    {
        System.out.println(nombre + " dirijo el partido");
    }    
}
