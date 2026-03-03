/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcteoriaproducte;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import modelo.*;

/**
 *
 * @author mabardaji
 */
public class MVCTeoriaProducte {

    private Scanner scanner;

    public static void main(String[] args) {
        MVCTeoriaProducte app = new MVCTeoriaProducte();
        app.run();
    }

    public void run() {
        scanner = new Scanner(System.in);

        System.out.print("Introdueix capacitat màxima del repositori: ");
        int capacitat = scanner.nextInt();
        //inicializar DAO
        RepositoriProductesDAO repositori = new RepositoriProductesDAO(capacitat);

        int opcio;

        do {
            mostrarMenu(); //Vista. mostrarDatosUsuario
            opcio = scanner.nextInt(); //recogeDatos

            switch (opcio) {
                case 1:
                    afegirProducte(repositori);
                    break;
                case 2:
                    llistarProductes(repositori);
                    break;
                case 3:
                    cercarProducte(repositori);
                    break;
                case 4:
                    eliminarProducte(repositori);
                    break;
                case 0:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }

        } while (opcio != 0);

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n--- GESTIÓ DE PRODUCTES ---");
        System.out.println("1. Afegir producte");
        System.out.println("2. Llistar productes");
        System.out.println("3. Cercar producte per ID");
        System.out.println("4. Eliminar producte");
        System.out.println("0. Sortir");
        System.out.print("Escull una opció: ");
    }

    private void afegirProducte(RepositoriProductesDAO repositori) {
        
        try {
            /* 1.- Opcional pedir datos entrada*/
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nom: ");
            String nom = scanner.nextLine();
            System.out.print("Preu: ");
            double preu = scanner.nextDouble();

            Producte p = new Producte(id, nom, preu);
            /* 2.- Pasar datos al DAO*/
            if (repositori.afegirProducte(p))
            ///* 3.- Mostrar datos salida  o consecuencia*/
            {
                System.out.println("Producte afegit correctament.");
            }
            else
                System.out.println("No se ha añadido " + p);
        } catch (RepositoriPleException e) {
            /* 3.- Mostrar datos salida  o consecuencia*/
            System.err.println("ERROR: " + e.getMessage());
        } catch (InputMismatchException e)
        {
            System.err.println("Error: La id debe ser negativa ");
        }
    }

    private void llistarProductes(RepositoriProductesDAO repositori) {
        List<Producte> todos = repositori.obtenirTots();
        System.out.println("\n--- LLISTA DE PRODUCTES ---");
        for (Producte p : todos) {
            System.out.println(p);
        }
    }

    private void cercarProducte(RepositoriProductesDAO repositori) {
        try {
            /* Opcional datos entrada para el repositori*/
            System.out.print("Introdueix ID a cercar: ");
            int id = scanner.nextInt();

            Producte trobat = repositori.cercarPerId(id); /*Interaccio DAO*/

            if (trobat != null) {
                System.out.println("Producte trobat:");
                System.out.println(trobat);
            } else {
                System.out.println("No existeix cap producte amb aquest ID.");
            }

        } catch (IdNegativaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void eliminarProducte(RepositoriProductesDAO repositori) {
        System.out.print("Introdueix ID a eliminar: ");
        int id = scanner.nextInt();

        if (repositori.eliminarProducte(id)) {
            System.out.println("Producte eliminat.");
        } else {
            System.out.println("No s'ha trobat el producte.");
        }
    }

    
}
