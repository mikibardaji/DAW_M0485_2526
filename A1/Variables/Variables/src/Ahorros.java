import java.util.Scanner;

public class Ahorros {
    


    public static void main(String[] args) {
        /* Enunciado: tiene qe saber cuantas monedas tienes de (50 centimos)
        y decirte cuanto has ahorrado */
        Scanner lectorTeclado = new Scanner(System.in);
        int monedas;
        final double VALOR_MONEDAS_50 = 0.50;
        //Contar monedas(Usuario)
        System.out.println("Cuantas monedas has contado? ");
        monedas = lectorTeclado.nextInt();
        //multiplicar monedas por 0,50 (ahorro)
        double ahorro = monedas * VALOR_MONEDAS_50;
        //dar el resultado
        System.out.println("tienes ahorrado " + ahorro);
    }
}
