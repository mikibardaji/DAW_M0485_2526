/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mabardaji
 */
public class ChorraPanel extends JPanel{

    JButton boton;
    public ChorraPanel() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("sdflkjdfklssdfjklsd");
        boton = new JButton("Aprietame");
        this.add(etiqueta);
        this.add(boton);
    }

    public JButton getBoton() {
        return boton;
    }
    
    
    
    
}
