import java.util.Scanner;

public class Ex7DescuentoPorcentaje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double precio,  precio_descontado, precio_100, rebaja;
    /* ENTRADA DATOS */
    System.out.print("Que precio tiene el articulo? ");
    precio = sc.nextDouble();
    System.out.print("Que precio has pagado? ");
    precio_descontado = sc.nextDouble();

    precio_100 = 100*precio_descontado / precio;
    // chivato para ver que voy bien System.out.println("-> " + precio_100);

    rebaja = 100 - precio_100;

    System.out.println("has obtenido un descuento de " + rebaja + "%");


    }
}
