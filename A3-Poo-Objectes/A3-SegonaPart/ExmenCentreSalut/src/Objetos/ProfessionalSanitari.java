/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public abstract class ProfessionalSanitari extends PersonaCentre{
    protected final int codiColegiat;
    protected double preuVisita;
    Especialitat speciality; /*0,25 pts*/

    public ProfessionalSanitari(int codiColegiat, String nom) {
        super(nom);
        this.codiColegiat = codiColegiat;
        speciality = Especialitat.MEDICINA_GENERAL;
    }

    public ProfessionalSanitari(int codiColegiat, Especialitat speciality, String nom) {
        super(nom);
        this.codiColegiat = codiColegiat;
        this.speciality = speciality;
    }
    
    
    
    
    public abstract double calcularCostVisita();

    @Override
    public String obtenirInformacio() {
        String frase =  super.obtenirInformacio();
        String frase2 = " el preu visita es " + preuVisita;
        return frase + "\n" + frase2;
    }

    public int getCodiColegiat() {
        return codiColegiat;
    }

    public double getPreuVisita() {
        return preuVisita;
    }

    public Especialitat getSpeciality() {
        return speciality;
    }

    public void setPreuVisita(double preuVisita) {
        this.preuVisita = preuVisita;
    }

    public void setSpeciality(Especialitat speciality) {
        this.speciality = speciality;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ProfessionalSanitari)) {
            return false;
        }
        final ProfessionalSanitari other = (ProfessionalSanitari) obj;
        return this.codiColegiat == other.codiColegiat;
    }
    
    
    
    
}
