/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mabardaji
 */
public class VistaGUI extends JFrame{
    //declaració de tots els components Importants 
    //importants: que tinguin que fer alguna acció
    
    
    public VistaGUI(String title) throws HeadlessException {
        super(title);
        atributosVentana();
        marcarLayoutComponentes();
        //opcional hacerlo visible
        this.setVisible(true);
    }

    private void atributosVentana() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300, 500);
        this.setLocationRelativeTo(null);
    }

    private void marcarLayoutComponentes() {
        Container contenidorPrincipal = this.getContentPane();
        contenidorPrincipal.setLayout(new GridLayout(3, 5));
        for (int i = 1; i <= 15; i++) {
            contenidorPrincipal.add(new JButton("Botó " + i));
        }
    }
}
