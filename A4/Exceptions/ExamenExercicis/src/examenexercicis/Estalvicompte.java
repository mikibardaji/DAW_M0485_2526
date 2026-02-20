/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenexercicis;

import Objetos.CompteEstalvi;
import Objetos.NomInvalidException;
import Objetos.QuantitatNoValidaException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Estalvicompte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CompteEstalvi c1 = new CompteEstalvi("Joanet", 1000, 300);
        try
        {
            c1.retirar(200);
        }
        catch (QuantitatNoValidaException ex)
        {
            System.out.println(ex.getMessage());
        }
        CompteEstalvi c2 = new CompteEstalvi("Mari", 500, 200);
        CompteEstalvi c3 = new CompteEstalvi("Anna", -50, 100);
         try
        {
        c1.retirar(500);
        }
        catch (QuantitatNoValidaException ex)
        {
            System.out.println(ex.getMessage());
        }
        try
        {
        c2.setTitular("Maria Isabel");
        }
        catch (NomInvalidException ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            
        c3.setTitular("Pepa");
                }
        catch (NomInvalidException ex)
        {
            System.out.println(ex.getMessage());
        }
        int fillsC2 = 0, fillsC3 = 3,fillsC1=0;
        try
        {
        c1.setLimiteRetirada(0);
                }
        catch (QuantitatNoValidaException ex)
        {
            System.out.println(ex.getMessage());
        }
        try
        {
            System.out.println("Els fills de " + c2.getTitular()+ " tindran "
                + c2.repartirHerencia(fillsC2));
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("Els fills de " + c3.getTitular()+ " tindran "
                + c3.repartirHerencia(fillsC3));
        Scanner sc = new Scanner(System.in);
        System.out.print("Quants fills te " + c1.getTitular() + "?");
        try
        {
         fillsC1 = sc.nextInt();
        }
        catch(InputMismatchException ex)
        {
            System.out.println(ex.getMessage());
        }
       System.out.println("Els fills de " + c1.getTitular() + " tindran "
                + c1.repartirHerencia(fillsC1));

    }
    
}
