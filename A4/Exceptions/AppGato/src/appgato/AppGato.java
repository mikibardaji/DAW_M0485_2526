/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appgato;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class AppGato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       Gato cat = new Gato();
       
        try {
            cat.setEdad(-1);
            cat.setNombre("HOLA");
            cat.setNombre("Co");
        } catch(AgeNotNegativeException ex)
        { //lo pongo antes, para que no me entre en el catch (Exception ex)
            System.out.println("Error informando edad");
            System.out.println(ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            System.out.println("gato " + cat); //toString
        }
        
        
        
        try {
            Gato gat = new Gato("TO", 10);
        } catch (Exception ex) {
             System.out.println("Error Constructor " + ex.getMessage());
            //System.out.println("gat  " + gat); //toString
        }
        
    }
    
}
