/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class YearsExperienceException extends Exception 
{
    int anysErronis;

    public YearsExperienceException() {
        super("anys tenen que ser superior a 0");
    }

    public YearsExperienceException(String message) {
        super(message);
    }
    
    public YearsExperienceException(int anysErronis) {
        super("anys incorrectes " + anysErronis);
        this.anysErronis = anysErronis;
    }



    
    
}
