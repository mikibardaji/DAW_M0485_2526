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
public class AcumularValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pedir valores hasta que escribas 0
        Scanner sc = new Scanner(System.in);
        int valor=3;
        int acumulado_suma=0;
        do{
            System.out.print("pon un valor(con 0 termino... ");
            valor = sc.nextInt();
            System.out.println("valor " + valor);
            acumulado_suma = acumulado_suma + valor;
            System.out.println("Acumulado-> " + acumulado_suma);
        }while(valor!=0);
        
        System.out.println("Total suma" + acumulado_suma);
        /*valor=3;
        while(valor!=0)
        {
            System.out.print("pon un valor(con 0 termino... ");
            valor = sc.nextInt(); 
        }*/
        
        
        
        //termino cuano valor ==0 
        
    }
    
}
