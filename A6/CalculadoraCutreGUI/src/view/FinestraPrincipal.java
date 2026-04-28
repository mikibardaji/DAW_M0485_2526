/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import calculadoracutregui.PanelBotones;
import calculadoracutregui.PanelDatosEntrada;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author mabardaji
 */
public class FinestraPrincipal extends JFrame{

    public FinestraPrincipal() throws HeadlessException {
        //inicializar comportamiento Ventana
        initComponentsTitle();
        //initMenu IMPORTANTE
        
        //layout del contenedor
        initContainer();
        
    }

    private void initComponentsTitle() {
        //titulo
        this.setTitle("Calculadora Cutre"); //porque finestraPrincipal es JFRAME
        //indicar que faig quant s'apreti la X de la finestra
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //tamaño aqui si que importa
        this.setSize(1200, 500);
        
        //centrado
        this.setLocationRelativeTo(null);
    }

    private void initContainer() {
        //disposicion componentes/Layout
        Container principal = this.getContentPane();
        principal.setLayout(new BorderLayout());
        //principal.setLayout(new GridLayout(1, 1));
        //declaro un panel
        PanelDatosEntrada datos = new PanelDatosEntrada();
        principal.add(datos,BorderLayout.CENTER);
        //principal.add(datos);
        //declaro el segundo panel
        PanelBotones botones = new PanelBotones();
        botones.setPreferredSize(new Dimension(0, 100));
        principal.add(botones,BorderLayout.SOUTH);
        //principal.add(botones);
        //PanelBotones botones2 = new PanelBotones();
        //principal.add(botones2);
    }
    
    
    
}
