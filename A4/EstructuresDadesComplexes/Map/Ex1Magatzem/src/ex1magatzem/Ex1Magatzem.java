/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1magatzem;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author alumne
 */
public class Ex1Magatzem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Map<String, String> magatzem = new LinkedHashMap<>();
       
       magatzem.put("P01", "Monitor");
       magatzem.put("P02", "Teclat");
       magatzem.put("P03", "Ratoli");
       
       Set<String> claves = magatzem.keySet();
        for (String clau : claves) {
            String producto = magatzem.get(clau);
            System.out.println("("+clau+") - (" + producto +")");
        }  
        
        String claveExistente = "P06";
        //if (magatzem.get(claveExistente)!=null)
        if (magatzem.containsKey(claveExistente))
        {
            System.out.println("Existe el producto con clave " + claveExistente );
        }
        else
        {
            System.out.println("No existe el producto " + claveExistente);
        }
    }
    
}
