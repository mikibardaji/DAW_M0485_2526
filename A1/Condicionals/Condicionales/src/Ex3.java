import java.util.Scanner;

public class Ex3 {
    /*
     * •	Pedir valor1, valor2
    •	Si valor1> valor2
    o	Imprime Valor1
    •	Sino
    o	Imprime valor2
    * 
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introdueix el segon número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) { //true num1> num2
            System.out.println("El número més gran és: " + num1);
        } else if (num1 < num2) { //true num1 < num2 --- num2>num1
            System.out.println("El número més gran és: " + num2);
        } else if (num1 == num2) {
            System.out.println("Els dos números són iguals.");
        }
     }
}
