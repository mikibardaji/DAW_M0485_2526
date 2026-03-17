/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriahashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author alumne
 */
public class TeoriaHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Double> nevera;
        //nevera = new HashMap();
        nevera = new HashMap<>();
        System.out.println("anadiendo productos.... ");
        //add que es en map put
        nevera.put("Monster", 2.0);
        nevera.put("Salami", 0.200);
        nevera.put("Pizza Tarradellas", 2.0);
        nevera.put("Cerveza",6.0);
        
        //obtener el valor de una clave get
        System.out.println("Cuantas pizzas quedan en la nevera? " + nevera.get("Pizza Tarradellas"));
        System.out.println("Cuantas Salami quedan en la nevera? " + nevera.get("Salami"));
        System.out.println("Cuantos yogures quedan en la nevera? " + nevera.get("Yogurt"));
        System.out.println("Tengo yogures en la nevera? " + nevera.containsKey("Yogurt"));
        System.out.println("Tengo Salami en la nevera? " + nevera.containsKey("Salami"));
        
        System.out.println("Cuantos productos tengo en la diferentes: " + nevera.size());
        
        System.out.println("Tengo Cerveza en la nevera? " + nevera.containsKey("Cerveza"));
        //borrar
        Double cantidad = nevera.remove("Cerveza");
        System.out.println("Tengo Cerveza en la nevera? " + nevera.containsKey("Cerveza"));        
        System.out.println("De cerveza habia " + cantidad);

        nevera.replace("Pizza Tarradellas", 4.0);
        
        Set<String> claves = nevera.keySet();
        System.out.println("Todas las claves hasmap");
        for (String clau : claves) {
            System.out.println(clau);
        }
        
        //para recuperar todos los valores
        Collection<Double> valores = nevera.values();
        
        //para recorrer un hashmap, conjunto claves 
        for (String clau : claves) {
            Double cantidades = nevera.get(clau);
            System.out.println("("+clau+") - (" + cantidades +")");
        }  
        
        //foreach map
        for(Map.Entry<String,Double> entrada:nevera.entrySet())
        {
            System.out.println("Producto clave " + entrada.getKey()
            + " cantidad " + entrada.getValue());
        }
        
        
        
    }
    
}
