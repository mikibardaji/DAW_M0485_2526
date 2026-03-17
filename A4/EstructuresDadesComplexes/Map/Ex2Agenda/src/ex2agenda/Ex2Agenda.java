/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2agenda;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author alumne
 */
public class Ex2Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Map<String, Integer> agenda = new TreeMap<>();
         
       agenda.put("Zaira", 666666666);
       agenda.put("Albert", 666666667);
       agenda.put("Berta", 666666668);
      
       Set<String> claves = agenda.keySet();
        for (String clau : claves) {
            Integer telefono = agenda.get(clau);
            System.out.println("("+clau+") - (" + telefono +")");
        }  
        
        agenda.put("Albert", 666666669);
        for (String clau : claves) {
            Integer telefono = agenda.get(clau);
            System.out.println("("+clau+") - (" + telefono +")");
        }  
        
    }
    
}
