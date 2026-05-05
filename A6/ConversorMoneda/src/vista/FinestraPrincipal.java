/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Moneda.ConversorDAO;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.FlatteningPathIterator;
import javax.swing.JFrame;

/**
 *
 * @author mabardaji
 */
public class FinestraPrincipal extends JFrame implements ActionListener
{

    PanelEuros euroPanel;
    ActionListener al;
    ConversorDAO dao;
    
    public FinestraPrincipal()  {
        dao = new ConversorDAO();
        al = this;
        //inicializar ventana
        initTitle();
        
        initContainer();
        initListener();
        setVisible(true);
    }

    private void initTitle() {
        this.setTitle("Conversor de Monedas"); //porque finestraPrincipal es JFRAME
        //indicar que faig quant s'apreti la X de la finestra
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //tamaño aqui si que importa
        this.setSize(1500, 500);
        
        //this.pack();
        //centrado
        this.setLocationRelativeTo(null);
    }

    private void initContainer() {
        Container principal = this.getContentPane();
        principal.setLayout(new GridLayout(1,1)); //podria ser grid 1,1 o borderLayout (center)
        euroPanel = new PanelEuros();
        principal.add(euroPanel);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        switch (comando)
        {
            case "EURDOLAR":
                convertirADolar();
                break;
        }
    }

    private void initListener() {
        euroPanel.getEurDolar().setActionCommand("EURDOLAR");
        euroPanel.getEurDolar().addActionListener(al);
    }

    private void convertirADolar() {
        String operador1 = euroPanel.getMonedasCambio().getText(); //son string que no puedo operar
        double op1 = Double.parseDouble(operador1);
        double dolar = dao.convertirEurAUsd(op1);
        mostrarResultadoLabel(dolar);   
    }

    private void mostrarResultadoLabel(double dinero) {
        String resultadoString = String.valueOf(dinero);
        euroPanel.getResultadoCambio().setText(resultadoString);
    }
    
}
