import java.util.Scanner;

public class Distancia3 {

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
El programa ha de preguntar al usuari la distància de cada volta 
(podrien ser voltes a diferents pistes: coberta, descoberta, o no reglamentària

 */
    public static void main(String[] args) {
        /*INTRODUCCIO DADES */
        //Establecer valor vueltas (400 - METRES_LAP)
        int distanciaVuelta;
        final int METROS_KM = 1000;
        Scanner sc = new Scanner(System.in);
        int laps;
        //preguntar al usuari voltes que ha fet  (laps)
        //sin ln o sea sin salto de linea solo print
        System.out.print("Cuantas vueltas has dado? ");
        laps = sc.nextInt();
        System.out.print("Cuanto media la pista? ");
        distanciaVuelta = sc.nextInt();
        /* PROCESAR DATOS */
        //Calcular distancia vueltas * distancia
        int distancia = laps * distanciaVuelta; //metros
        //calcular los km enteros /1000
        int km = distancia /METROS_KM;
        int metrosSobrantes = distancia% METROS_KM; //residuo
        /*DATOS SALIDA */
        //Mostra usuario
        System.out.println("Has corrido " + distancia + " metros");
        System.out.println("Son -> " + km + "  km y " + metrosSobrantes + " metros");

    }
}
