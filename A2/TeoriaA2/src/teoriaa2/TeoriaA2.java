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
public class TeoriaA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            holaMundo();
        }
        
        int calculo;
//        calculo = triple(5);
//        System.out.println("El triple es " + calculo);
        
        for (int i = 1; i <= 10; i++) {
            calculo = triple(i);
            System.out.println("El triple de "+ i + " es " + calculo);
        }
        
        
        int numero = pideNumeroUsuario();
        
        calculo = triple(numero);
        System.out.println("Su triple es " + calculo);
        
    }
    
    
    /**
     * Imprime la frase Hola Mundo
     */
    public static void holaMundo()
    { //mopstrar resultats
      //mostrar la part d'un programa  
        System.out.println("Hello World!!!!");
    }
    
    /**
     * retorna el triple de un numero
     * @param num numero que quiere encontrar triple
     * @return el triple del numero de entrada
     */
    public static int triple(int num)
    { //retornen coses normalment no tindran souts 
        int result = num * 3;
        return result;
//        return (num*3); es el mateix
    }
    
    /**
     * pide un valor entero al usuario 
     * @return el valor entero siempre que sea positivo
     */
    public static int pideNumeroUsuario()
    {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            System.out.print("Pon un numero y te dire el triple: ");
            numero = sc.nextInt();
        }while(numero<= 0);
        return numero;
    }
    
}
