package Objetos;

import java.util.Random;

public class vehicle {
    private final String nom;
    private final int velocitatInicial;
    private double combustible;
    private double velocitatActual;
    private int turbosRestant;
    private double distaciaRecorreguda;

    //constructor
    public vehicle(String nom, int velocitatInicial, int combustible) {
        this.nom = nom;
        this.velocitatInicial = velocitatInicial;
        this.combustible = combustible;

       this.velocitatActual = velocitatInicial;
       Random rd = new Random();
       this.turbosRestant = rd.nextInt(1,4);
        this.distaciaRecorreguda = 0;   
    }
    //getters
    public String getNom(){
        return nom;
    }
    public int getVelocitatIncial(){
        return velocitatInicial;
    }
    public double getCombustible(){
        return combustible;
    }
    public double getVelocitatActual(){
        return velocitatActual;
    }
    public int getTutbosRestant(){
        return turbosRestant;
    }
    public double getdistanciaRecorreguda(){
        return distaciaRecorreguda;
    }

    //acelerar
    public boolean acelerar(){
        if (turbosRestant > 0){
            velocitatActual += velocitatInicial;
            turbosRestant--;
            return true;
        }
        return false;
    }

    //reduirVelocitat (int penalització)
    public void reduirVelocitat (int penalitzacio){
        velocitatActual -= penalitzacio;
        if (velocitatActual < 0) {
            velocitatActual = 0;
        }
    }
    //ferCursa():
    public boolean ferCursa(){
        distaciaRecorreguda += velocitatActual;
        combustible -= velocitatActual / 13;
        return combustible > 0;
    }
    //mostrar estat (falta acabar)
    public void mostrarEstat(){
        System.out.println("El vehicle " + nom + " porta " + distaciaRecorreguda + " metres i li queda " + combustible + "  litres de distancia");
    }
    public static void compararDistancia(vehicle a, vehicle b){
        if (a.getdistanciaRecorreguda() > b.getdistanciaRecorreguda()){
            double diferencia = a.getdistanciaRecorreguda() - b.getdistanciaRecorreguda();
            System.out.println("El vehicle " + a.nom + " porta " + diferencia + "meteres d'avantatge");
        }
        else if (b.getdistanciaRecorreguda() > a.getdistanciaRecorreguda()) {

        double diferencia = b.getdistanciaRecorreguda() - a.getdistanciaRecorreguda();
        System.out.println("El vehicle " + b.nom + " porta " + diferencia + "meteres d'avantatge");
        }
        else{
            System.out.println("Els vehicles estan empatats.");
        }
    }

}
