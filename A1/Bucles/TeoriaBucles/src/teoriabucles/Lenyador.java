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
public class Lenyador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int danyo=0;
        System.out.println("Pon el nivelñ de tu leñador");
        int nivel_lenyador = sc.nextInt();
        if (nivel_lenyador==9)
        {
            danyo = 200;
        }
        else if (nivel_lenyador==10)
        {
            danyo = 220;
        }
        else if (nivel_lenyador==11)
        {
            danyo = 242;
        }
        else if (nivel_lenyador==12)
        {
            danyo = 266;
        }
        else if (nivel_lenyador==13)
        {
            danyo = 292;
        }        
        System.out.println("Tu leñador tiene " + danyo + " ataque");
        Random rd = new Random();
        int nivel_torre = rd.nextInt(9, 13);
        int vida_torre=0;
        
        if (vida_torre==9)
        {
            vida_torre = 240;
        }
        else if (vida_torre==10)
        {
            vida_torre = 280;
        }
        
        System.out.println("Tu torre tiene " + vida_torre + " vida");
        
        //aqui empieza el atauque
        
        
        
        
        
        
    }
    
}
