/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriapooherencia;

import Objetos.Alumno;
import Objetos.Persona;
import Objetos.Profesor;

/**
 *
 * @author mabardaji
 */
public class TeoriaPooHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona people = new Persona("MA", "ID1", 43720180);
        Alumno student = new Alumno("AW", "ID2", 606606606, 1);
        System.out.println("DNI persona " +people.getDNI());
        student.setCiclo("DAW");
        student.setNota(7.5);
        student.setN_exp(1);
        System.out.println("Nota " + student.getNota());
        System.out.println("DNI alumne " + student.getDNI());
        
        Profesor teacher = new Profesor( "Pepe", "ID3", 606606260, 1, "Informatica", "M0485");
        System.out.println("-->" + teacher.getDepartamento());
        System.out.println("-->" + teacher.getDNI());
        
        teacher.mostrarCaracteristicas();
        student.mostrarCaracteristicas();
        people.mostrarCaracteristicas();
        
        teacher.saludar();
        student.saludar();
        people.saludar();
        teacher.adios();
        student.adios();
        people.adios();
        
    }
    
}
