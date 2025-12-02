/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspunto;

import objeto.Articulo;
import objeto.Punto;
import objeto.Rectangulo;

/**
 *
 * @author mabardaji
 */
public class PruebasPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        //llamadasPunto();
        //llamadasRectangulo();
        Articulo item = new Articulo("PC", 10, 0.5, 10);
        item.vender(13);
        System.out.println("me quedan " + item.getCuantosQuedan());
        
        

    }

    private static void llamadasPunto() {
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);        
        Punto p3 = new Punto(-3,7);        
        
//        p1.x = 5; //al ser public ho puc fer
//        p1.y = 0;
//        p2.x = 10;
//        p2.y = 10;
//        p3.x = -3;
//        p3.y = 7;
        
        p1.imprime();
        p2.imprime();
        p3.imprime();
         //p3.x = 2;
         p3.setXY(2, 17);
         //p3.y += 10;
         p3.imprime();
         p3.desplaza(1, 1);
         p3.imprime();
         p2.imprime();
         p1.imprime();
         p2.resta(p1); //10,10 5,0
         p2.imprime();
    }

    private static void llamadasRectangulo() {
        Rectangulo rect;
//        if (rect==null) 
//        {
//            System.out.println("es nulo");
//        }
         
        rect    = new Rectangulo(5, 5, 7, 7); //es crea el objecte.
        System.err.println("-->" + rect.getX1());
        rect.setX1(8);
        rect.setY2(0);
    }
    
}
