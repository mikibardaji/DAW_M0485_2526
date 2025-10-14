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
public class ContadorNegativosPositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor_aleatorio;
        Random rd = new Random();
        int positivos=0, negativos=0; //
        int contador; //cuente la cantidad de numeros generados
        for(contador=1;contador<=10;contador++) //genera 10 vueltas para hacer 10 aleatorios
        {
            valor_aleatorio = rd.nextInt(-3, 11);
            System.out.println("->" + valor_aleatorio);
            if (valor_aleatorio<0)
            {
                ++negativos;
            }
            else if(valor_aleatorio>0)
            {
                positivos++;
            }
        }
       
        System.out.println("negativos: " + negativos + " positivos: " + positivos);
    }
    
}
