import java.util.Scanner;

public class Ex13Moneda {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double DOLAR_EURO = 1.17; //constante
        final double YENES_EURO = 163.89;
        final double DIRHAM_EURO = 10.63;
        double cambio;
        //ENTRADA DATOS
        System.out.println("Cuantos euros tienes?");
        double euros = lector.nextDouble();
        //IMPRIMO MENU
        System.out.println("Cambio Divisas");
        System.out.println("1- Dolares");
        System.out.println("2- Yenes");
        System.out.println("3- Dirham");
        System.out.println("Que moneda quieres?");
        int moneda = lector.nextInt(); 
        
        switch (moneda) {
            case 1:
                cambio = euros *  DOLAR_EURO;
                System.out.println(euros + " euros son " + cambio + " dolares");
                break;
            case 2:
                cambio = euros * YENES_EURO;
                System.out.println(euros + " euros son " + cambio + " yenes");
                break;
            case 3:
                cambio = euros * DIRHAM_EURO;
                System.out.println(euros + " euros son " + cambio + " dirham");
            default:
                System.out.println("opcion incorrecta");
                break;
        }

        if (moneda==1) //dolares
        { //1,17
           cambio = euros *  DOLAR_EURO;
           System.out.println(euros + " euros son " + cambio + " dolares");
        }
        else if (moneda==2)
        { //yenes
            cambio = euros * YENES_EURO;
            System.out.println(euros + " euros son " + cambio + " yenes");
        }
        else if (moneda ==3)
        { //yenes
            cambio = euros * DIRHAM_EURO;
            System.out.println(euros + " euros son " + cambio + " dirham");
        }
        else
        {
            System.out.println("opcion incorrecta");
        }


    }
}
