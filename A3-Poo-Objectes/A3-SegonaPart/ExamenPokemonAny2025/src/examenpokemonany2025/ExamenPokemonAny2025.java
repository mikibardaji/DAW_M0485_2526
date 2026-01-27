/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpokemonany2025;

import Objectes.Aigua;
import Objectes.Electric;
import Objectes.LlistaNoms;
import Objectes.Pokemon;
import Objectes.TiposPokemon;
import Objectes.Veri;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExamenPokemonAny2025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon ash, bruno;
        ash = new Pokemon();
        ash = crearPokemon2();
        bruno = crearPokemon2();
        
        System.out.println("Luchador 1: " + ash);
        System.out.println("Luchador 2: " + bruno);
        while (ash.isVida() && bruno.isVida())
        {
            bruno.recibirImpacto(ash);
            if (bruno.isVida())
                {
                ash.recibirImpacto(bruno);
                }
        }
        
        if (ash.isVida())
        {
            System.out.println(ash.getNom() + "Ha ganado ");
        }
        else
        {
            System.out.println(bruno.getNom() + "Ha ganado ");
        }
    }

    private static Pokemon crearPokemon2() {
        Scanner sc = new Scanner(System.in);
        Pokemon p;
        System.out.println("Pon el nombre del pokemon");
        String nom = sc.nextLine();//.toUpperCase(); //pasarlo a mayuscalo
        
        nom = nom.toUpperCase();
        System.out.println("Pon el tipo del pokemon (ELECTRIC/VERI/AIGUA)");
        String tipo = sc.nextLine().toUpperCase();//.toUpperCase(); //pasarlo a mayuscalo
        
        switch(tipo)
        {
            case "ELECTRIC":
              p = new Electric(TiposPokemon.valueOf(nom));
              break;
            case "VERI":
              p = new Veri(TiposPokemon.valueOf(nom));
              break;
            case "AIGUA":
            default:
              p = new Aigua(TiposPokemon.valueOf(nom));
              break;

        }
        return p;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
   /* private static Pokemon crearPokemon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del pokemon(PIKACHU, CHARIZARD, BULBASAUR, SQUIRTLE, JIGGLYPUFF)");
        String nombre = sc.nextLine().toUpperCase();
        
        System.out.println("Dime el tipo de pokemon (Agua,Veneno,Electrico)");
        String tipo = sc.nextLine().toUpperCase();
        
        switch(tipo)
        {
            case "AGUA":
                System.out.println("creo pokemon agua");
                return new Aigua(LlistaNoms.valueOf(nombre));
            case "VENENO":
                System.out.println("creo pokemon Veri");
                return new Veri(LlistaNoms.valueOf(nombre));
            case "ELECTRICO":
                System.out.println("creo pokemon electrico");
                return new Electric(LlistaNoms.valueOf(nombre)); 
            default: 
                return new Aigua(LlistaNoms.valueOf(nombre)); 
        }*/
            
       
    }


    

