/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursa;

import Objetos.obstacle;
import Objetos.vehicle;
import java.util.Random;

public class Cursa {

    public static void main(String[] args) {

        // Declara variables per poder fer el random
        Random rd = new Random();
        int ronda = 1;

        int velocitat1 = rd.nextInt(5, 11);
        int velocitat2 = rd.nextInt(5, 11);
        int litres1 = rd.nextInt(50, 101);
        int litres2 = rd.nextInt(50, 101);
        // Generar dos vehicles:
        //  - nom (fix o generat)
        //  - velocitatInicial aleat?ria entre 5 i 10
        //  - combustible inicial aleatori entre 50 i 100
        vehicle v1 = new vehicle ("A", velocitat1, litres1);
        vehicle v2 = new vehicle ("B", velocitat2, litres2);
        obstacle oaux = new obstacle("prova", 1);
        // Definir dist?ncia total de la cursa (100)
        final int DISTANCIA_FINAL = 100;

        // Imprimir estat inicial dels vehicles
        System.out.println("-----------INICI DE LA CURSA-----------");
        System.out.println("Vehicle A: velocitat inicial " + v1.getVelocitatIncial() + ", combustible " + v1.getCombustible());
        System.out.println("Vehicle B: velocitat inicial " + v2.getVelocitatIncial() + ", combustible " + v2.getCombustible());
        System.out.println("---------------------------------------");
        // Bucle principal de la cursa (mentre cap vehicle hagi arribat i tinguin combustible)
        while (v1.getdistanciaRecorreguda() < DISTANCIA_FINAL 
                && v2.getdistanciaRecorreguda() < DISTANCIA_FINAL 
                && v1.getCombustible() > 0 
                && v2.getCombustible() > 0) {
            System.out.println("Ronda " + ronda + ":");

            // Cada vehicle fa ferCursa()
            boolean segueix1 = v1.ferCursa();
            boolean segueix2 = v2.ferCursa();

            // Comprovar si segueixen tenint combustible
            if (segueix1 && segueix2) 
            {
                // Es decideix si tenen obstacle o no (1 o 2 No obstacle, la resta SI)
                int valorObstacle = rd.nextInt(1,5);
                if (valorObstacle > 2) 
                    {
                        //Generar un obstacle:
                        //  - nom (inventat)
                            //  - penalitzaci? aleat?ria entre 15 i 20
                        obstacle ob = new obstacle("Obstacle", rd.nextInt(1,4));
                        int num = rd.nextInt(1,3);
                        if (num == 1) {
                            ob.aplicarObstacle(v1);
                        } else{
                            ob.aplicarObstacle(v2);
                        }
                    }
                // Si un vehicle est? en una dist?ncia m?ltiple de 4 ? accelerar()
                if (((v1.getdistanciaRecorreguda()) % 4) == 0) {
                    if (v1.acelerar()) {
                        System.out.println("El vehicle acelera. Nova velocitat: " + v1.getVelocitatActual());

                    }
                }
                if (((v2.getdistanciaRecorreguda()) % 4) == 0) {
                    System.out.println("El vehicle acelera. Nova velocitat: " + v2.getVelocitatActual());
                }
                // Imprimir estat actual dels vehicles
                v1.mostrarEstat();
                v2.mostrarEstat();

                // Mostrar la difer?ncia de dist?ncia entre ells
                vehicle.compararDistancia(v1, v2);
                }                
                
            // Fi del bucle
            ronda ++;
            System.out.println("------------------------------");
            // Fi del bucle
        }
            
          
        // Determinar guanyador o si no hi ha guanyador
        System.out.println("--------RESULTAT FINA--------");
        if(v1.getdistanciaRecorreguda() >= DISTANCIA_FINAL){
            System.out.println("El vehicle A es el guanyador");
        }
        else if(v2.getdistanciaRecorreguda() >= DISTANCIA_FINAL){
            System.out.println("El vehicle B es el guanyador");
        }
        else{
            System.out.println("Cap vehicle es guanyador");
        }


        // Mostrar quin vehicle ha recorregut m?s dist?ncia utilitzant compararDistancia()
        System.out.println("---------DISTANCIA FINAL----------");
        System.out.println("A: " + v1.getdistanciaRecorreguda());
        System.out.println("B: " + v2.getdistanciaRecorreguda());
        
        System.out.println("Obstacles trobats " + obstacle.getContadorObstacles());
        vehicle.compararDistancia(v1, v2);

    }
}

