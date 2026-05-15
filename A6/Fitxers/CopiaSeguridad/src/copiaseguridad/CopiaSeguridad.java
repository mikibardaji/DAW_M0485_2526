/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiaseguridad;

import PersistenciaFicheros.CharReadFile;
import PersistenciaFicheros.CharWriteFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class CopiaSeguridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CharReadFile entrada=null;
        CharWriteFile salida;
        int contadorC = 0;
        try {
            entrada = new CharReadFile("files\\entrada.txt");
            salida = new CharWriteFile("files\\backup2.txt");
            
            int cod_ascii;
            do
            {
                cod_ascii = entrada.LlegirCaracterFitxer();
                char letra = (char) cod_ascii;
                if (cod_ascii!=-1)
                {
                    if (letra != '\n') //el return no quiero cambiarlo
                        cod_ascii++; //cambio a la letra a la siguiente
                    contadorC++;
                    salida.EscribirCaracter(cod_ascii);
                }
            }while(cod_ascii!=-1);
            System.out.println("fichero copiado he copiado " 
                    + contadorC + " caracteres");
            entrada.tancarFitxers();
            salida.tancarFitxers();
        }  catch (FileNotFoundException ex) {
            System.err.println("Fitxer no existeix" + ex.getMessage());
            //System.out.println("Ruta " + entrada.getArchivo().getName());
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.getMessage());
        }
       
    }
    
}
