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
        /*Si és un Entrenador, li dira “Tenen que millorar el seu joc al proper partit”.
        Si és un jugador , li dirà “Si vols cobrar més has de fer gols” .
        Si és un massatgista, li dirà “Com és lesioni algú et foto fora”.
        Si és un presi “Vamos a comer pago yo!!”*/
        if (e instanceof Entrenador)
        {
            System.out.println("Que jueguen mejor");
        }
        else if (e instanceof Futbolista)
        {
            System.out.println("Juega mejor para ganar");
        }
        else if (e instanceof Masajista)
        {
            System.out.println("Si se lesionan te echo");
        }
        else if (e instanceof Presidente)
        {
            System.out.println("Pago yo la comida");
        }
    }

    @Override
    public void viajar() {
        super.viajar();
        System.out.println("Viajo en primera");
    }

    @Override
    public void saludar() {
        super.saludar(); 
        System.out.println("Soy tu jefe");
    }
    
    
}
