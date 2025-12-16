package Objetos;

public class obstacle {
    private final String nom;
    private final int penalitzacio;
    private static int contadorObstacles = 0;

    public obstacle(String nom, int penalitzacio){
        this.nom = nom;
        this.penalitzacio = penalitzacio;
        contadorObstacles++;
    }
    //getter
    public String getNom(){
        return nom;
    }
    public int getPenalitzacio(){
        return penalitzacio;
    }
    public static int getContadorObstacles(){ //no hauria de ser static
        return contadorObstacles; //si no ho demana el enunciat
    }
    public void aplicarObstacle(vehicle v){
        v.reduirVelocitat(penalitzacio);
        System.out.println("El vehicle " + v.getNom() + " s'ha topat am l'obstacle " + nom + " i ha patit una penalització de: " + penalitzacio);
    }
}
