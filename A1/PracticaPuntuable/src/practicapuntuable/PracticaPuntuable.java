/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapuntuable;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PracticaPuntuable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int compas1, compas2;
        
        System.out.print("Pon el compas1? ");
        compas1 = sc.nextInt();
        System.out.print("Pon el compas2? ");
        compas2 = sc.nextInt();

        System.out.println("Pulsacio" + compas1);
        System.out.println("Duració nota" + compas2);
        if (compas1==4 && compas2==4)
        {

            System.out.println("Heu fet un reel");
        }
        else if (compas1==6 && compas2==8)
        {
            System.out.println("Heu fet un Jig");
        }
        else if (compas1==9 && compas2==8)
        {
            System.out.println("Heu fet un Slip");
        }        
        else if (compas1==12 && compas2==8)
        {
            System.out.println("Heu fet un Slide");
        } 
        else
        {
            System.out.println("Compas incorrecte");
        }
    }
    
}
