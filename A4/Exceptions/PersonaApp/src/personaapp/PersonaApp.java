/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personaapp;

import Objetos.InvalidDNIException;
import Objetos.Persona;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class PersonaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Persona p1 = new Persona("Isabel", "43720209S");
            System.out.println(p1);

            p1.setDni("12345678H");
            System.out.println("DNI canviat correctament.");

        } catch (InvalidDNIException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            Persona p2 = new Persona("PEPE", "123");
        } catch (InvalidDNIException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
    }
    
}
