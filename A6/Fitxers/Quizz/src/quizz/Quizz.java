/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz;

import PersistenciaFicheros.LineReadFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class Quizz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            LineReadFile pregunta = new LineReadFile("Preguntas\\pregunta1.txt");
            
            String linea = pregunta.readLineFromFile();
            String respuestaCorrecta="";
            while (linea!=null)
            {
                if (linea.endsWith("*"))
                {
                    
                    /*el string linea se recorte a sin asterisco*/
                    /* recortando el string */
                    /*reemplanzando * por nada*/
                    linea = linea.substring(0, linea.length()-1);
                    //guardeis esta respuesta en una variable
                    //que guardara la opcion correcta 
                    respuestaCorrecta = linea;
                }
                System.out.println(linea);
               
                linea = pregunta.readLineFromFile();
            }
            /* otra manera de leerlo
            do
            {
                linea = pregunta.readLineFromFile();
                if (linea!= null)
                {
                    System.out.println(linea);
                }
            }while(linea!=null);*/
            pregunta.tancarFitxers();

            Scanner sc = new Scanner(System.in);
            System.out.println("Cual es la respuesta correcta");
            String respuestaUsuario = sc.nextLine();
            
            //comprueba si la respuesta es correcta
            if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta))
            {
                System.out.println("Has acertado");
            }
            else
            {
                System.out.println("Has fallado la respuesta correcta era "
                + respuestaCorrecta);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Quizz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Quizz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
