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
public class Ex13AdivinaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num_pensado_maquina = rd.nextInt(1, 101);
        int usuario, contador=0;
        //System.out.println("he pensado " + num_pensado_maquina); //se quitara
        do{
            System.out.println("Que numero crees que he pensado? ");
            contador++;
            usuario = sc.nextInt();
            /*if (usuario==num_pensado_maquina)
            {
                System.out.println("Acertaste");
            }
            else*/ if (usuario<num_pensado_maquina)
            {
                System.out.println("El numero es mayor");
            }
            else if(usuario>num_pensado_maquina)
            {
                System.out.println("El numero es menor");
            }
           
        }while(usuario!=num_pensado_maquina && contador<=6);
        
        if (usuario==num_pensado_maquina)
        {
            System.out.println("Acertaste");
        }
        else // if (usuario!=num_pensado_maquina)
        {
            System.out.println("Has perdido");
        }
        
        
    }
    
}
