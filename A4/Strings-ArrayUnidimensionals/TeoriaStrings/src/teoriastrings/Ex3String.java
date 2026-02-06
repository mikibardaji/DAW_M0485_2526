/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriastrings;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3String {

    /**
     * Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon tu nombre ");
        String nom = sc.nextLine();
        System.out.print("Pon tu apellido");
        String cognom = sc.nextLine().toUpperCase();
        System.out.print("Pon tu segundo apellido");
        String cognom2 = sc.nextLine();
        String codi;
        if (nom.length()<3)
        {
            codi = nom.toUpperCase();
        }
        else
        {
            codi = nom.substring(0,3).toUpperCase() ;
        }
        
        if (cognom.length()<3)
        {
            codi = codi + cognom.toUpperCase();
        }
        else
        {
            codi = codi + cognom.substring(0,3).toUpperCase() ;
        }
        
         if (cognom2.length()<3)
        {
            codi = codi + cognom2.toUpperCase();
        }
        else
        {
            codi = codi + cognom2.substring(0,3).toUpperCase() ;
        }
        //String codi = nom.substring(0,3).toUpperCase() 
         //       + cognom.substring(0, 3).toUpperCase() 
         //       + cognom2.substring(0, 3).toUpperCase();
        
        System.out.println(codi.toUpperCase());
        // TODO code application logic here
    }
    
}
