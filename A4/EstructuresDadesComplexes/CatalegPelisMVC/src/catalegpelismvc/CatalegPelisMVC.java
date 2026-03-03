/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catalegpelismvc;

import Modelo.Pelicula;
import Modelo.PeliculaDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CatalegPelisMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CatalegPelisMVC app = new CatalegPelisMVC();
        app.run();
               
    }

    private void run() { //main sense public static 
        PeliculaDAO cataleg;
        
        cataleg = new PeliculaDAO(); //inicialitzar ArrayList i afegeix pelis
        int opcio;
        do {
            mostrarMenu();
            opcio = llegirOpcioValida();

            switch (opcio) {
                case 1:
                    System.out.println("Has seleccionat: Afegir Película");
                    // TODO: Implementar afegir pel·lícula
                    afegirPeli(cataleg);
                    break;

                case 2:
                    System.out.println("Has seleccionat: Buscar pel·lícula per ID");
                    buscarPeliId(cataleg);
                    break;

                case 3:
                    System.out.println("Has seleccionat: Buscar pel·lícula segunda Parte");
                    buscarPeliSegundaParte(cataleg);
                    break;

                case 4:
                    System.out.println("Has seleccionat: Borrar pel·lícula");
                    borrarPeli(cataleg);
                    break;

                case 5:
                    System.out.println("Has seleccionat: Llistar pel·lícules");
                    llistarPelicules(cataleg);
                    break;

                case 6:
                    System.out.println("Has seleccionat: Borrar pel·lícula nombre");
                    borrarPeliNombre(cataleg);
                    break;                    


                case 7:
                    System.out.println("Has seleccionat: Filtrar por genero");
                    filtrarGenere(cataleg);
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

    private void mostrarMenu() {
        System.out.println("===== MENÚ GESTIÓ PEL·LÍCULES =====");
        System.out.println("1.- Afegir Pel·lícula");
        System.out.println("2.- Buscar pel·lícula per id");
        System.out.println("3.- Buscar pel·lícula con segundas parte");
        System.out.println("4.- Borrar pel·lícula");
        System.out.println("5.- Llistar pel·lícules");
        System.out.println("6.- Borrar pel·lícula por nombre");
        System.out.println("7.- Filtrar por Genero");
        System.out.println("0.- Sortir");
        System.out.print("Escull una opció: ");
    }

    private int llegirOpcioValida() {
        int opcio;
        
        Scanner scanner = new Scanner(System.in);
        boolean valida = false;
        while (!valida) {
            try {
                opcio = scanner.nextInt();

                if (opcio >= 0 && opcio <= 7) {    
                    valida = true;
                    return opcio;
                } else {
                    System.out.print("Opció no vàlida. Introdueix un número entre 0 i 7: ");
                    //no toco valida
                }

            } catch (NumberFormatException e) {
                System.out.print("Error! Introdueix un número vàlid: ");
                valida = false; 
            }
        }
        return -1;
    }

    private void afegirPeli(PeliculaDAO cataleg) {
        /*Datos entrada*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon el id:");
        int id = sc.nextInt();
        sc.nextLine(); //limpiar buffer y return
        System.out.print("Pon el titol:");
        String titulo = sc.nextLine();
        System.out.print("Pon el genere:");
        String genero = sc.nextLine();
        System.out.print("Tiene segunda parte?:");
        String segunda = sc.nextLine();
        Pelicula anyadir;
        if (segunda.equalsIgnoreCase("SI"))
        {
            anyadir = new Pelicula(id, titulo, genero, true);
        }
        else
        {
            anyadir = new Pelicula(id, titulo, genero, false);
        }
        /* segunda interaccion con Modelo (DAO)
                */
        if (cataleg.addPeli(anyadir))
        { /*3 parte recoger y mostrar salida*/
            System.out.println("Pelicula añadida correctamente");
        }
        else
        {
            System.out.println("Pelicula no se ha podido añadir");
        }
    }

    private void buscarPeliId(PeliculaDAO cataleg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void buscarPeliNombre(PeliculaDAO cataleg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void borrarPeli(PeliculaDAO cataleg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void llistarPelicules(PeliculaDAO cataleg) {
        List<Pelicula> all = cataleg.allPelis();
        for (Pelicula peli : all) {
            System.out.println(peli);
        }
        System.out.println("Pelis listadas: " + all.size());
    }

    private void borrarPeliNombre(PeliculaDAO cataleg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void filtrarGenere(PeliculaDAO cataleg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void buscarPeliSegundaParte(PeliculaDAO cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres pelis con segunda parte(Si/No)");
        String yesNo = sc.nextLine();
        boolean segunda;
        if (yesNo.equalsIgnoreCase("Si"))
        {
            segunda = true;
        }
        else
        {
            segunda = false;
        }
        List<Pelicula> all = cataleg.AllPelisSecondPart(segunda);
        for (Pelicula peli : all) {
            System.out.println(peli);
        }
        System.out.println("Pelis listadas: " + all.size());
    }
    
}
