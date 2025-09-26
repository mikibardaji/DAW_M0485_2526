import java.util.Scanner;

public class Ex4 {
    /*
     * 4.	Programa que llegeix un número 
     * i diu si és positiu, 
     * si és zero, o bé i és negatiu.
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("El número és positiu.");
        } 
        else if (num < 0) {
            System.out.println("El número és negatiu.");
        }
        else { //else if (num == 0) 
            System.out.println("El número és zero.");
        } 
    }

}
