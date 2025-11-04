/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenex2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExamenEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int max_partidas, puntos_victoria, num_maquina, num_usuari, suma, punts_maquina=0, punts_usuari=0,cont_partidas=0;
        
        System.out.print("Cuanto va a ser el numero maximo de partidas? ");
        max_partidas = sc.nextInt();
        System.out.print("Cuantos puntos para ganar? ");
        puntos_victoria = sc.nextInt();
        
        do{
            //La màquina tria un número aleatori entre 1 i 10.
            num_maquina = rd.nextInt(1, 11);
            //L’usuari també introdueix un número entre 1 i 10.
            do{
                System.out.print("Quin numero vols tu? ");
                num_usuari = sc.nextInt();
            }while(num_usuari<0 || num_usuari>10);
            //Es calcula la suma dels dos números,
            System.out.println("La maquina ha escogido " + num_maquina);
            suma = num_maquina + num_usuari;
            /* funció del resultat s’assignen punts segons aquestes regles:
                    Si la suma és múltiple de 5 ? la màquina guanya 2 punts.
                    Si la suma és múltiple de 3 ? ningú guanya punts.
                    Si no és res de l’anterior ? l’usuari guanya 1 punt.*/
            if (suma%5==0)
            {
                System.out.println("Puntos para la maquina");
                punts_maquina = punts_maquina + 2;
            }
            else if (suma%3==0)
            {
                System.out.println("Nadie gana puntos");
            }
            else
            {
                System.out.println("Punto para ti");
                punts_usuari++;
            }
            cont_partidas++; //contar en que partida estoy
            //marcador a funcion
            //mostrarMarcador(2, 1);
            mostrarMarcador(punts_usuari, punts_maquina);
        }while(cont_partidas< max_partidas && punts_usuari < puntos_victoria && punts_maquina < puntos_victoria);
        
        if (punts_usuari>= puntos_victoria)
        {
            System.out.println("Has ganado");
        }
        else if (punts_maquina >= puntos_victoria)
        {
            System.out.println("La maquina gano");
        }
        else
        {
            System.out.println("No habeis ganado nadie");
        }   
    }
    
    public static void mostrarMarcador(int points_user, int points_machine)
    {
        //System.out.println("Estoy en la función mostrarMarcador");
        System.out.println("Usuario:" + points_user);
        System.out.println("Maquina: " + points_machine);
    }
    
}
