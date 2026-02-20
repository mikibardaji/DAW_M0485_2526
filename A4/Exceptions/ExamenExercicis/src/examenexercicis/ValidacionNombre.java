/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenexercicis;

/**
 *
 * @author mabardaji
 */
public class ValidacionNombre {
    
    public static void main(String[] args) {
        String nom= "   jOAn    garCía loPEz   ";
        
        nom = nom.trim();
        System.out.println(nom);
        nom = nom.replaceAll("\\s+", " ");
        System.out.println(nom);
        nom = nom.toLowerCase();
        System.out.println(nom);
        nom = nom.substring(0, 1).toUpperCase() + nom.substring(1);
        System.out.println(nom.length());
        System.out.println(nom);
        System.out.println(nom.charAt(0));
        System.out.println(nom.charAt(nom.length()-1));
        String[] noms = nom.split(" ");
        for (String nom1 : noms) {
            System.out.println(nom1);
        }
        
    }
            
}
