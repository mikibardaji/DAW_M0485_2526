/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public abstract class Entrenamiento extends EquipoFutbol{

    public Entrenamiento(int id, String nombre, int edad) {
        super(id, nombre, edad);
        salario=1500; //futbolista i entrenador
    }
    
    //public abstract void entrenar();
}
