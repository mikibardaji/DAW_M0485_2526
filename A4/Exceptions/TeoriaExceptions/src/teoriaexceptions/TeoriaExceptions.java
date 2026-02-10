/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //salirLimites();
        //ExceptionEntradaDatos();
        //ExceptionAritmetica();
        //ExceptionArrayPosition6();
        Scanner sc = new Scanner(System.in);
        System.out.println("pon tu edad");
        int edad=sc.nextInt();
        
        try
        {
        System.out.println("Puedes entrar? " + puedesEntrarDiscoteca(edad));   
        }catch(Exception ex)
        {
            System.out.println("No he podido determinar tu edad");
            System.out.println(ex.getMessage());
        }
        
    }

    private static void ExceptionAritmetica() {
        Scanner sc  = new Scanner(System.in);
        
        int a = 8, b, c=0;
        System.out.println("Pon el divisor");
        try
        {
            b = sc.nextInt(); //lanza exception
            c = a/b;
        }
        catch(ArithmeticException ex)
        {//quant divideixi per 0
            System.out.println("No se puede dividir por 0" + ex.getMessage());
            c = 0; 
        }
        catch(InputMismatchException xx)
        { //sc.nextInt() no has puesto un entero
            System.out.println("No has introducido un entero" + xx.getMessage());
            b=1;
            c = a/b;
        }
        catch(Exception ex) // se captura aquí y lo guardo en la variable ex
        { //al final la mes generica, perque si esta abans es menjaria 
            //als altres
            System.out.println("Se ha producido un error no controlado");
            System.out.println("Mensaje " + ex.getMessage());
        }
        
        System.out.println("El resultat divisio es " + c);
    }

    private static void ExceptionEntradaDatos() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Pon un numero");
        int num = sc.nextInt();
        
        int aumentar = num +2;
        System.out.println("El valor aumentado en 2 es " + aumentar );
               
    }

    private static void salirLimites() {
        int[] numeros = {1,2,3,4};
                
        for (int i = 0; i < 10; i++) {
            System.out.println("En la posicion " + i + 
                    " hay el valor " + numeros[i]);
        }
    }

    private static void ExceptionArrayPosition6() {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];
        
        for (int i = 0; i < 6; i++) {
            try
            {
            System.out.println("Pon el valor de posicion " + i);
            numeros[i] = sc.nextDouble();
            }
            catch(ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Posicion " + i + "no existe en el array");
                //no informo res més
            }
            catch(InputMismatchException ex)
            {
                System.out.println("Solo quiero numeros con decimales");
                i--; //para que vuelva a pedir la misma posición
                sc.nextLine();
            }
            
        }
    }

    private static boolean puedesEntrarDiscoteca(int edad) throws Exception{
        if (edad>=18)
            return true;
        else if (edad<18 && edad>=0)
            return false;
        //caso negativo, no es una respuesta correcta
        throw new Exception("Edad introducida no valida: " + edad);
        
    }
    
}
