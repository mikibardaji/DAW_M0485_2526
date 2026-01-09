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
       Futbolista aux;
        aux = new Futbolista(0, "Bellingham", 0, 0);
        
        aux.concentrarse();
        aux.viajar();
        
        Presidente pre = new Presidente(10, 10, "Florentino", 100);
        Presidente pre2 = new Presidente(5, 10, "Florentino2", 100);
        pre.concentrarse();
        pre.viajar();
        
        System.out.println("futbolista " + aux.getSalario());
        System.out.println("presidente " +pre.getSalario());
        aux.jugarPartido();
        System.out.println("futbolista " + aux.getSalario());
        
        Presidente pre3 = new Presidente(10, 150, "Florentino3", 150);
        System.out.println("son iguales " + pre.equals(pre2));
        aux.saludar();
        pre.saludar();
    }
    
}
