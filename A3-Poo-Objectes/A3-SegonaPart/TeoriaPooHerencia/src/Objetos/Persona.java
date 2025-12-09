/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Persona {
    private String nombre;
    private String DNI;
    protected int edat; //normalment clase superior es posa tots els atributscom protected enlloc private

    public Persona(String name, String ID, int age)
    {
        nombre = name;
        DNI = ID;
        edat = age;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public double getEdat() {
        return edat;
    }
    
    /*
    mostrar por pantalla todos los atributos de la clase
    */
    public void mostrarCaracteristicas()
    {
        System.out.println("Nombre " + this.nombre + " DNI: " + this.DNI + " telefono: " + this.edat);
    }
    
    public void saludar()
    {
        System.out.println("Hola");
    }
    
    public final void adios()
    {
        System.out.println("Adios hasta otra");
    }
}
