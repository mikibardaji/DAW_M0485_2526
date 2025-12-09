/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public final class Profesor extends Persona{ //el atribut final impedeix classes filles o derivades de Professor
    
    private double cod_prof;
    private String departamento;
    private String modulos;

    public Profesor(String name, String ID, int phone,double cod_prof, String departamento, String modulos) {
        super(name, ID, phone); //crida a la clase superior OBLIGATORI A PRIMERA LINEA
        this.cod_prof = cod_prof;
        this.departamento = departamento;
        this.modulos = modulos;
    }

    public double getCod_prof() {
        return cod_prof;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getModulos() {
        return modulos;
    }

    public void setCod_prof(double cod_prof) {
        this.cod_prof = cod_prof;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setModulos(String modulos) {
        this.modulos = modulos;
    }

    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas(); 
        System.out.println("modulos que imparte: " + this.modulos);
    }
    
    @Override
    public void saludar()
    {
        super.saludar(); //al saludar de persona (que escribe hola) 
        System.out.println("Hi");
    }
    
    
}
