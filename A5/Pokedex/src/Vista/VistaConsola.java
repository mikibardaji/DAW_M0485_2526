/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Model.Pokemon;
import Model.PokemonDAO;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.List;

public class VistaConsola {
    private Scanner sc = new Scanner(System.in);

    public void run() {
        try {
            PokemonDAO dao = new PokemonDAO();
            Menu menuConcesionario = new Menu("\n--- MENÚ POKÉMON ---");
            anyadirOpcionesMenu(menuConcesionario);
            int opcio;
            do {
                menuConcesionario.mostrarMenu();
                
                
                opcio = menuConcesionario.llegirOpcioValida();
                

                switch (opcio) {
                    case 1 :
                        menuCapturar(dao);
                        break;
                    case 2:
                        menuLlistar(dao);
                        break;
                    case 3: 
                         menuEvolucionar(dao);
                         break;
                    case 4:
                        menuCercar(dao);
                        break;
                    default:
                        if (opcio == menuConcesionario.getOpcioSalida()) {
                          System.out.println("Salir");  
                        } else{
                          System.out.println("opcion incorrecta");
                        }
                       
                        break;                        
                }
            } while (opcio != menuConcesionario.getOpcioSalida());
        } catch (SQLException e) {
            System.out.println("ERROR CRÍTIC: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error amb els drivers: " + ex.getMessage());
        }
    }

    private void menuCapturar(PokemonDAO dao) {
        try {
            System.out.print("Nom del Pokémon: ");
            String nom = sc.nextLine();
            Pokemon p = dao.buscarPerNom(nom);
            if (p == null) {
                System.out.print("ID Pokedex: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Tipus: "); String tipus = sc.nextLine();
                System.out.print("Nivell: "); int nivell = Integer.parseInt(sc.nextLine());
                p = new Pokemon(id, nom, tipus, nivell, 1);
            }
            dao.capturar(p);
            System.out.println("Operació realitzada correctament.");
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }

    private void menuLlistar(PokemonDAO dao) {
        try {
            List<Pokemon> llista = dao.llistarTots();
            for (Pokemon tot : llista) {
                    System.out.println(tot);
            }
            System.out.println("Mostrats: " + llista.size());
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }

    private void menuEvolucionar(PokemonDAO dao) {
        try {
            System.out.print("Nom del Pokémon a evolucionar: ");
            String nom = sc.nextLine();
            System.out.print("Quants vols evolucionar?: ");
            int q = Integer.parseInt(sc.nextLine());
            dao.evolucionar(nom, q);
            System.out.println("Evolució completada!");
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }

    private void menuCercar(PokemonDAO dao) {
        try {
            System.out.print("Introdueix el text de cerca: ");
            String cerca = sc.nextLine();
            // Simulem cerca de coincidències
            List<Pokemon> tots = dao.llistarTots();
            int cont=0;
            for (Pokemon tot : tots) {
                if (tot.getNom().equalsIgnoreCase(cerca))
                {
                    System.out.println(tot);
                    cont++;
                }
            }
            System.out.println("Mostrats: " + cont);
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }

    private void anyadirOpcionesMenu(Menu men) {
        men.afegirOpcio("Capturar Pokémon");
        men.afegirOpcio("Llistar Pokémon");
        men.afegirOpcio("Evolucionar");
        men.afegirOpcio("Cercar per nom");
        men.afegirOpcio("Sortir");
        men.setOpcioSalida(5);
    }
}
