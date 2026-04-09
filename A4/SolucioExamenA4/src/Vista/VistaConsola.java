package Vista;

import java.util.*;

import Model.PokedexModelDAO;
import Model.Pokemon;
import Model.IdInvalidException;

/**
 * Classe que gestiona la vista de consola de la Pokedex
 */
public class VistaConsola {

    private Scanner sc;
    public void run() {
        sc = new Scanner(System.in);
        PokedexModelDAO repositori = new PokedexModelDAO();
        Menu menuPokedex = new Menu("Mantenimiento Pokémons");
        afegirOpcionsMenu(menuPokedex);
        menuPokedex.setOpcioSalida(7);

        int opcio = 0;
        do {
            menuPokedex.mostrarMenu();
            opcio = menuPokedex.llegirOpcioValida();

            switch (opcio) {
                case 1:
                    capturarPokemon(repositori);
                    break;
                case 2:
                    veurePokemonList(repositori);
                    break;
                case 3:
                    veureInventari(repositori);
                    break;
                case 4:
                    cambiarTipus(repositori);
                    break;
                case 5:
                    alliberarEspecie(repositori);
                    break;
                case 6:
                    alliberarUnPokemon(repositori);
                    break;
                case 7:
                    if (opcio == menuPokedex.getOpcioSalida())
                        System.out.println("\nSortint del programa...");
                    else
                        System.out.println("Opció no vàlida. Intenta-ho de nou.");
                    break;
            }

        } while (opcio != menuPokedex.getOpcioSalida());

        sc.close();
    }

    private void afegirOpcionsMenu(Menu menuPokedex) {
        menuPokedex.afegirOpcio("Capturar Pokémon");
        menuPokedex.afegirOpcio("Veure Pokedex");
        menuPokedex.afegirOpcio("Veure Inventari");
        menuPokedex.afegirOpcio("Cambiar tipus Pokemon");
        menuPokedex.afegirOpcio("Alliberar tots els especiments");
        menuPokedex.afegirOpcio("Alliberar 1 Pokemon");
        menuPokedex.afegirOpcio("Sortir");
    }

    /**
     * Opció 1: Capturar un Pokémon
     * @param pokedexModelDAO 
     */
    private void capturarPokemon(PokedexModelDAO repositori) {
        System.out.println("\n--- Capturar Pokémon ---");
        
        int id = -1;
        boolean idValid = false;
        
        // Demanar ID amb validació
        while (!idValid) {
            System.out.print("Introdueix l'ID del Pokémon: ");
            try {
                id = sc.nextInt();
                sc.nextLine(); // Netejar buffer
                idValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: L'ID ha de ser numèric. Intenta-ho de nou.");
                sc.nextLine(); // Consumir línia errònia
            }
        }

        System.out.print("Introdueix el nom del Pokémon: ");
        String nom = sc.nextLine().trim();

        System.out.print("Introdueix el tipus del Pokémon: ");
        String tipus = sc.nextLine().trim();

        try {
            Pokemon pokemon = new Pokemon(id, nom, tipus);
            

            if (repositori.capturarPokemon(pokemon)) {
                System.out.println("✓ Pokémon " + nom + " registrat, és una espècie nova!");
            } else {
                System.out.println("✓ Pokémon " + nom + " registrat, ja el tenies al catàleg.");
            }
        } catch (IdInvalidException e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
    }

    /**
     * Opció 2: Veure la llista de Pokémon únics (Pokedex)
     */
    private void veurePokemonList(PokedexModelDAO repositori) {
        System.out.println("\n--- Pokedex ---");
        List<Pokemon> pokemons = repositori.getLlistaCapturats();

        if (pokemons.isEmpty()) {
            System.out.println("La Pokedex està buida. Captura alguns Pokémons!");
        } else {
            for (Pokemon p : pokemons) {
                System.out.println(p);
            }
            System.out.println("\nS'han trobat " + pokemons.size() + " espècies a la Pokedex.");
        }
    }

    /**
     * Opció 3: Veure l'inventari de Pokémons amb recompte
     */
    private void veureInventari(PokedexModelDAO repositori) {
        System.out.println("\n--- Inventari de Recompte ---");
        List<Pokemon> pokemons = repositori.getLlistaCapturats();
        Map<String, Integer> quantitats = repositori.getQuantitat();

        if (pokemons.isEmpty()) {
            System.out.println("L'inventari està buit.");
        } else {
            for (Pokemon p : pokemons) {
                String clau = p.getNom().toLowerCase();
                int quant = quantitats.getOrDefault(clau, 0);
                System.out.println(p.getNom() + " - " + p.getTipus() + " - " + quant + " espècimens");
            }
            int total = repositori.getQuantitatTotal();
            System.out.println("\nTotal: " + total + " Pokémons capturats.");
        }
    }

    /**
     * Opció 4: Cambiar el tipus d'un Pokémon
     */
    private void cambiarTipus(PokedexModelDAO repositori) {
        System.out.println("\n--- Cambiar tipus Pokémon ---");

        System.out.print("Introdueix el nom del Pokémon: ");
        String nom = sc.nextLine().trim();

        System.out.print("Introdueix el nou tipus: ");
        String nouTipus = sc.nextLine().trim();

        if (repositori.canviarTipus(nom, nouTipus)) {
            System.out.println("✓ El tipus del Pokémon " + nom + " ha estat actualitzat a: " + nouTipus);
        } else {
            System.out.println("✗ Error al actualitzar el tipus.");
        }
    }

    /**
     * Opció 5: Alliberar tota una espècie (elimina totes les còpies)
     */
    private void alliberarEspecie(PokedexModelDAO repositori) {
        System.out.println("\n--- Alliberar tots els especimens d'una espècie ---");

        System.out.print("Introdueix el nom del Pokémon a alliberar: ");
        String nom = sc.nextLine().trim();

        if (repositori.alliberarEspecie(nom)) {
            System.out.println("✓ L'espècie " + nom + " ha estat totalment eliminada de la Pokedex.");
        } else {
            System.out.println("✗ Error: L'espècie " + nom + " no apareix a la teva Pokedex.");
        }
    }

    /**
     * Opció 6: Alliberar un sol Pokémon
     */
    private void alliberarUnPokemon(PokedexModelDAO repositori) {
        System.out.println("\n--- Alliberar un Pokémon ---");

        System.out.print("Introdueix el nom del Pokémon a alliberar: ");
        String nom = sc.nextLine().trim();

        if (repositori.alliberarUnPokemon(nom)) {
            System.out.println("✓ S'ha alliberat un pokemon de l'espècie " + nom + ".");
        } else {
            System.out.println("✗ Error: L'espècie " + nom + " no apareix a la teva Pokedex.");
        }
    }
}
