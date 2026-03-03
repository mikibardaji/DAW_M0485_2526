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
        Producte delete = new Producte(id, "", 0); //campo equals informado
        
        return productes.remove(delete);
        //delete es por elementos que tengan precio 
        //igual a 10
//        boolean borrado=false;
//        for (int i = 0; i < productes.size(); i++)
//        {
//          if (productes.get(i).getPreu() == 10)
//          {
//              productes.remove(id); //afegir els borrats a un arrayList
//              //i al finalitzar retornar-ho
//              borrado = true;
//          }
//        }
//        return borrado;
    }
    
    public List<Producte> obtenirTots()
    {
        List<Producte> productosSeleccionados = new ArrayList();
        
        for (Producte producto : productes) {
            //criterio de seleccion (if si es necesario)
            // y los que entren en el criterio añado a la salida
            //ejemplo if (producto.getPrecio < 10)
            productosSeleccionados.add(producto);
        }
        
        return productosSeleccionados;
    }
    // TO DO: altres mÃ¨todes com cercarPerNom, cercarPerPreu, etc.
}
