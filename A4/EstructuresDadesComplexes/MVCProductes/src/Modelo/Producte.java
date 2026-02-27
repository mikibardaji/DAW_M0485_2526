package Modelo;

import java.util.Objects;

public class Producte {
    private int id;
    private String nom;
    private double preu;

    public Producte(int id, String nom, double preu) {
        this.id = id;
        this.nom = nom;
        this.preu = preu;
    }
 //getters i setters

    @Override
    public String toString() {
        return "ID: " + id + " | Nom: " + nom + " | Preu: " + preu + "€";
    }
    // Equals només per ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producte)) return false;
        Producte producte = (Producte) o;
        return id == producte.id;
    }
}