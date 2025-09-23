import java.util.Scanner;

public class Cambio {

    public static void main(String[] args) {
        /* Enunciadoun programa para saber cuanto dinero me va a sobrar
        si compro un articulo. */
        //scnner
        Scanner lectorTeclado = new Scanner(System.in);
        //variable para dinero que tengo
        //variabe para el precio
        double dinero, precio;
        //preguntar al usuario el dinero que tengo
        System.out.println("pon el dinero que tienes: ");
        dinero = lectorTeclado.nextDouble();
        //preguntar al usuario el precio
        System.out.println("Pon el precio del articulo");
        precio  = lectorTeclado.nextDouble();
        //restar dinero que tengo del precio (cambio)
        double cambio = dinero - precio;
        //mostrar el cambio
        System.out.println("Te quedara " + cambio + " euros. ");
    }
}
