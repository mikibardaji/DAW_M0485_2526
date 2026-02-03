/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayobjetos;

/**
 *
 * @author mabardaji
 */
public class ArrayObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animales[] zoo = new Animales[4];
        
        zoo[0] = new Animales("Perro", "Guau");
        zoo[1] = new Animales("Elefante", "buuuu");
        zoo[2] = new Animales("Iguana", "pifffiif");
        zoo[3] = new Animales("Profesor","jijnijiijijijajajajajajjijiaji9jajajiajiodahdiafp");
       
        






























//no esta inicialitzat
        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i].getTipo().equalsIgnoreCase("ELEFANTE"))
            {
                System.out.println("Esta el elefante");
            }
            System.out.println(zoo[i].getTipo() + " hace " + zoo[i].getRuido());
        }
        
    }
    
}
