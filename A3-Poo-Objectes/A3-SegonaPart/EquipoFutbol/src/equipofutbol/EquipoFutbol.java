/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipofutbol;

import Objetos.Entrenamiento;
import Objetos.Futbolista;
import Objetos.Presidente;

/**
 *
 * @author mabardaji
 */
public class EquipoFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Entrenamiento aux;
        aux = new Futbolista(0, "Bellingham", 0, 0);
        
        aux.concentrarse();
        aux.viajar();
        
        Presidente pre = new Presidente(10, 10, "Florentino", 100);
        pre.concentrarse();
        pre.viajar();
        
        
    }
    
}
