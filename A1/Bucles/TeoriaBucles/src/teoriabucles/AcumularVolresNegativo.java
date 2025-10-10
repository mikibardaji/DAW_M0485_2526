/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class AcumularVolresNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // acumular valores hasta que escribas .1
        Scanner sc = new Scanner(System.in);
        int valor=3;
        int acumulado_suma=0;
        boolean salir = false;
        do{
            System.out.print("pon un valor(con -1 termino... ");
            valor = sc.nextInt();
            System.out.println("valor " + valor);
            if (valor!=-1)
            {
                acumulado_suma = acumulado_suma + valor;
                System.out.println("Acumulado-> " + acumulado_suma);
            }
            if (valor ==-1)
            {
                salir = true;
            }
        }while(salir==false);
        
        System.out.println("Total suma" + acumulado_suma);

        
    }
    
}
