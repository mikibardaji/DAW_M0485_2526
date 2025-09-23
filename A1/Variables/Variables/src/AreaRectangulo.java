import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Fase entradadatos
         */
        System.out.print("cuanto mide la base? ");
        double base = sc.nextDouble();
        System.out.print("Cuanto mide la altura? ");
        double altura = sc.nextDouble();
        //System.out.println(base + " - " + altura);
        /*
         * PROCESAR DATOS
         */
        double area = base * altura;
        /*
         * MOSTRAR RESULTADOS
         */
        System.out.println("El area del rectangulo es " + area);

    }
}
