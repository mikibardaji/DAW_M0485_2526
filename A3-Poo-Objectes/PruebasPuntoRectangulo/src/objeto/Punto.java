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
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y)
    {    
        this.x = x; 
        this.y = y; 
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void imprime()
    {
        System.out.println("(" + this.x + "," + this.y + ")");
    }
    
    // public void setXY(int x, int y) // Modifica ambas coordenadas. Es como un setter doble.
    public void setXY(int x, int y)
    {
        this.x = x; 
        this.y = y; 
    }
    //public void desplaza(int dx, int dy) 
    // Desplaza el punto la cantidad (dx,dy) indicada. 
    //Ejemplo: Si el punto (1,1) se desplaza (2,5) entonces estará en (3,6).
    public void desplaza(int dx, int dy)
    {
        this.x += dx;
        this.y += dy;
    }
    
    public void resta(Punto p)
    {
        this.x -= p.getX();
        this.y -= p.getY();
    }
    
    
    /**
     * Crea un punto aleatorio de coordenadas entre -100 y 100
     * @return punto aleatorio
     */
    public static Punto creaPuntoAleatorio()
    {
        //estática. Deberá crear un
        //nuevo Punto (utiliza el constructor) con x e y entre -100 y 100, 
        //y luego devolverlo (con return).
        Random rd = new Random();
        int x = rd.nextInt(-100, 101);
        int y = rd.nextInt(-100, 101);
        Punto p  = new Punto(x, y);
        return p;
    }
}
