/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Presidente extends EquipoFutbol {
    private int anyosCargo;

    public Presidente(int anyosCargo, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.anyosCargo = anyosCargo;
        this.salario=10000;
    }

    public int getAnyosCargo() {
        return anyosCargo;
    }
    
    
    public void irPalcoPartido()
    {
      System.out.println(nombre + " voy al palco");  
    }   
    
    public void tratarContrato(EquipoFutbol e)
    {
        
    }

    @Override
    public void viajar() {
        super.viajar();
        System.out.println("Viajo en primera");
    }
    
    
}
