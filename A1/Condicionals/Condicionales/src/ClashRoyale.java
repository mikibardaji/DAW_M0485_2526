import java.util.Scanner;

public class ClashRoyale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int copas;
        char opcion;

        System.out.println("CUANTAS COPAS TIENES?");
        copas = sc.nextInt();

       //sc.nextLine(); //limpia buffer
        if (copas<2000)
        {
                System.out.print("Escoge Mago Electrico(M) o Mega Esbirro(E)? ");
                opcion = sc.next().charAt(0);
                 System.out.print("Has escogido ");
               /*Mas LIMPIO solo sirve == */
                switch (opcion) {
                    case 'm':
                    case 'M':
                        System.out.println("mago Electrico");
                        break;
                    case 'e': //entrara en el codigo de la E mayuscula porque no hay break
                    case 'E':
                        System.out.println("Mega Esbirro");
                        break;
                    default:
                        System.out.println("MAL!!!");
                        break;
            }
        }
        else if(copas>=2000 && copas<3000 ) //entre 2000 i 3000
        {
                System.out.print("Escoge Bandida(B) o Cavallero(C)? ");
                opcion = sc.next().charAt(0);
                 System.out.print("Has escogido ");
               
                if (opcion=='B' || opcion=='b')
                {
                    System.out.println("Bandida");
                }
                else if (opcion=='C'|| opcion=='b')
                {
                    System.out.println("Cavallero");
                }
                else
                {
                    System.out.println("MAL!!!");
                }

        }
        else //copas > 30000
        {
                System.out.print("Escoge Gigante Noble(N) o Ejercito Esqueletos(E)? ");
                opcion = sc.next().charAt(0);
                 System.out.print("Has escogido ");
               /*Mas LIMPIO solo sirve == */
                switch (opcion) {
                    case 'N':
                    case 'n':
                        System.out.println("Gigante Noble");
                        break;
                    case 'e': //entrara en el codigo de la E mayuscula porque no hay break
                    case 'E':
                        System.out.println("Ejercito Esqueletos");
                        break;
                    default:
                        System.out.println("MAL!!!");
                        break;
            }

        }
       
    }
}
