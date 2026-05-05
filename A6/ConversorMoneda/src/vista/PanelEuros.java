/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mabardaji
 */
public class PanelEuros extends JPanel {
    JTextField monedasCambio;
    JLabel resultadoCambio;
    JButton EurDolar;

    public PanelEuros() {
        this.setLayout(new GridLayout(4, 2));
        JLabel etiqueta = new JLabel("Euro: ");
        this.add(etiqueta);
        monedasCambio = new JTextField();
        this.add(monedasCambio);
        JLabel etiqueta2 = new JLabel("Conversion: ");
        this.add(etiqueta2);
        resultadoCambio = new JLabel("----");
        this.add(resultadoCambio);
        EurDolar = new JButton("A dolares");
        this.add(EurDolar);
    }

    public JTextField getMonedasCambio() {
        return monedasCambio;
    }

    public JLabel getResultadoCambio() {
        return resultadoCambio;
    }

    public JButton getEurDolar() {
        return EurDolar;
    }
    
    
}
