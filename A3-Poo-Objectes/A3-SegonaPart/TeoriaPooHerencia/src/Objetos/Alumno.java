/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Alumno extends Persona{
    private double n_exp;
    private String ciclo;
    private double nota;

    public Alumno(String name, String ID, int phone, double expediente) {
        super(name, ID, phone); //llamada al constructor de la clase SUPERior Persona(name, ID, phone)
        n_exp = expediente;
    }

    public double getN_exp() {
        return n_exp;
    }

    public String getCiclo() {
        return ciclo;
    }

    public double getNota() {
        return nota;
    }

    public void setN_exp(double n_exp) {
        this.n_exp = n_exp;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public void mostrarCaracteristicas() {
        //Override es sobreescribir un metode de la clase superior
        super.mostrarCaracteristicas();  //llama a mostrarCaracteristicas de la clase superior
        System.out.println(" Alumno Expediente" + n_exp + " ciclo" + ciclo + " nota" + nota);
    }
    
    public void saludar()
    {
        System.out.println("Bro!");
    }
    
    /* no se puede sobreeescribir porque es del tipo final
    public void adios()
    {
        
    }*/
    
    
    /* si tiene mas de 18 años se matricula en GS, sino en GM*/
    public void matricularse()
    {
        if (this.edat>=18) //com es protected puc referenciarlo
        {
            this.ciclo = "DAW-GS";
            //this.edat =25;
        }
        else
        {
            this.ciclo = "SMX-GM";
        }
        
    }
    
}
