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
    protected int salario;

    public EquipoFutbol(int id, String nombre, int edad) 
    {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }
    
    
    public void viajar()
    {
        System.out.println(nombre + 
                " viajo al partido");
    }
            

    public final void concentrarse()
    {
        System.out.println(nombre + " me concentro en el hotel");
    }
}
