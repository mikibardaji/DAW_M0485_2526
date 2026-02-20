/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenexercicis;

/**
 *
 * @author mabardaji
 */
public class ExamenExercicis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] diners = {100,200,500,300,250};
        int pos = mesQuantitat(diners);
        System.out.println("La posicion es " + pos);
        System.out.println("El dinero maximo es "+ diners[pos]);
    }
    
    public static int mesQuantitat(double[] diners)
    {
        double dinersMax = 0;
        double dinerMax=diners[0];
        int posMax = 0;
        for (int i = 0; i < diners.length; i++) {
//            if (diners[i]>dinerMax)
//            {
//                dinerMax = diners[i]; 
//                posMax = i;
//            }
              if(diners[i]>diners[posMax])
              {
                  posMax = i;
              }
        }
        return posMax;
    }
    
}
