package modelo;

import java.util.ArrayList;
import java.util.List;

public class RepositoriProductesDAO {
    private List<Producte> productes;
    private int capacitatMaxima;

    public RepositoriProductesDAO(int capacitatMaxima) {
        this.capacitatMaxima = capacitatMaxima;
        this.productes = new ArrayList<>();
    }
    public boolean afegirProducte(Producte p) throws RepositoriPleException {
        /*1 Opcional validar datos entrada
            Algun atributo de entrada es incorrecte
         o/y se incumple alguna restriccion (capacitatMaxima)
        */
        if (productes.size() >= capacitatMaxima) {
            throw new RepositoriPleException("Repositori ple. Capacitat : " 
                                            + capacitatMaxima);
        }
        return productes.add(p);
    }
    public Producte cercarPerId(int id) throws IdNegativaException {
        if (id < 0) {
            throw new IdNegativaException("La ID no pot ser negativa.");
        }
        Producte auxiliar = new Producte(id, "", 0);
        int index = productes.indexOf(auxiliar);
        if (index != -1) 
            return productes.get(index);
        return null; //si no lo encuentra
    }
    
    public boolean eliminarProducte(int id) {
        return true;
    }
    
    public List<Producte> obtenirTots()
    {
        return null;
    }
    // TO DO: altres mètodes com cercarPerNom, cercarPerPreu, etc.
}
