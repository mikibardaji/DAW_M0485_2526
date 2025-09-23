import java.util.Scanner;

public class Distancia {

    /*El programa ha de calcular la distància recorreguda 
    a partir del nombre de voltes a una pista d’atletisme 
    (busqueu la distància de la pista per Google).
Primera versió:
Feu el pseudocodi (pot ser en el mateix arxiu Java, bloc de notes, Word o escrit a mà).
A continuació, el vostre intent de codi (encara que no us surti bé).
El programa ha de mostrar la distància recorreguda en metres
Segona versió:
El mateix pero també ha de dir el total de quilòmetres (com a nombre sencer).
Tercera Versio (opcional, només si voleu provar-ho):
El programa ha de preguntar al usuari la distància de cada volta (podrien ser voltes a diferents pistes: coberta, descoberta, o no reglamentària, per tant el usuari potser que digui 350 , o 520, o el que sigue) i després calcular la distància total i els quilòmetres (també com a nombre sencer).
 */
    public static void main(String[] args) {
        /*INTRODUCCIO DADES */
        Scanner sc = new Scanner(System.in);
        int laps;
        //preguntar al usuari voltes que ha fet  (laps)
        //sin ln o sea sin salto de linea solo print
        System.out.print("Cuantas vueltas has dado? ");
        laps = sc.nextInt();
        //Establecer valor vueltas (400 - METRES_LAP)
        final int DISTANCIA_VUELTA=400;
        /* PROCESAR DATOS */
        //Calcular distancia vueltas * distancia
        int distancia = laps * DISTANCIA_VUELTA;

        /*DATOS SALIDA */
        //Mostra usuario
        System.out.println("Has corrido " + distancia + " metros");



    }
}
