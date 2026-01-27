/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaarrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notasModulo485; //[] las llaves indican que esto sera un array
        int notasModulo485_1; //un entero . no es array 
        notasModulo485 = new int[6]; 
        ponerNotas(notasModulo485);

        //System.out.println(notasModulo485.toString());
        mostrarArray(notasModulo485);
        //calcular la media de mis notas
        
        calcularMedia(notasModulo485);
        System.out.println("En junio tendras " + 
                detectarCuantasRasSuspendidas(notasModulo485) + " a recuperar");
        
        System.out.println("Excelentes que has sacado " 
                + contarExcelentes(notasModulo485));
        if (recuperacionJunio(notasModulo485))
        {
            System.out.println("Tienes que ir a Junio");
        }
        else
        {
            System.out.println("Vacaciones");
        }
        
        ;
        System.out.println("has sacado " +consultarNotaRa(notasModulo485) );
    }

    /* pregunte las notas al usuario y las introduzca*/
    private static void ponerNotas(int[] notasModulo485) {
        //tengo que preguntar al usuario
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //y cada nota ponerla en una nueva posicion del array
        //empezare por la posición 0
        for (int i = 0; i < notasModulo485.length; i++) {
            //System.out.print("Pon la nota " + (i+1) + " : ");
            //notasModulo485[i] = sc.nextInt();
            notasModulo485[i] = rd.nextInt(0, 11);
        }
        /*notasModulo485[0] = 4;
        notasModulo485[1] = 10;
        notasModulo485[2] = 6;
        notasModulo485[3] = 8;
        notasModulo485[4] = 2;
        notasModulo485[5] = 9;*/
    }
    
    private static void mostrarArray(int[] notas)
    {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("En la posicion " + i
            + " tienes un " + notas[i]);
        }
    }

    /*
    recorrer todo el array y guardar la psoicon en una acumulativa
    y al final dividirla
    */
    private static void calcularMedia(int[] notas) {
        int notas_acum=0;
        for (int i = 0; i < notas.length; i++) {
            //notas[i]
            notas_acum += notas[i]; //notas_acum = notas_acum + notas[i] 
        }
        System.out.println("Total " + notas_acum);
        double media = (double) notas_acum / notas.length;
        System.out.println("tu media es " + media);
    }

    /**
     * recorrer todas las notas y detectar cuantas
     * has suspendido y decir cuantas ra's tienes suspendidas
     * @param notasModulo485 
     */
    private static int detectarCuantasRasSuspendidas(int[] notasModulo485) 
    {
        int contRaSuspendidas=0;
        for (int indice = 0; indice < notasModulo485.length; indice++) 
        {
            if (notasModulo485[indice]<5)
            { //si entro esta suspendida
                contRaSuspendidas++; //contador
            }   
        }
        //muestro frase si es void
        return contRaSuspendidas;
    }

    private static int contarExcelentes(int[] notasModulo485) {
         int contExcelentes=0;
         for (int i = 0; i < notasModulo485.length; i++) {
             if (notasModulo485[i]>=9)
            { //si entro esta suspendida
                contExcelentes++; //contador
                //chivato boolean true
                //acumulativa = acumulativa +/-/*// posicion
            }  
        }
        return contExcelentes;
    }

    /**
     * detecta si hay alguna nota suspendida
     * Sin importar si hay mas de una
     * @param notasModulo485
     * @return true si tienes alguna nota suspendida
     */
    private static boolean recuperacionJunio(int[] notasModulo485) {
        int ra=0; //indice
        boolean suspendido = false;
        
        for (int i = 0; i < notasModulo485.length; i++) 
        {
            if (notasModulo485[ra]<5)
            {
                suspendido = true;
                i = notasModulo485.length; //para que salga for sino break
            }
        }
        
        
        do
        {
            if (notasModulo485[ra]<5)
            {
                suspendido = true;
            }
            else
            { //si no encontrador
                ra++;
            }     
        /*}while(ra<notasModulo485.length
                && suspendido ==false);*/
        }while(ra<notasModulo485.length
                && !suspendido);
        /*if (suspendido==true)
        {
            return true;
        }*/
        return suspendido;
    }

    /**
     * Te tiene que preguntar (scanner) que ra quieres saber (posicion)
     * y devolverte la nota
     * @param notasModulo485
     * @return nota del ra consultad
     */
    private static int consultarNotaRa(int[] notasModulo485) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que ra quieres saber la nota");
        int ra = sc.nextInt(); //posicion dentro del array
        //return notasModulo485[ra]; 
        return notasModulo485[ra-1]; 
    }
}
