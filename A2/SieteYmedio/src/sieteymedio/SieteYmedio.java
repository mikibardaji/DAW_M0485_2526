/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sieteymedio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class SieteYmedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int carta, pal;
        double puntsJugador=0, puntosCarta, puntsBanca=0;
        
        do
        {
            carta = numeroCartaAleatori();
            pal = paloCartaAleatorio();
            imprimirCarta(carta, pal);
            puntosCarta = puntosCarta(carta);
            puntsJugador = puntsJugador+puntosCarta;
            
            //puntsJugador += puntosCarta(carta);
            System.out.println("Tu puntuación es " + puntsJugador);
        }while(plantarse(puntsJugador)=='n');
        //}while(plantarse()!='s');
        
        //aqui si es important while abans
        //perque potser ja no li interesa ni 
        //demanar cap carta
        while(bancoPideCarta(puntsJugador, puntsBanca)) //pregunto
        {//antes 
            carta = numeroCartaAleatori();
            pal = paloCartaAleatorio(); 
            System.out.print("La banca saca ");
            imprimirCarta(carta, pal);
            puntosCarta = puntosCarta(carta);
            puntsBanca = puntsBanca + puntosCarta;
            System.out.println("Puntuació banca es " + puntsBanca
            + " tu te plantaste a " + puntsJugador);
        }
        
        if (guanyaJugador(puntsJugador, puntsBanca))
        {
            System.out.println("Has guanyat!!!!");
        }
        else
        {
            System.out.println("Loser!!!! ");
        }
        
        
    }
    

        public static int numeroCartaAleatori() 
        {
            Random rd = new Random();
            int numero_aleatori = rd.nextInt(1,11);

//            if (numero_aleatori>7)
//            {
//                numero_aleatori += 2;
//            } 
            if (numero_aleatori == 8) {
                numero_aleatori = 10;
            }
            if (numero_aleatori == 9) {
                numero_aleatori = 11;
            }
            if (numero_aleatori == 10) {
                numero_aleatori = 12;
            }
            return numero_aleatori;    
        }  
        
        
    public static int paloCartaAleatorio() {
        Random rd = new Random();

        int palo = rd.nextInt(1,5);

        return palo;
    }        
    
    
    public static void imprimirCarta(int numero, int pal) {
        String nomPal = "";
        switch (pal) {
            case 1:
                nomPal = "OROS";
                break;
            case 2:
                nomPal = "BASTOS";
                break;
            case 3:
                nomPal = "ESPADAS";
                break;
            case 4:
                nomPal = "COPAS";
                break;
            default:
                nomPal = "DESCONOCIDO";
                break;
        }

        String nomCarta = "";
        switch (numero) {
            case 10:
                nomCarta = "SOTA";
                break;
            case 11:
                nomCarta = "CABALLO";
                break;
            case 12:
                nomCarta = "REY";
                break;
            default:
                //nomCarta = "" + numero + "";
                nomCarta = String.valueOf(numero);
                break;
        }

        System.out.println("Carta: " + nomCarta + " de " + nomPal);
    } 
    
    public static double puntosCarta(int numero) 
    {
        if (numero >= 1 && numero <= 7) return numero;
        else return 0.5;
    }
    
    public static boolean bancoPideCarta(double puntos_jugador, double puntos_banco) {
//        if ((puntos_jugador <= 7.5 && puntos_banco < puntos_jugador)
//              ||   )
        
        
        if (puntos_jugador <= 7.5 && puntos_banco < puntos_jugador) 
        {
            return true;    
        }
        else if (puntos_banco < 5)
        {
            return true;    
        }
        else 
        {
            return false;
        }
    }
    
public static boolean guanyaJugador(double punt_jugador, double punt_banca)
    {
        if (punt_jugador<= 7.5 && punt_jugador>punt_banca)
        {
            return true;
        }
        else if (punt_banca>7.5)
        {
            return true;
        }
        else
        {
            return false;
        }

    }    


    public static char plantarse(double puntos)
    {
        Scanner sc = new Scanner(System.in);
        char seguir;
        if (puntos>7.5)
        {
            seguir = 'n';
        }
        else
        {
            do
            {
                System.out.print("Quieres plantarte(s/n)? ");
                seguir = sc.next().charAt(0);
            }while(seguir != 's' && seguir != 'n'); 
        }
        
        return seguir;
    }
    
//public static void punts_carta(int numero_carta_aleatori)
//        {
//        double medio_punto = 0.5;
//        if (numero_carta_aleatori>=1 && numero_carta_aleatori<=7) {
//            System.out.println("Puntos carta-> " + numero_carta_aleatori);
//        } else System.out.println("Puntos carta-> " + medio_punto );
}
    
    

