/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package llibreries;

import java.util.Scanner;

/**
 * funcions utiles para pedir diferentes datos al usuario
 * 
 * 
 * @author mabardaji
 */
public class PedirDatosUsuario {
    
    /**
     * funcion que devuelve solo el valor introducido por el usuario siempre que sea positivo
     * @param frase String que se mostrara al usuario
     * @return valor positivo
     */
    public static int pedirDatoPositivo(String frase)
    {
        int valor;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println(frase);
            valor = sc.nextInt();
        }while(valor<0);
        return valor;
    }
    
    public static char pedirLetra(String frase)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        char letra = sc.next().charAt(0);
        return letra;
    }
    
    /**
     * Te pide un dato y devuelve el valor siempre que este entre el minimo 
     * y el maximo indicado 
     * @return 
     */
    
    public static int pedirDatoEntreIntervalo(int min, int max)
    {
        Scanner sc = new Scanner(System.in);
        int cambio;
//        if (min>max)
//        {
//            cambio = min;
//            min = max;
//            max = cambio;
//        }
        
        
        int valor;
        do
        {
            System.out.println("Pon un valor entre " + min + " y " + max);
            valor = sc.nextInt();
        }while (valor<min || valor>max);
                
        return valor;
    }
    
    
}
