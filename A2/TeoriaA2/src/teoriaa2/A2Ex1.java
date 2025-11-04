/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaa2;

import java.util.Scanner;

/**
 * Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la función:
double multiplica(double a, double b) // Devuelve la multiplicación de dos números

 * @author mabardaji
 */
public class A2Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1=pedirValorUsuario(1);
        double num2 = pedirValorUsuario(2);
        
        double multiplicacion = multiplica(num1,num2);
        System.out.println("la multiplicacion es " + multiplicacion);
    }
    
    public static double multiplica(double a, double b) 
    {
        double calculo = a*b;
        return calculo;
    }
    
    public static double pedirValorUsuario(int num)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon un valor " + num + " : ");
        double valor=sc.nextDouble();
        return valor;
    }
}
