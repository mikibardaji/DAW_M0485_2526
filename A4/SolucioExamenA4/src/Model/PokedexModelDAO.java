package Model;

import java.util.*;

/**
 * Model DAO per gestionar la Pokedex
 * Gestiona les col·leccions de Pokémon capturats i recompte
 */
public class PokedexModelDAO {
    private List<Pokemon> llistaCapturats;
    private Map<String, Integer> quantitat;

    public PokedexModelDAO() {
        this.llistaCapturats = new ArrayList<>();
        this.quantitat = new HashMap<>();
    }

    /**
     * Captura un Pokémon
     * @param pokemon El Pokémon a capturar
     * @return true si és un Pokémon nou, false si ja existia
     * @throws IdInvalidException si l'ID no és vàlid
     */
    public boolean capturarPokemon(Pokemon pokemon) throws IdInvalidException {
        // Validar ID (1-1025)
        if (pokemon.getId() < 1 || pokemon.getId() > 1025) {
            throw new IdInvalidException("L'ID del Pokémon ha de ser entre 1 i 1025");
        }

        // Buscar si el Pokémon ja existeix al map, si no dona null ja hi era
        if (quantitat.get(pokemon.getNom().toLowerCase()) != null) {
            // Ja existeix, només incrementar la quantitat
            String clau = pokemon.getNom().toLowerCase();
            quantitat.put(clau, quantitat.get(clau) + 1);
            return false;
        } else {
            // No existeix, afegir a la llista i al mapa
            llistaCapturats.add(pokemon);
            String clau = pokemon.getNom().toLowerCase();
            quantitat.put(clau, 1); // Nova espècie amb 1 exemplar
            return true;
        }
    }



    /**
     * Obté la llista de Pokémon capturats
     */
    public List<Pokemon> getLlistaCapturats() {
        return llistaCapturats;
    }

    /**
     * Obté el mapa de quantitats
     */
    public Map<String, Integer> getQuantitat() {
        return quantitat;
    }

    /**
     * Canvia el tipus d'un Pokémon
     */
    public boolean canviarTipus(String nom, String nouTipus) {
        Pokemon buscar = new Pokemon(0, nom, "blanc"); // ID i tipus no importen per buscar
        int posició = llistaCapturats.indexOf(buscar); //gracies al equals
        if (posició != -1) {
            Pokemon pokemon = llistaCapturats.get(posició);
            pokemon.setTipus(nouTipus);
            return true;
        }
        return false; //no hi és
    }

    /**
     * Allibera tots els exemplars d'una espècie
     */
    public boolean alliberarEspecie(String nom) {

    
            //si busquessim a la llista, hauriem de crear un pokemon amb el nom
        //si busquessim a la llista, hauriem de crear un pokemon amb el nom
        //Pokemon buscar = new Pokemon(0, nom, "blanc"); // ID i tipus no importen per buscar
        //int posició = llistaCapturats.indexOf(buscar); //gracies al equals
        //if (posició != -1) {
        //     llistaCapturats.remove(posició);
        //     return true;
        //} else {
        //    return false; //no hi és
        //}


        //si hem fet el map es més rapid per aquí
        if (quantitat.get(nom.toLowerCase()) != null) { //si existeix l'espècie al mapa
            Pokemon borrar = new Pokemon(0, nom, "blanc");
            int posicio = llistaCapturats.indexOf(borrar);
            llistaCapturats.remove(posicio); //eliminar el primer que troba, gràcies al equals, que és el que volem
            //
            llistaCapturats.remove(borrar); //també es pot fer així, gràcies al equals, però és menys eficient perquè ha de recórrer tota la llista
            quantitat.remove(nom.toLowerCase());
            return true;
        }
        return false;
    }

    /**
     * Allibera un exemple d'una espècie
     */
    public boolean alliberarUnPokemon(String nom) {
        //si el Pokémon existeix, reduir la quantitat o eliminar completament si només en queda un
        if (quantitat.get(nom.toLowerCase())!= null) {
            String clau = nom.toLowerCase();
            int quantitatActual = quantitat.get(clau);
            
            if (quantitatActual > 1) {
                // Reduir la quantitat
                quantitat.put(clau, quantitatActual - 1);
            } else {
                // Eliminar completament dels 2 llista i mapa
                Pokemon borrar = new Pokemon(0, nom, "blanc");
                llistaCapturats.remove(borrar); //gracies al equals, eliminarà el primer que troba, que és el que volem
                quantitat.remove(clau);
            }
            return true;
        }
        return false;
    }

    /**
     * Obté la quantitat total de Pokémon
     */
    public int getQuantitatTotal() {
        int total = 0;
        for (int q : quantitat.values()) {
            total += q;
        }
        return total;
    }

}
