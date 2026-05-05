/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Modelo.OperadorDAO;
import calculadoracutregui.PanelBotones;
import calculadoracutregui.PanelDatosEntrada;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mabardaji
 */
public class FinestraPrincipal extends JFrame implements ActionListener{

    PanelDatosEntrada datos; //siguin globals i a tots els metodes 
    PanelBotones botones; //els pugui referenciar
    ActionListener escuchadorAcciones; //aquest
    //al ser Ci V junt fiquem el dao
    OperadorDAO dao; //dao es null
    
    public FinestraPrincipal()  {
        dao = new OperadorDAO(); //inicialitzo dao
        //inicialitzo el listener
        escuchadorAcciones = this; //la mateixa classe FinestraPrincipal extends JFrame implements ActionListener
        //inicializar comportamiento Ventana
        initComponentsTitle();
        //initMenu IMPORTANTE
        
        //layout del contenedor
        initContainer();
        initListeners();
        
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
        datos = new PanelDatosEntrada();
        principal.add(datos,BorderLayout.CENTER);
        //principal.add(datos);
        //declaro el segundo panel
        botones = new PanelBotones();
        botones.setPreferredSize(new Dimension(0, 100));
        principal.add(botones,BorderLayout.SOUTH);
        //principal.add(botones);
        //PanelBotones botones2 = new PanelBotones();
        //principal.add(botones2);
    }

    /*es crida quant hi ha alguna accio dins el Jframe
    implements ActionListener*/
    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("He entrado en actionPerformed");
        //per saber quin component ha estat apretat/interaccionat
        //System.out.println("action comand del componente " + 
        //        e.getActionCommand());
        
        //la parte de menu que hemos hecho hasta la A5
        String accionRealizar = e.getActionCommand();
        //menu de antes
        switch(accionRealizar)
        {
            case "suma":
                accionSumar();
                break;
            case "resta":
                accionRestar();
                break;
            case "multiplicar":
                accionMultiplicar();
                break;
            case "dividir":
                accionDividir();
                break;                
        }
        
        
        
        
    }

    /*
    aqui inicializo todos los componentes
    que me interesan que reaccionen a eventos del raton/teclado
    */
    private void initListeners() {
        //comand que es un string para reconocer el componente
        //el string es libre
        botones.getAdd().setActionCommand("suma");
        //IMPORTANTE, PONERLE EL LISTENER
        botones.getAdd().addActionListener(escuchadorAcciones);
        
        botones.getMinus().setActionCommand("resta");
        botones.getMinus().addActionListener(escuchadorAcciones);
        
        botones.getMultiply().setActionCommand("multiplicar");
        botones.getMultiply().addActionListener(escuchadorAcciones);
        
        botones.getDivide().setActionCommand("dividir");
        botones.getDivide().addActionListener(escuchadorAcciones);
        
        
    }

    private void accionSumar() {
        //recuperar datos entrada //scanner
        //recupero de la ventana
        String operador1 = datos.getOper1().getText(); //son string que no puedo operar
        String operador2 = datos.getOper2().getText();
        double op1 = Double.parseDouble(operador1);
        double op2 = Double.parseDouble(operador2);
        //interaccion amb el model
        double resultado = dao.suma(op1, op2);
        mostrarResultadoLabel(resultado);
    }

    private void mostrarResultadoLabel(double resultado)
    {
          //conversion a string
        String resultadoString = String.valueOf(resultado);
        datos.getResultado().setText(resultadoString);
    }
    
    private void accionRestar() {
        //recuperar datos entrada //scanner
        //recupero de la ventana
        String operador1 = datos.getOper1().getText(); //son string que no puedo operar
        String operador2 = datos.getOper2().getText();
        double op1 = Double.parseDouble(operador1);
        double op2 = Double.parseDouble(operador2);
        //interaccion amb el model
        double resultado = dao.resta(op1, op2);
        mostrarResultadoLabel(resultado);
    }

    private void accionMultiplicar() {
        //recuperar datos entrada //scanner
        //recupero de la ventana
        String operador1 = datos.getOper1().getText(); //son string que no puedo operar
        String operador2 = datos.getOper2().getText();
        double op1 = Double.parseDouble(operador1);
        double op2 = Double.parseDouble(operador2);
        //interaccion amb el model
        double resultado = dao.multiplica(op1, op2);
        mostrarResultadoLabel(resultado);       
    }

    private void accionDividir() {
        try{
        //recuperar datos entrada //scanner
        //recupero de la ventana
        String operador1 = datos.getOper1().getText(); //son string que no puedo operar
        String operador2 = datos.getOper2().getText();
        double op1 = Double.parseDouble(operador1);
        double op2 = Double.parseDouble(operador2);
        //interaccion amb el model
        double resultado = dao.divideix(op1, op2);
        mostrarResultadoLabel(resultado);   
        }
        catch (ArithmeticException ex)
        {
            //opcion 1 mensaje en el label resultado
            //lo normal seria ponerlo en rojo
            datos.getResultado().setText(ex.getMessage());
            //opcio 2 las mas utilizada 
            JOptionPane.showMessageDialog(null, //null ventana centrada en pantalla
                    ex.getMessage(),  //mensaje que saldra en el cuadro
                    "Error", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    
}
