import java.util.Scanner;

public class lista_compra_examen_Gundin_Navarro_Marcos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo; 
        double precio, gasto_acumulado=0;
        int descuento;
        saldo = pedirSaldo();
        
        do
        {
            System.out.println("Pon el precio del producto");
            precio = sc.nextDouble();
            System.out.println("Pon el tipo de descuento ");
            descuento = sc.nextInt();

            precio = subtotalProducto(precio, descuento);
            if (compruebaValor(precio, saldo))
            {

            }
            else
            {
                System.out.println("No tienes dinero");
            }
            gasto_acumulado = sumaFactura(precio, gasto_acumulado);
            saldo -= precio;
            System.out.println("Tu saldo es " + saldo);
        }while(saldo>0);
        
        //pedirSaldo();
        //subtotalProducto(3,2);
        //subtotalProducto(3,1);
        //compruebaValor(2.7,5);
        //compruebaValor(2.7,2.5);
        //sumaFactura(5,10);
    }

    public static double pedirSaldo() {
        Scanner sc = new Scanner(System.in);
        double saldo;
        do{
            System.out.println("Cuanto dinero tines? ");
            saldo = sc.nextDouble();
        }while(saldo <= 0);
        return saldo;
    }
    public static double subtotalProducto(double precio, int tipoDescuento){
        final double DESCUENTO1 = 0.9;
        final double DESCUENTO2 = 0.75;
        if (tipoDescuento == 1) {
            return precio * DESCUENTO1;
        }
        else if (tipoDescuento == 2) {
            return precio * DESCUENTO2;
        }
        else {
            return precio;
        }
    }
    public static boolean compruebaValor(double precio, double saldo){
        return saldo>=precio;
//        if (saldo>=precio) {
//            return true;
//        }
//        else{
//            return false;
//        }
    }
    public static double sumaFactura(double precioProducto, double gastoAcumulado){
        double nuevoTotal = gastoAcumulado + precioProducto;
        System.out.println("precio del prodcuto: " + precioProducto);
        System.out.println("Subtotal acumulado: " + nuevoTotal);
        return nuevoTotal;
    }
}
