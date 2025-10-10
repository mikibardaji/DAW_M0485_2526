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
public class ContadorAtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces;
        System.out.print("Hare una cuenta atras desde el numero que me indiques...");
        veces = sc.nextInt();
        
        while(veces>0)
        {
            System.out.println(veces);
        veces = veces - 1;
        }
        
        
        
        
        do{
        System.out.println(veces);
        veces = veces - 1;
        }while(veces>0); //termine veces <= 0
        //}while (!(veces <= 0));
        //--veces, veces--, veces-=1
        

        
    }
    
}
