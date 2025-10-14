/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Ex6DetectarNegatiu {

    /**
     * Generar 4 aelatoris entre 5 y -5 i detectar si se'n ha fet algun de negatiu
     */
    public static void main(String[] args) 
    {
        Random rd = new Random();
        int valor_aleatori;
        boolean negativo=false; //chivato
        for (int contador = 0; contador < 4; contador++) 
        {
            valor_aleatori = rd.nextInt(-5, 6);
            System.out.println("-> " + valor_aleatori);
            if (valor_aleatori<0 && negativo==false) //dos condiciones
            //if (valor_aleatori<0) 
            {
                negativo=true; //detectado numero negativo
            }
        }
        
        if (negativo==true)
        {
            System.out.println("Alguno era negativo");
        }
        else
        {
            System.out.println("Todos no eran negativos");
        }
    }
    
}
