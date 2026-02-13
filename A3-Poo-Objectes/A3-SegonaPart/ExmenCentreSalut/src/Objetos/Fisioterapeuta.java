/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Fisioterapeuta extends ProfessionalSanitari {
    private int sessionsProgramades;

    public Fisioterapeuta(int codiColegiat, String nom) {
        super(codiColegiat, nom);
        speciality = Especialitat.FISIOTERAPIA;
        preuVisita = 15;
    }

    public Fisioterapeuta(int sessionsProgramades, int codiColegiat,  String nom) {
        super(codiColegiat, Especialitat.FISIOTERAPIA, nom);
        this.sessionsProgramades = sessionsProgramades;
        preuVisita = 15;
    }

    @Override
    public double calcularCostVisita() {
        if (sessionsProgramades>10)
        {
            return (preuVisita*sessionsProgramades*0.9);
        }
        else
        {
            return preuVisita*sessionsProgramades;
        }
    }

    public int getSessionsProgramades() {
        return sessionsProgramades;
    }

    public void setSessionsProgramades(int sessionsProgramades) throws SesionsMinimesException {
        if (sessionsProgramades<5)
        {
            this.sessionsProgramades = 5;
            throw new SesionsMinimesException();
        }
        this.sessionsProgramades = sessionsProgramades;
    }


    
    
    
}
