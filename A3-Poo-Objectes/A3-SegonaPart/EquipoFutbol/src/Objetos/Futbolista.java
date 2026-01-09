/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Futbolista extends Entrenamiento {
    private int goles; //sol es de futbolista

    public Futbolista(int id, String nombre, int edad,int goles) {
        super(id,nombre,edad);
        this.goles = goles;

    }


    


    public void jugarPartido()
    {
        System.out.println(nombre + " juego partido");
        this.salario += 1000;
    }
}
