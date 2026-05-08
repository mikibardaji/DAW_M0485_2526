/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 *
 * @author mabardaji
 */
public class PanelBotones extends JPanel{
    private JButton add;
    private JButton minus;
    private JButton multiply;
    private JButton divide;

    public PanelBotones() {
        initComponents(); //ficar els components al layout
        initValue();
    }

    private void initComponents() {
        setLayout(new GridLayout(1, 4));
        add = new JButton();
        
        add.setHorizontalAlignment(SwingConstants.CENTER);
        add(add);
        minus = new JButton();
        minus.setHorizontalAlignment(SwingConstants.CENTER);
        add(minus);
        multiply = new JButton();
        multiply.setHorizontalAlignment(SwingConstants.CENTER);   
        add(multiply);
        divide = new JButton();
        divide.setHorizontalAlignment(SwingConstants.CENTER);           
        add(divide);
    }

    private void initValue() {
        add.setText("+");
        minus.setText("-");
        multiply.setText("X");
        divide.setText("/");
    }

    public JButton getAdd() {
        return add;
    }

    public JButton getMinus() {
        return minus;
    }

    public JButton getMultiply() {
        return multiply;
    }

    public JButton getDivide() {
        return divide;
    }
    
    

}

