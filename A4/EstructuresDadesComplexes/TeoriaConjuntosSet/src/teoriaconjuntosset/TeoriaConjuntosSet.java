/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaconjuntosset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mabardaji
 */
public class TeoriaConjuntosSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> profesores = new HashSet<>(); //no admite duplicados todos los sets
        profesores.add("Roser"); //no importa el orden
        profesores.add("Miquel Angel");
        profesores.add("Isabel");
        profesores.add("Vallespin");
        profesores.add("Vallespin");
        
        System.out.println(profesores);
        for (String prof : profesores) {
            System.out.println(prof);
        }
        
        Set<String> PelisTerror = new TreeSet<>();
        PelisTerror.add("Scream"); //comparable implementado
        PelisTerror.add("El conjuro");
        PelisTerror.add("La maldición de Rockford");
        PelisTerror.add("La Monja");
        PelisTerror.add("La llorona");
        //System.out.println(PelisTerror);
        
        //PelisTerror.remove("Mark T");
        System.out.println(PelisTerror);
        //metodos especificos que nos ofrece el Set
        //A U B 
        Set<String> PelisCienciaFiccion = new TreeSet<>();
        PelisCienciaFiccion.add("Matrix");
        PelisCienciaFiccion.add("Blade Runner");
        PelisCienciaFiccion.add("La Monja");
        PelisCienciaFiccion.add("La maldición de Rockford");
        PelisCienciaFiccion.add("Flash");
        PelisCienciaFiccion.add("La remontada del city contra el madrid");
        
        System.out.println("Pelis de terror y ciencia ficcion");
        Set<String> Fantasia = new TreeSet<>();
        Fantasia.add("La ratita Presumida");
        Fantasia.add("La maldición de Rockford");
        Fantasia.add("La remontada del city contra el madrid");
        
        //PelisTerror.addAll(PelisCienciaFiccion); //A union B
        //PelisTerror.addAll(Fantasia);
        
        System.out.println(PelisTerror);
        //interseccion estan en los dos conjuntos
        //PelisTerror.retainAll(PelisCienciaFiccion);
        System.out.println("Pelis de ciencia ficcio y terror");
        System.out.println(PelisTerror);
        //diferencia me muestras los objetos que estan
        //en el primero y no en el segundo A - B
        System.out.println("Pelis de terror pero que no son ciencia ficcion");
        PelisTerror.removeAll(PelisCienciaFiccion);
        System.out.println(PelisTerror);
        
        
        
        
        
        
        
        
    }
    
}
