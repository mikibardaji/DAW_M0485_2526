/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriapoo;

import Objectes.Botella;
import Objectes.Vaso;

/**
 *
 * @author mabardaji
 */
public class TeoriaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Botella bottle;
        bottle = new Botella();
//        System.out.println("capacida botella " + bottle.getCapacidad());
//        System.out.println("ml liquido: " + bottle.getMlLiquido());
//        System.out.println("Material: " + bottle.getMaterial());
//        System.out.println("tapon " + bottle.estaCerrada());
        
        System.out.println("Abro botella");
        bottle.abrirBotella();
//        System.out.println("Intento poner 70");
        bottle.setLiquido(70);
//        System.out.println("ml liquido: " + bottle.getMlLiquido());
//        
//        System.out.println("Intento poner 10");
        bottle.setLiquido(10);
//        System.out.println("ml liquido: " + bottle.getMlLiquido());
//        System.out.println("Intento poner Setter 5");
        bottle.setLiquido(5);
//        System.out.println("ml liquido: " + bottle.getMlLiquido());
//        System.out.println("relleno con 5");
        bottle.rellenar(5);
//        System.out.println("ml liquido: " + bottle.getMlLiquido());
//        System.out.println("Llenando hasta el tope " + bottle.llenar());
//        System.out.println("Despues de llenar ml liquido: " + bottle.getMlLiquido());
//        System.out.println("Vuelvo a rellenar con 5");
        bottle.rellenar(5);
        
        Vaso glass1 = new Vaso();
        Vaso glass2 = new Vaso(4);
        Vaso glass3 = new Vaso();
        Vaso glass4 = new Vaso();
        System.out.println("Lleno botella");
        bottle.llenar();
        System.out.println("Empiezo a llenar vaosos con botella" + bottle.getMlLiquido());
        while (!bottle.isVacia())
        {
            //cambiar o añadir metodos a baso y botella
            //para el liquido sobrante al rellenar vuelva a la botella
            //if (glass1.getMlLiquido()!= glass1.getCapacidad())
            if (!glass1.isFull())
            {
                System.out.println("Relleno vaso 1");
                glass1.rellenar(bottle.verter());
                System.out.println("A la botella le quedan " + bottle.getMlLiquido());
            }
            else if (!glass2.isFull())
                 {
                System.out.println("Relleno vaso 2");
                glass2.rellenar(bottle.verter());
                System.out.println("A la botella le quedan " + bottle.getMlLiquido());
                 }
           else if (!glass3.isFull())
                 {
                System.out.println("Relleno vaso 3");
                glass3.rellenar(bottle.verter());
                System.out.println("A la botella le quedan " + bottle.getMlLiquido());
                }
           else if (!glass4.isFull())
                 {
                System.out.println("Relleno vaso 4");
                glass4.rellenar(bottle.verter());
                }
        }
        
    }
    
}
