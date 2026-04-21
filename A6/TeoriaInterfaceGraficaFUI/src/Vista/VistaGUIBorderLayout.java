/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mabardaji
 */
public class VistaGUIBorderLayout extends JFrame {

    
    public VistaGUIBorderLayout(String title)  throws HeadlessException {
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
        contenidorPrincipal.setLayout(new BorderLayout());
         //JCheckBox ch1 = new JCheckBox("North",true);
         
        //contenidorPrincipal.add(ch1,BorderLayout.NORTH);
        JPanel panelArriba = new JPanel(new GridLayout(2,2));
        for (int i = 1; i <= 4; i++) {
            panelArriba.add(new JCheckBox("Opcion " + i));
        }//fin de componenets al panel
        contenidorPrincipal.add(panelArriba,BorderLayout.NORTH);
        
        
        
        
          JCheckBox ch2 = new JCheckBox("South");
        contenidorPrincipal.add(ch2,BorderLayout.SOUTH);
        JCheckBox ch3 = new JCheckBox("EAST");
        contenidorPrincipal.add(ch3,BorderLayout.EAST);
        JCheckBox ch4 = new JCheckBox("WEST");
        contenidorPrincipal.add(ch4,BorderLayout.WEST);
        JButton boto = new JButton("Estoy en en centro");
        contenidorPrincipal.add(boto,BorderLayout.CENTER);
        
        
        
    }
    
    
    
    
}
