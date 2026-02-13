/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

public class Persona {

    private String nom;
    private String dni;

    // Constructor
    public Persona(String nom, String dni) throws InvalidDNIException {
        this.nom = nom;
        setDni(dni); //  validem al setter
    }

    // Getter nom
    public String getNom() {
        return nom;
    }

    // Setter nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter dni
    public String getDni() {
        return dni;
    }

    // Setter dni amb validació
    public void setDni(String dni) throws InvalidDNIException {

        if (dni.length() != 9) {
            throw new InvalidDNIException("El DNI ha de tenir 9 caràcters.");
        }

        String soloNumeros = dni.substring(0, 8);
        
        char lletra = Character.toUpperCase(dni.charAt(8));

        float numero;

        try {
            numero = Float.parseFloat(soloNumeros);
        } catch (NumberFormatException e) {
            throw new InvalidDNIException("Les primeres8 posicions no son numeriques");
        }
        
        
        int posic = (int) numero%23;
        
        String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";
        switch(posic)
        {
            case 0:
                if (lletra != 'T')
                {
                    throw new InvalidDNIException("La lletra del DNI no és correcta.");        
                }
                break;
            case 1:
                if (lletra != 'R')
                {
                    throw new InvalidDNIException("La lletra del DNI no és correcta.");        
                }
                break;
             case 2:
                if (lletra != 'W')
                {
                    throw new InvalidDNIException("La lletra del DNI no és correcta.");        
                }
                break;           
        }          

        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{nom='" + nom + "', dni='" + dni + "'}";
    }
}

