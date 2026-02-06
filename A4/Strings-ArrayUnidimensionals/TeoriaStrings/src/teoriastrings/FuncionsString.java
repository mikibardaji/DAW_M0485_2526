/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriastrings;

/**
 *
 * @author mabardaji
 */
public class FuncionsString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase = "Hola";
       String frase2 = "AHola2 Hola Hola";
        System.out.println("compareTo " + frase.compareToIgnoreCase(frase2));
        if (frase.equalsIgnoreCase(frase2)) //IMPORTANT 
        {
            System.out.println("Son iguals");
        }
        else
        {
            System.out.println("No son iguals");
        }
        System.out.println(frase2.toLowerCase()); //IMPORTANT
        System.out.println(frase2.toUpperCase()); //IMPORTANT
        //si empieza
        if (frase2.startsWith("AH")) //IMPORTANT 
        {
            System.out.println("empieza por AH");
        }
        else
        {
            System.out.println("no empieza");
        }
        
        String reemplazada = frase2.replaceAll("Hola", "a"); //IMPORTANT
        System.out.println(reemplazada);
        String fraseFichero = "1000,200,3000,5000,6000";
        //split separa per el caracter digue
        String[] numeros = fraseFichero.split(",");
        for (String number : numeros) { //foreach amb arrays Objects
            System.out.println(number);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        frase2 = "  sdsfdfdlwdfk dfkldfk dfñdf   ";
        frase = frase2.trim();
        System.out.println("." + frase2 + ".");
        System.out.println("." + frase + ".");
        
        String retallat = frase2.substring(4, 10);
        System.out.println(retallat); //important
        System.out.println("la primera k esta a " + frase2.indexOf("k"));
        

        
    }
    
}
