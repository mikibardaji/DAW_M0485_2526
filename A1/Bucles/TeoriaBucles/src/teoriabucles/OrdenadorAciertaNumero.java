/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class OrdenadorAciertaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // el usuario piensa numero
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int limite_inferior = 1;
        int limite_superior = 100;
        int ordenador_piensa;
        char respuesta;
        do{
            ordenador_piensa = rd.nextInt(limite_inferior,limite_superior+1);

            System.out.print("HE pensado el " + ordenador_piensa + " he acertado(=,m(menor),y(mayor)? ");
            respuesta = sc.next().charAt(0);
            if (respuesta=='=')
            {
                System.out.println("Has acertado");
            }
            else if (respuesta == 'm')
            {
                limite_superior = ordenador_piensa+1; //este ya no tiene que cogerlo porque es menor
                System.out.println("El numero es menor");
            }
            else
            {
                limite_inferior = ordenador_piensa-1; //Le resto uno, porque el que me ha dicho
                //no es valido
                System.out.println("El numero es mayor");
            }
        }while(respuesta != '=');
        
        
        
        
    }
    
}
