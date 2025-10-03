import java.util.Scanner;

public class DAWBIOPracticaEx3Entrades {
    public static void main(String[] args) {
        final double PREU_ENTRADA = 50.0;  // Exemple: 50 euros per entrada
        final double IVA = 21.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el nombre d'entrades que vols comprar: ");
        int nEntrades = sc.nextInt();

        double preuBase = 0;

        if (nEntrades == 1) {
            // Sense descompte
            preuBase = PREU_ENTRADA;
        } else if (nEntrades == 2) {
            // 10% de descompte a la segona entrada
            double descuento = PREU_ENTRADA * 0.1;
            preuBase = PREU_ENTRADA + (PREU_ENTRADA - descuento);
        } else if (nEntrades > 2) {
            // 5% de descompte a totes les entrades
           /* double descuento = nEntrades * PREU_ENTRADA * 0.05;
            preuBase = nEntrades * PREU_ENTRADA - descuento;*/ 
            preuBase = nEntrades * PREU_ENTRADA * 0.95;
        } else {
            System.out.println("Nombre d'entrades invàlid");

            return;
        }

        double iva_total = preuBase * IVA/100;
        double precio_total = preuBase + iva_total;
        System.out.println("Has comprat " + nEntrades + " entrades.");
        System.out.println("Preu base   : "+ preuBase+ " euros");
        System.out.println("IVA         : "+ iva_total+ " euros");
        System.out.println("Total       : "+ precio_total+ " euros");
               
    }
}
