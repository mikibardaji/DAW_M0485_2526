/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

/**
 *
 * @author mabardaji
 */
public class TeoriaFor {

    /**
     * mostrar numeros del 1 al 20
     */
    public static void main(String[] args) {
        int contador;
        
        for (contador = 1; contador <= 20; contador=contador+1) {
            //inicializa; condicion continua; aumento contador (+/-
            System.out.println(contador);
        }
        
        //mostra els numeros del 5 al 15 (no inclos)
        for (contador=5;contador<15;contador++) {
            System.out.println(contador);            
        }
        
        System.out.println("mostra del 20 al 10 compte enrere");
        //mostra del 20 al 10(inclos) compte enrere
        for(contador=20;contador>=10;contador--)
        {
            System.out.println(contador);   
        }
        
    }
    
}
