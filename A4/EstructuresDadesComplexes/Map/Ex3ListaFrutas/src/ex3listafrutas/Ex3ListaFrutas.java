/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3listafrutas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alumne
 */
public class Ex3ListaFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            List<String> fruites = Arrays.asList("poma", "pera", "poma", "plàtan", "poma", "pera");
            Map<String, Integer> comptador = new HashMap<>();

            for (String fruta : fruites) {
                if(!comptador.containsKey(fruta))
                { //no existe
                    comptador.put(fruta, 1); // Si no hi és, afegeix-la amb valor 1
                }
                else
                {
                    Integer cantidad = comptador.get(fruta);
                    cantidad++; // Si la fruita ja està al map, suma-li 1 al valor actual
                    comptador.put(fruta, cantidad);
                }
            }
            for (String fruta : fruites) {
               comptador.put(fruta, comptador.getOrDefault(fruta, 0) +1);
                // Si la fruita ja està al map, suma-li 1 al valor actual
                // Si no hi és, afegeix-la amb valor 1
            }         
            System.out.println(comptador);
    }
    
}
