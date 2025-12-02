/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Vaso {
    //private /public
    private int ml_liquido;    
    private int ml_capacidad;
    private String material; 
//    int cm_alto;
//    double base;
    
    public Vaso() //constructor
    {
        ml_capacidad=8;
        ml_liquido = 0; //por defecto los tipos primitivos se ponen a 
        //su estado por defecto 
        material = "Plastico";
        //material = new String("Plastico"); siempre se llaman a un constructo
    }
    
    public Vaso(int capacidad_vaso)
    {
        ml_capacidad = capacidad_vaso;
        ml_liquido = 0;
        material = "Plastico";
    }
    
    public Vaso(String material)
    {
        this.ml_capacidad = 6;
        this.ml_liquido = 0;
        this.material = material;
    }
    
    public int getMlLiquido()
    {
        return ml_liquido;
    }
    
    public int getCapacidad()
    {
        return ml_capacidad;
    }
    
    public String getMaterial()
    {
        return material;
    }
    
    public void rellenar(int nuevo_ml)
    {
        if ( nuevo_ml<0 )
        {
            System.out.println("No puedo añadir porque es negativo");
        }
        else if ((ml_liquido+nuevo_ml) > ml_capacidad)
        {
            System.out.println("sobran ml "  +(ml_capacidad - ml_liquido - nuevo_ml));
            ml_liquido = ml_capacidad;
        }
        else
        {
            ml_liquido += nuevo_ml;
        }
    }
    
    public int  verter()
    {
        if (ml_liquido==0)
        {
            System.out.println("Vaso vacio");
            return 0;
        }
        int cantidad_verter = 2;
        if (ml_liquido< cantidad_verter)
        {
            cantidad_verter = ml_liquido;
        }
        ml_liquido = ml_liquido - cantidad_verter;
        return cantidad_verter;
    }
    
    public int santHilari()
    {
        int cantidad_verter=0;
        if (ml_liquido!=0)
        {
            cantidad_verter = ml_liquido;
            ml_liquido = 0;
        }
        return ml_liquido;
    }
    
    /**
     * metodo que me indica si el vaso esta lleno
     * devuelve true si esta lleno o false si no
     */
    public boolean isFull()
    {
        return ml_liquido==ml_capacidad;
        /*if (ml_liquido == ml_capacidad)
        {
            return true;
        }
        else
            return false;*/
    }
}
