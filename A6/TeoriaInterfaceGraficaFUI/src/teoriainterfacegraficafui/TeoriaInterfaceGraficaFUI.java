/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriainterfacegraficafui;

import Vista.VistaGUI;
import Vista.VistaGUIBorderLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mabardaji
 */
public class TeoriaInterfaceGraficaFUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mainSinClases();
        try
        {
        VistaGUIBorderLayout ventanaPrincipal;
        ventanaPrincipal = new VistaGUIBorderLayout("HelloWorld");
        } catch(HeadlessException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private static void disposicioFlowLayout(Container contenidorPrincipal) {
        //per maquetar la pantalla
        contenidorPrincipal.setLayout(new FlowLayout());
        
        
        JButton ok = new JButton("Aprieta");
        //ok.setSize(new Dimension(500, 300));
        contenidorPrincipal.add(ok);
        JLabel etiqueta = new JLabel("Hello World");
        contenidorPrincipal.add(etiqueta);
        JTextField inputDatos = new JTextField("Introduce datos");
        contenidorPrincipal.add(inputDatos);
    }

    private static void disposicioBorderLayout(Container contenidorPrincipal) {
        contenidorPrincipal.setLayout(new BorderLayout());
        JButton ok = new JButton("North");
        contenidorPrincipal.add(ok,BorderLayout.NORTH);
        JButton ok2 = new JButton("South");
        contenidorPrincipal.add(ok2,BorderLayout.SOUTH);
        JLabel eti = new JLabel("EAST");
        contenidorPrincipal.add(eti,BorderLayout.EAST);
        JLabel eti2 = new JLabel("WEST");
        contenidorPrincipal.add(eti2,BorderLayout.WEST);
        JTextField inputDatos = new JTextField("Estoy en en centro");
        contenidorPrincipal.add(inputDatos,BorderLayout.CENTER);
    }

    private static void disposicioGridLayout(Container contenidorPrincipal) {
        contenidorPrincipal.setLayout(new GridLayout(3, 5));
        for (int i = 1; i <= 15; i++) {
            contenidorPrincipal.add(new JButton("Botó " + i));
        }
    }

    private static void mainSinClases() {
        JFrame finestraPrincipal = new JFrame("HelloWorld");
        
        //per marcar quina acció es farà al apretar la X de la finestra
        finestraPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //per centrar la finestra a la meitat de pantalla
        finestraPrincipal.setLocationRelativeTo(null);
        //dimension finestra
        finestraPrincipal.setSize(1300, 500);
        //components dintre la finestra
        Container contenidorPrincipal = finestraPrincipal.getContentPane();
        
        
        //disposicioFlowLayout(contenidorPrincipal);
        //disposicioBorderLayout(contenidorPrincipal);
        disposicioGridLayout(contenidorPrincipal);
        //compactar ventana y dejarla acorde con los componentes.s
        //finestraPrincipal.pack();
        finestraPrincipal.setVisible(true);
    }
    
}
