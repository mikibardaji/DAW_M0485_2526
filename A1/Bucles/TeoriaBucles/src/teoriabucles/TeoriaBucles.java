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
public class TeoriaBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // do-while
        Scanner sc = new Scanner(System.in);
        int opcion_menu;
        
        do{
            System.out.println("1.- Jugar");
            System.out.println("2.- Reforzar Equipo");
            System.out.println("3.- Jugar online");
            System.out.println("0.- Salir");
            System.out.print("Que opcion eliges: ");
            opcion_menu = sc.nextInt();
        
        
            if (opcion_menu==1)
            {
                System.out.println("Jugando");
            }
            else if(opcion_menu==2)
            {
                System.out.println("Equipo reforzado");
            }
            else if (opcion_menu==3)
            {
                System.out.println("Conectando online... ");
            }
         }while(opcion_menu != 0);
        //}while(!(opcion_menu == 0));
        //terminara cuando sea 0 => opcion_menu == 0
        System.out.println("Juego terminado... ");
        
    }
    
}
