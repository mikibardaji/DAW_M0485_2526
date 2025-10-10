/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapuntuable;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario_bruto, salario_neto;
        double IRPF=0;
        char exemcion;
        System.out.print("Cual es tu sueldo? ");
        salario_bruto = sc.nextDouble();
        System.out.print("Estas exemto? ");
        exemcion = sc.next().charAt(0);
        
        
        
        if (exemcion == 's' || exemcion == 'S')
        {
            IRPF = 0;
        }
        else if (salario_bruto>= 0 && salario_bruto <=12450)
        {
            IRPF = 0.19;
        }
        else if (salario_bruto> 12450 && salario_bruto <=20200)
        {
            IRPF = 0.24;
        }
        else if (salario_bruto> 20200 && salario_bruto <=35200)
        {
            IRPF = 0.30;
        }
     
        else if (salario_bruto> 35200 && salario_bruto <=60000)
        {
            IRPF = 0.37;
        } 
        else if (salario_bruto> 60000 && salario_bruto <=300000)
        {
            IRPF = 0.45;
        } 
        else if (salario_bruto> 300000)
        {
             IRPF = 0.47;
        }

        double impuestos = salario_bruto * IRPF;
        salario_neto = salario_bruto - impuestos;
        
        System.out.println("Salario bruto : "+ salario_bruto);
        System.out.println("IRPF: " + impuestos);
        System.out.println("Salario neto : " + salario_neto);
        

    }
    
}
