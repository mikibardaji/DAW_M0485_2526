import java.util.Scanner;

public class DAWBIOPracticaEx2Medicaments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el teu pes en kg: ");
        int pes = sc.nextInt();

        System.out.println("Selecciona el medicament:");
        System.out.println("Ibuprofeno(I)");
        System.out.println("Xarelto(X)");
        System.out.println("Amoxicilina");
        System.out.println("Fluoxetina");
        char medicament = sc.next().charAt(0);

        System.out.print("Amb el pes de " + pes + "kg ha de prendre ");


        switch (medicament) {
            case 'i':
            case 'I':
                if (pes < 70) {
                    System.out.println("500mg de Ibuprofeno");
                } else {
                    System.out.println("1g de Ibuprofeno");
                }
                break;
            case 'x':
            case 'X':
                 if (pes < 60) {
                System.out.println("10mg de Xarelto");
                } else if (pes <= 80) {
                    System.out.println("15mg de Xarelto");
                } else {
                    System.out.println("20mg de Xarelto");
                }
                break;
            case 'a':
            case 'A':
                 if (pes < 65) {
                        System.out.println("500mg de Amoxicilina");
                    } else {
                        System.out.println("1g de Amoxicilina");
                    }
                break;
            case 'F':
            case 'f':
                if (pes < 80) {
                    System.out.println("20mg de Fluoxetina");
                } else {
                    System.out.println("40mg de Fluoxetina");
                }
            default:
                System.out.println("un medicament desconegut");
                break;
        }
    }
}
