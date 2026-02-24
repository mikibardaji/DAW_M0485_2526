/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teorialist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creame un arraup ClubFutbol
        List<Jugadors> club;
        club = new ArrayList();
        //inserteis 4 jugadores
        //opcion correcta
        //crear variable con todos los atributos
        //y luego insertan
        Jugadors j1 = new Jugadors(1, "Ter Stegen");
        club.add(j1);
        
        club.add(new Jugadors(5, "Busquets"));
        club.add(new Jugadors(10, "Messi"));
        club.add(new Jugadors(12, "Villa"));
        club.add(new Jugadors(4,"Puyol"));
        club.add(new Jugadors(1,"Casilla"));
        club.add(new Jugadors(25,"Marcelo"));
        club.add(new Jugadors(8,"Modric"));
        club.add(new Jugadors(24,"Rudiger"));
        club.add(new Jugadors(99,"Messi"));
        for (Jugadors jugadors : club) {
//            System.out.println(jugadors.getDorsal()
//            + " - " + jugadors.getNom());
            System.out.println(jugadors); //toString 
        }
        System.out.println("Jugadores equipo: " + club.size());
        //fore listaor
        
        System.out.println("Voy a preguntar"
                + "si tengo a 5 busquets");
        
        
        //A PARTIR DE AQUI TOTS ELS METODES NECESSITEN TENIR EL EQUALS 
        //BEN IMPLEMENTAT PER FUNCIONAR
         //me pregunteis si existe el 
        //segundo jugador que has insertado
        Jugadors existe = new Jugadors(5, "Busquets");
        System.out.println("jugador 5 existe? " + club.contains(existe));
        existe = new Jugadors(1,"Courtois");
        System.out.println("jugador 1 existe aunque se llame Courtois? " + club.contains(existe));
        existe = new Jugadors(10,"");
        System.out.println("jugador 10 existe? " + club.contains(existe));
        existe = new Jugadors(14,"Villa");
        System.out.println("jugador 14 existe? " + club.contains(existe));

        
       
        //borrad el jugador que esta en la posicion 3
        Jugadors borrat = club.remove(2); //no utilitza el equals , perque va per index
        System.out.println("Despues de borrar el tercer jugador");
        for (Jugadors jugadors : club) {
//            System.out.println(jugadors.getDorsal()
//            + " - " + jugadors.getNom());
            System.out.println(jugadors); //toString 
        }
        System.out.println("He borrat a " + borrat);
        //borrad el jugador que tenga el dorsal que hayas 
        //escrito en segunda posicion
        Jugadors delete = new Jugadors(5, "Busquets");
        if (club.remove(delete))
        {
            System.out.println("Borrat el jugador " + delete.getDorsal() );
        }
        else
        {
            System.out.println("No he pogut borrar " + delete.getDorsal());
        }
         for (Jugadors jugadors : club) {
            System.out.println(jugadors); //toString 
        }     
         
        //voy a buscar el jugador dorsal 12 
        //y saber en que posicion esta
        Jugadors buscat = new Jugadors(12, "nom");
        int pos = club.indexOf(buscat);
        if (pos!=-1)
        {
            System.out.print("He trobat el jugador " + club.get(pos));
            System.out.println(" en la posicion " + pos);
        }
        else
        {
            System.out.println("No existe el jugador " + buscat);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el jugador que quieras y te dire si esta");
        String nombre = sc.nextLine();
        
        Jugadors buscar = new Jugadors(100, nombre);
        pos = club.indexOf(buscar); //no lo encuentra porque el dorsal 100 no exuste
        if (pos!=-1) //por mucho que si tenga a Rudiger(24)
        {
            System.out.print("He trobat el jugador " + club.get(pos));
            System.out.println(" en la posicion " + pos);
        }
        else
        {
            System.out.println("No existe el jugador " + buscat);
        }
        
        boolean find = false;
        for (int i = 0; i < club.size(); i++) {
            if (club.get(i).getNom().equalsIgnoreCase(nombre))
            {
                System.out.println("Esta " + nombre + " en la posición " + i);
                System.out.println("Tiene esta informacion " + club.get(i));
               find = true;
            }
        }
        if (!find)
        {
            System.out.println("No esta " + nombre);
        }
        
        //quiero buscar si 
        //crearAgenda();
        
    }

    private static void crearAgenda() {
        List<String> agenda; //para poder aceptar polimorfismo 
        //podria ser ArrayList o LinkedList
        agenda = new ArrayList<>(); //deja de ser null para ser
        //un array List
        //agenda = new LinkedList<>();
        
        //List<int> pepe; //no porque no es un objeto
        
        System.out.println("Nombres en agenda: " + agenda.size());
        //
        agenda.add("MrBeast");
        agenda.add("Trump");
        agenda.add("Messi");
        
        //fore+Tabulador
        System.out.println("For each");
        for (String nombre : agenda) {
            System.out.println(nombre);
        }
        System.out.println("Nombres en agenda: " + agenda.size());
        System.out.println("For normal");
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i)); //agenda[i]
        }
        System.out.println("Nombres en agenda: " + agenda.size());
        
        
        System.out.println("Iterador recorre mas rapido");
        Iterator<String> iterador = agenda.iterator();
        while(iterador.hasNext())
        {
            String nombre = iterador.next();
            System.out.println(nombre);
        }
        
        //saber si esta un elemento (String)
        System.out.println("Esta Messi? " 
                + agenda.contains("Messi")); //true o false
        System.out.println("Esta Florentino? " 
                + agenda.contains("Florentino"));
        
        System.out.println("En que posicion esta MEssi" 
        + agenda.indexOf("Messi")); //la posicion que se
        //encuentra el objeto dentro del array
        System.out.println("En que posicion esta messi" 
        + agenda.indexOf("messi")); //la posicion que se
        
        System.out.println("Borro a trump " + agenda.remove("Trump"));
        System.out.println("Borro la posicion 0" + agenda.remove(0));
        System.out.println("agenda despues de borrar");
        for (String nombre : agenda) {
            System.out.println(nombre);
        }
        
        agenda.add(0,"Oscar");
        System.out.println("agenda despues de añadir a Oscar");
        for (String nombre : agenda) {
            System.out.println(nombre);
        }
    }
    
}
