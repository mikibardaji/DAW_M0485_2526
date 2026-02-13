/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appgato;

/**
 *
 * @author mabardaji
 */
public class Gato {
    
    String nombre;
    int edad;

    public Gato() {
    }

    public Gato(String nombre, int edad) throws AgeNotNegativeException, Exception {
        this.setEdad(edad);
        this.setNombre(nombre);
    }

    @Override
    public String toString() {
        return "El gato se llama  " + nombre + " y tiene " + edad + " años";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length()<3)
        {
            if (this.nombre==null)
            {
                this.nombre = "";
            }
            throw new Exception("El nombre debe tener almenos 3 letras");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws AgeNotNegativeException {
        if (edad < 0 )
        {
            
            //throw new Exception("La edad no puede ser negativa");
            throw new AgeNotNegativeException();
        }
        this.edad = edad;
    }
    
    
    
    
}
