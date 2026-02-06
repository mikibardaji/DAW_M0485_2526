/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriastrings;

/**
 *
 * @author mabardaji
 */
public class TeoriaStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Hola que tal";
        char[] arrayFrase = {'Q','u','e','l','o','Q','u','e'};
        String frase2 = new String(arrayFrase);
        System.out.println(frase);
        System.out.println(frase2);    
        //esto en int no lo puedo hacer
        int[] numeros = new int[3];
        //numeros = 321;
        int cont_l=0;
        for (int i = 0; i < frase.length(); i++) {
            //System.out.println(frase[i]); aixo no
            System.out.println(frase.charAt(i));
            if (frase.charAt(i)=='l')
            {
                cont_l++;
            }
        }
        System.out.println("numero de l's : " + cont_l);
    }
    
}
