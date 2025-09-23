import java.util.Scanner;

public class Distancia2 {
 /*El programa ha de calcular la distància recorreguda 
    a partir del nombre de voltes a una pista d’atletisme 
    (busqueu la distància de la pista per Google).
Primera versió:
Feu el pseudocodi (pot ser en el mateix arxiu Java, bloc de notes, Word o escrit a mà).
A continuació, el vostre intent de codi (encara que no us surti bé).
El programa ha de mostrar la distància recorreguda en metres
Segona versió:
El mateix pero també ha de dir el total de quilòmetres (com a nombre sencer).

 */
    public static void main(String[] args) {
        /*INTRODUCCIO DADES */
        //Establecer valor vueltas (400 - METRES_LAP)
        final int DISTANCIA_VUELTA=400;
        final int METROS_KM = 1000;
        Scanner sc = new Scanner(System.in);
        int laps;
        //preguntar al usuari voltes que ha fet  (laps)
        //sin ln o sea sin salto de linea solo print
        System.out.print("Cuantas vueltas has dado? ");
        laps = sc.nextInt();

        /* PROCESAR DATOS */
        //Calcular distancia vueltas * distancia
        int distancia = laps * DISTANCIA_VUELTA; //metros
        //calcular los km enteros /1000
        int km = distancia /METROS_KM;
        int metrosSobrantes = distancia% METROS_KM; //residuo
        /*DATOS SALIDA */
        //Mostra usuario
        System.out.println("Has corrido " + distancia + " metros");
        System.out.println("Km -> " + km + " y " + metrosSobrantes + " metros");

    }

}

