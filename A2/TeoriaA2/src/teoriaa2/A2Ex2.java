/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaa2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class A2Ex2 {

    /**
     * Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
        o no. Implementa y utiliza la función:
        boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
     */
    public static void main(String[] args) {
        int edad;
        edad = preguntarEdadValida();
        boolean mayor = esMayorDeEdad(edad);
        mostrarResultado(mayor);
    }
    
    public static void mostrarResultado(boolean mayor)
    {
        if (mayor)
        {
            System.out.println("Eres mayor de edad");
        }
        else
        {
            System.out.println("Eres menor de edad");
        }
    }
    
    
    public static boolean esMayorDeEdad(int age){
        if (age >= 18){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Pregunta la edad y hasta que no es valida la sigue preguntando
     * @return edad positiva
     */
    public static int preguntarEdadValida(){
        Scanner sc = new Scanner(System.in);
        int user_age;
        do
        {
            System.out.print("how old are you? ");
            user_age = sc.nextInt();
        }while(user_age<=0);
        sc.close();
        return user_age;
    }
}
