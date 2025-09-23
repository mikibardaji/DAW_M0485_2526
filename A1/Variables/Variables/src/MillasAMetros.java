import java.util.Scanner;

public class MillasAMetros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MILLAS_METRO = 1609;
        System.out.print("Cuantas millas has recorrido? ");
        double millas = sc.nextDouble();

        double metros = millas *MILLAS_METRO;

        System.out.println("En metros es " + metros);


    }
}
