/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int AfegirPunts(int saldo) {
        Scanner sc = new Scanner(System.in);
        int punts;
        do
        {
            System.out.println("Quants punts vols afegir al saldo?");
            punts = sc.nextInt();
        }while(punts<0);
        return saldo + punts;
    }
    
    
    public static int apostaPunts(int saldo, int puntsAposta){
        if (saldo < puntsAposta){
            return -1;
        }
        else{
            return puntsAposta;
        }

        }
    
    public static int bola() {
        Random rand = new Random();
        int resultat = rand.nextInt(0, 37);
        //System.out.println("La bola ha caigut al numero: " + resultat);
        return resultat;
    }
    
    public static void pintaAsterisc(int numero){
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
         System.out.println("-" + numero);
    }    
    
public static int QuantitatAposta(){
    int quantitat_aposta;
    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("Quina cuantitat vols apostar? ");
        quantitat_aposta = sc.nextInt();
    }while (quantitat_aposta<0);
    
    return quantitat_aposta;
}

public static int tipoApuesta() {
        Scanner sc = new Scanner(System.in);
        int apuesta;
        do{
        System.out.println("Que tipo de apuesta haras?");
        apuesta = sc.nextInt();
        //}while(!(apuesta==-2 || apuesta ==-1 || (apuesta>=1 && apuesta<=36)));
        }while ( apuesta!=-2 && apuesta !=-1 && (apuesta<1 || apuesta>36));
        return apuesta;
    }

public static int resultatJugada(int tipusAposta, int saldo, int puntsAposta, int bola){
    int acierta_num = 0;
        if (bola == tipusAposta) { //si ha acertado el numero
            acierta_num = puntsAposta*36;
            System.out.println("Has ganado : "+ acierta_num);

        } else if ((bola %2 == 0) && tipusAposta == -2) { //par
            acierta_num = puntsAposta*2;
            System.out.println("Has ganado : "+ acierta_num);
        } else if ((bola %2 != 0) && tipusAposta == -1) { //impar
            acierta_num = puntsAposta*2;
             System.out.println("Has ganado : "+ acierta_num);
        }
        else
        {
            System.out.println("No has ganado");
            //acierta_num=0;
        }

        int nuevo_saldo = acierta_num + saldo;

        return nuevo_saldo;
}
    
}
