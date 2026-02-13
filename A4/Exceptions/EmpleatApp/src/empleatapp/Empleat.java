/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleatapp;

/**
 *
 * @author mabardaji
 */
public class Empleat {

    private String name;
    private double salari;
    private String departament;

    public static final double SMI = 1080;



    // Constructor per defecte
    public Empleat() {
        this.name = "Desconegut";
        this.salari = SMI;
        this.departament = "Informatica";
    }

    // Constructor amb paràmetres
    public Empleat(String name, double salari, String departament) throws SalariInvalidException, DepartamentInvalidException {
        this.name = name;
        setSalari(salari);
        setDepartament(departament);
    }

    // Constructor còpia
    public Empleat(Empleat e) {
        this.name = e.name;
        this.salari = e.salari;
        this.departament = e.departament;
    }

    // Getters i Setters amb validació
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) throws SalariInvalidException {
        if (salari < SMI) {
            throw new SalariInvalidException("El salari mínim interprofessional ha de ser superior a " + SMI);
        }
        this.salari = salari;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) throws DepartamentInvalidException {
        if (!departament.equalsIgnoreCase("informatica")
                && !departament.equalsIgnoreCase("Direccio")
                && !departament.equalsIgnoreCase("Comercial"))
        {
            throw new DepartamentInvalidException("El departament \"" + departament + "\" no és un dels departaments vàlids.");
        }
        else
        {
            this.departament = departament;
        }
        
    }

    // Mètode salariMes
    public double salariMes(int numeroPagues) throws ArithmeticException, IllegalArgumentException {
        
            if (numeroPagues < 0) {
                throw new IllegalArgumentException("El número de pagues ha de ser positiu.");
            }
            return salari / numeroPagues;
         
    }

    @Override
    public String toString() {
        return "Empleat{" +
                "name='" + name + '\'' +
                ", salari=" + salari +
                ", departament='" + departament + '\'' +
                '}';
    }
}
