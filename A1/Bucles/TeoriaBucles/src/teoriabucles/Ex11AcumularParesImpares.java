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
public class Ex11AcumularParesImpares {

    /**
     * Generar 10 numeros aleatorios entre 100 y 200
     * y que cuente cuanto suman los pares
     * y cuanto suman los impares
     */
    public static void main(String[] args) {
        Random rd = new Random();
        int valor_aleatorio;
        int acum_pares=0, acum_impares=0; //
        for (int i = 1; i <= 4; i++) {
            valor_aleatorio = rd.nextInt(100, 201);
            System.out.println("->" + valor_aleatorio);
            if (valor_aleatorio%2 == 0)
            {
                acum_pares = acum_pares + valor_aleatorio;
            }
            else
            {
                acum_impares = acum_impares + valor_aleatorio;
            }
        }

            System.out.println("pares -> " + acum_pares);
            System.out.println("impares -> " + acum_impares);        
    }
    
}
