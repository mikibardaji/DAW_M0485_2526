/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class NomInvalidException extends Exception {

    public NomInvalidException() {
        super("Nombre no puede ser null ni ser menor de 5 caracteres");
    }

//    public NomInvalidException(String message) {
//        super(message);
//    }

    
}
