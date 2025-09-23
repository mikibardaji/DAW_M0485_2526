import java.util.Scanner;

public class GradosFarenheit {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*ENTRADA DATOS */
        //Pedir grados Farenheit
        System.out.print("Pon los graos en farenheit y los pasare a celsius? ");
        int GradosFarenheit = teclado.nextInt();
        System.out.println("->" + GradosFarenheit);
        //calcular (F-32)* 5/9
        int GradosCelsius1= GradosFarenheit-32;
        int GradosCelsius2 = GradosCelsius1 * 5;
        double gradosCelsius = (double) GradosCelsius2/9;

        //mostrar resultado
        System.out.println(gradosCelsius + "º C");
    }
}
