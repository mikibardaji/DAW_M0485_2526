import java.util.Scanner;

public class Ex12Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char colorsemaforo;
        System.out.println("Introduce el color del semaforo (R-Rojo, N-Naranja, V-verde): ");
        colorsemaforo= sc.nextLine().charAt(0);

        //sustituir if (cond == con1)
       switch(colorsemaforo)
        {
            case 'v': //como no hay break ejecuta las lineas de debajo
            case 'V':
                System.out.println("Puedes pasar");
                break;
            case 'n': //como no hay break ejecuta las lineas de debajo            
            case 'N':
                System.out.println("Precaución");
                break;
            case 'r': //como no hay break ejecuta las lineas de debajo            
            case 'R':
                System.out.println("Stop");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
}
