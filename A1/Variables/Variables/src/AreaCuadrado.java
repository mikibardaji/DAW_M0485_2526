import java.util.Scanner;

public class AreaCuadrado {

    /*2.	Programa que calcula l'àrea d'un quadrat 
    el costat del qual s'introdueix per teclat. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Preguntar medida lado
        System.out.print("Cuanto mide el lado del cuadrado? ");
        double lado = sc.nextDouble();
        //calcular area cuadrado (lado*lado)
        double area = lado * lado;

        //mostrar area
        System.out.println("El area del cuadrado es " + area);


    }
}
