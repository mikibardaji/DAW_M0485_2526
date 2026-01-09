/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public abstract class EquipoFutbol implements Persona{ //extends Object
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

    public void setEdad(int edad) {
        if (edad>=16)
        {
            this.edad = edad;
        }
        else
        {
            System.out.println("Edad no permitida");
        }
    }
    
    
    /*public abstract viajar();
    public abstract concentrarse();*/
    public void viajar()
    {
        System.out.println(nombre + 
                " viajo al partido");
    }
            

    public final void concentrarse() /*codigo comun para todas las clases hijas*/
    {
        System.out.println(nombre + " me concentro en el hotel");
    }

    @Override  //object
    public boolean equals(Object obj) {
        if (obj == null)
        {
            return false; //no es igual
        }
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof EquipoFutbol))
        {
            return false;
        }
        //los campos importantes para saber si son iguale
        EquipoFutbol other = (EquipoFutbol) obj;
        //this i el other los dos son equipoFtubol
        // el campo es el id
        if (!this.nombre.equals(other.nombre)
                || (this.id != other.id))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public void saludar()
    {
        System.out.println("Hola soy " + nombre);
        
    }    
    
    
    
    
}
