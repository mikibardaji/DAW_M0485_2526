/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Rectangulo {

    //Necesitamos hacer algunos cambios para que todas las coordenadas estén entre (0,0) y (100,100).
//Añade a la clase Rectángulo dos atributos llamados min y max. Estos valores son comunes a todos
//los objetos y no pueden variar. Piensa qué modificados necesitas añadir a min y max.
    private int x1, y1, x2, y2;
    
    private static final int MIN=0, MAX=100;
                          //5    //5    //2     //2
    //new Rectangulo(5, 5, 2, 2);
    public Rectangulo(int x1, int y1, int x2, int y2) {
        //MIN = 10; al ser final e informat a dalt aquí ja no el puc tornar a copiar
        this.setAll(x1, y1, x2, y2);
        /*if ((x1< x2) ho elimino perque el setAll ja fa la mateixa validació
                && (y1 < y2))
        {
           
                this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        else
        { //das un error, pero has instaciado igualmente un rectangulo
            System.out.println("La coordenada " + x1 + "," + y1 + " debe "
                    + "serr inferior a " + x2 + ","+y2);
        }*/
        
    }


    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        if (this.x2> x1
                && x1 >= MIN //modificacion por el apartado E de los ejercicios
                && x1 <= MAX)
        { //sigue siendo la cooordenada mas pequeña que la superio
            this.x1 = x1;
        }
        else
        {
            System.err.println("La coordenada nueva x1 "+ x1 +
                    " es superior a la coordenada x2 " + x2);
        }
        
    }

    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        if (this.y2> y1
                && y1 >= MIN
                && y1 <= MAX)                
        { //sigue siendo la cooordenada mas pequeña que la superio
            this.y1 = y1;
        }
        else
        {
            System.err.println("La coordenada nueva y1 "+ y1 +
                    " es superior a la coordenada y2 " + y2);
        }        
        
    }

    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        if (this.x1< x2
                && x2 >= MIN //modificacion por el apartado E de los ejercicios
                && x2 <= MAX)                
        { //sigue siendo la cooordenada mas pequeña que la superio
            this.x2 = x2;
        }
        else
        {
            System.err.println("La coordenada nueva x2 "+ x2 +
                    " es superior a la coordenada x2 " + x2);
        }
    }

    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        if (this.y1< y2
                && y2 >= MIN //modificacion por el apartado E de los ejercicios
                && y2 <= MAX)                 
        { //sigue siendo la cooordenada mas pequeña que la superio
            this.y2 = y2;
        }
        else
        {
            System.err.println("La coordenada nueva y2 "+ y2 +
                    " es superior a la coordenada y1 " + y1);
        }  
    }

    public void setX1Y1(int x1, int y1)
    {
//        this.setX1(x1);
//        this.setY1(y1);
        if (this.x2>x1 && this.y2>y1) //que las nuevas sigan siendo inferiores 
        {
            this.x1 = x1;
            this.y1 = y1; //correcto
        }
        else
        {
            System.err.println("Coordenadas nuevas no son inferiores a actualies"
            + this.x2 + "," + this.y2);
        }
    }
    
    
    public void setAll(int x1, int y1, int x2, int y2)
    {
        if ((x1< x2)
                && (y1 < y2)
                && x1 >= MIN //modificacion por el apartado E de los ejercicios
                && y1 >= MIN
                && x2 <=MAX
                && y2 <=MAX)
        {  
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        else
        { //das un error, pero has instaciado igualmente un rectangulo
            System.out.println("La coordenada " + x1 + "," + y1 + " debe "
                    + "serr inferior a " + x2 + ","+y2);
        }        
        
    }
   
    public int ancho() {
        return Math.abs(x2 - x1); //abs quita el simbolo negativo si es que lo diera
    }


    public int alto() {
        return Math.abs(y2 - y1);
    }

   
    public int perimetro() {
        return 2 * (this.ancho() + alto());
    }

  
    public int area() {
        return ancho() * alto();
    }


    public void mostrarCoordenadas() {
        System.out.println("Coordenadas: (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")");
    }
    
    
    public static Rectangulo crearRectAleatorio()
            {
                Random rd = new Random();
                int x = rd.nextInt(MIN, MAX+1);
                int y = rd.nextInt(MIN, MAX+1);
                int a,b;
                do
                {
                    a= rd.nextInt(MIN, MAX+1);
                    b  = rd.nextInt(MIN, MAX+1);
                }while (a<x || b<y);
                
                Rectangulo rect = new Rectangulo(x, y, a, b);
                return rect;
            }
}

