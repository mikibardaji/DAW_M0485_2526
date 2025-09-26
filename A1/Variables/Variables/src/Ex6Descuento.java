import java.util.Scanner;

public class Ex6Descuento{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double precio, descuento, total_descuento, precio_descontado;
    /* ENTRADA DATOS */
    System.out.print("Que precio tiene el articulo? ");
    precio = sc.nextDouble();
    System.out.print("Que descuento tienes? ");
    descuento = sc.nextDouble();

    /* PROCESO DATOS */
    total_descuento = precio * descuento /100;
    precio_descontado = precio - total_descuento;

    /* SALIDA DATOS */
    System.out.println("Tu precio rebajado serà " + precio_descontado);


}


}