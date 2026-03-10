/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class PeliculaDAO {
    List<Pelicula> cataleg;

    public PeliculaDAO() {
        this.cataleg = new ArrayList<>();
        this.afegirPelisInicials();
    }

    private void afegirPelisInicials() {
        cataleg.add(new Pelicula(1, "Alien", "TERROR", true));
        cataleg.add(new Pelicula(2, "Matrix", "CIENCIA FICCIO", true));
        cataleg.add(new Pelicula(3, "Salvar al Soldado Ryan", "WESTERN", false));
        cataleg.add(new Pelicula(4, "Top Secret", "Comica", false));
    }

    public boolean addPeli(Pelicula anyadir) {
        /*validaciones
        por ejemplo no queremos pelis de 18 años
        lanzaria excepcion (falta atributo edad en pelis)*/
        return cataleg.add(anyadir);
        //CreateRUD
    }

    public List<Pelicula> allPelis() {
        return cataleg; //cReadud
    }

    public List<Pelicula> AllPelisSecondPart(boolean segunda) {
        List<Pelicula> seleccionadas = new ArrayList<>();
        
        for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getSegundaParte()==segunda)
            { //coincide lo añado
                seleccionadas.add(cataleg.get(i));
            }
        }
        return seleccionadas; //cReadud
    }

    public boolean borrarPelicula(Pelicula fakeDelete) {
        /*validaciones si hacen delete
        tuviera prohubido borrar las de western*/
        
        return cataleg.remove(fakeDelete); //equals
    }

  
    
    
}
