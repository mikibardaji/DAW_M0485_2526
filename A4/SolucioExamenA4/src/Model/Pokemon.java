package Model;

/**
 * Classe que representa un Pokémon
 */
public class Pokemon {
    private int id;
    private String nom;
    private String tipus;

    public Pokemon(int id, String nom, String tipus) {
        this.id = id;
        this.nom = nom;
        this.tipus = tipus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    /**
     * Compara dos Pokémon pel seu nom (case-insensitive)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Pokemon)) return false;
        Pokemon pokemon = (Pokemon) obj;
        return nom.equalsIgnoreCase(pokemon.nom);
    }

    @Override
    public int hashCode() {
        return nom.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Pokemon amb ID: " + id + " s'anomena  " + nom + " i és del tipus " + tipus;
    }
}
