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
public class ExTarjeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int PIN_TARJETA = 1221;
        int pin_usuario;
        int intentos=3, intentos_positivo=0;
        Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("Pon tu pin de tarjeta");
        pin_usuario = sc.nextInt();
        if (pin_usuario!= PIN_TARJETA)
        {
            intentos--;
            intentos_positivo++;
            System.out.println("Te equivocaste te quedan " + intentos + " intentos" );
        }
        else
        {
            System.out.println("Puedes sacar dinero");
        }
        }while(intentos>0 && pin_usuario!= PIN_TARJETA);
        //}while(intentos<3 && pin_usuario!= PIN_TARJETA);
        
    }
    
}
