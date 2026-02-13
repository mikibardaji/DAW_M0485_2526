/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleatapp;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class EmpleatApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

        try {
            // Crear empleat amb constructor
            Empleat e1 = new Empleat("Marc", 1500, "Informatica");
            System.out.println(e1);

            // Provar salari mensual
            System.out.print("Introdueix número de pagues: ");
            int pagues = sc.nextInt();
            double mensual = e1.salariMes(pagues);
            System.out.println("Salari mensual: " + mensual + " €");

            // Provar excepció salari
            try {
                e1.setSalari(1000);
            } catch (SalariInvalidException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

            // Provar excepció departament
            try {
                e1.setDepartament("RRHH");
            } catch (DepartamentInvalidException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

        } catch (SalariInvalidException | DepartamentInvalidException ex) {
            System.out.println("Error creant empleat: " + ex.getMessage());
        }

        sc.close();
    }
    
    
}
