/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Masajista extends EquipoFutbol{
   private String titulacion;

   
   
    public Masajista(String titulacion, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.titulacion = titulacion;
        this.salario = 500;
    }

    public String getTitulacion() {
        return titulacion;
    }
   
   
   
    public void darMasaje()
    {
        System.out.println(nombre + " doy masaje");
    }      

    @Override
    public void viajar() {
        System.out.println("No viajo a ningun partido de fuera");
    }
   
}
