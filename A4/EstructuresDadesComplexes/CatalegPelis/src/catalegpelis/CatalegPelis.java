/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catalegpelis;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CatalegPelis {

 public static void main(String[] args) {

        int opcio = -1;

        do {
            mostrarMenu();
            opcio = llegirOpcioValida();

            switch (opcio) {
                case 1:
                    System.out.println("Has seleccionat: Afegir Película");
                    // TODO: Implementar afegir pel·lícula
                    break;

                case 2:
                    System.out.println("Has seleccionat: Buscar pel·lícula per ID");
                    // TODO: Implementar cerca per ID
                    break;

                case 3:
                    System.out.println("Has seleccionat: Buscar pel·lícula per nom");
                    // TODO: Implementar cerca per nom
                    break;

                case 4:
                    System.out.println("Has seleccionat: Borrar pel·lícula");
                    // TODO: Implementar esborrar pel·lícula
                    break;

                case 5:
                    System.out.println("Has seleccionat: Llistar pel·lícules");
                    // TODO: Implementar llistar pel·lícules
                    break;

                case 0:
                    System.out.println("Sortint del programa...");
                    break;

                default:
                    // No hauria d'entrar aquí perquè validem abans
                    System.out.println("Opció no vàlida.");
            }

            System.out.println();

        } while (opcio != 0);

    }

    public static void mostrarMenu() {
        System.out.println("===== MENÚ GESTIÓ PEL·LÍCULES =====");
        System.out.println("1.- Afegir Pel·lícula");
        System.out.println("2.- Buscar pel·lícula per id");
        System.out.println("3.- Buscar pel·lícula per nom");
        System.out.println("4.- Borrar pel·lícula");
        System.out.println("5.- Llistar pel·lícules");
        System.out.println("0.- Sortir");
        System.out.print("Escull una opció: ");
    }

    public static int llegirOpcioValida() {
        int opcio;
        
        Scanner scanner = new Scanner(System.in);
        boolean valida = false;
        while (!valida) {
            try {
                opcio = scanner.nextInt();

                if (opcio >= 0 && opcio <= 5) {    
                    valida = true;
                    return opcio;
                } else {
                    System.out.print("Opció no vàlida. Introdueix un número entre 0 i 5: ");
                    //no toco valida
                }

            } catch (NumberFormatException e) {
                System.out.print("Error! Introdueix un número vàlid: ");
                valida = false; 
            }
        }
        return -1;
    }
    
    
}
