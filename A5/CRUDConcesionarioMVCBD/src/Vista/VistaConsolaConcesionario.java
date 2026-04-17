/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Coche;
import Modelo.CocheDAODB;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class VistaConsolaConcesionario {
    Scanner sc = new Scanner(System.in);
    
    
    public void run()
    {   
        try {
            CocheDAODB modelo = new CocheDAODB();
            
            /* Crear una variable pel model de dades*/
            //LuchadorDAOList repositori = new LuchadorDAOList();
            Menu menuConcesionario = new Menu("Concesionario DAW");
            anyadirOpcionesMenu(menuConcesionario);
            int opcion=0;
            do {
                menuConcesionario.mostrarMenu();
                
                
                opcion = menuConcesionario.llegirOpcioValida();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Alta");
                        altaCochesito(modelo);
                        break;
                    case 2:
                        System.out.println("Listar");
                        listarCochesito(modelo);
                        break;
                    case 3:
                        System.out.println("Vender");
                        deleteCoche(modelo);
                        break;
                    case 4:
                        System.out.println("Consultar");
                        consultaCoche(modelo);
                        break;
                    default:
                        if (opcion == menuConcesionario.getOpcioSalida()) {
                          System.out.println("Salir");  
                        } else{
                          System.out.println("opcion incorrecta");
                        }
                       
                        break;
                }
                
            } while (opcion != menuConcesionario.getOpcioSalida());
            
            System.out.println("? Saliendo del programa...");
            sc.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    

    private void anyadirOpcionesMenu(Menu menuLuchador) {
        menuLuchador.afegirOpcio("Alta Coche");
        menuLuchador.afegirOpcio("Listar todos Coches");
        menuLuchador.afegirOpcio("Vender Coche");
        menuLuchador.afegirOpcio("Consultar Coche");
        menuLuchador.afegirOpcio("Salir");
        menuLuchador.setOpcioSalida(5); //salida
    }

    private void listarCochesito(CocheDAODB modelo) {
        try {
            List<Coche> all = modelo.getLista();
            for (Coche carro : all) {
                System.out.println(carro);
              
                   
            }   
            System.out.println("Coches encontrados: " + all.size());
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private void altaCochesito(CocheDAODB modelo) {
        try {
            System.out.println("Dime la matricula del coche: ");
            String matricula = sc.nextLine();
            System.out.println("Dime la marca de coche: ");
            String marca = sc.nextLine();
            System.out.println("Cuantas puertas tiene: ");
            int puertas = sc.nextInt();
            sc.nextLine(); //buffer
            System.out.println("Es automatico?");
            String respuesta = sc.nextLine();
            boolean aut;
            if (respuesta.equalsIgnoreCase("si")) {
                aut = true;
            }else {
                aut = false;
            }
            Coche nuevo = new Coche(matricula, marca, puertas, aut);
            int filasAfectadas = modelo.addCoche(nuevo);
            if (filasAfectadas==1)
            {
                System.out.println("Coche Insertado");
            }
            else
                System.out.println("No se ha insetrtado");
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
    }
    
    
    private void modificarCoches(CocheDAODB modelo) {
        Scanner sc = new Scanner(System.in);
           
            System.out.println("INTRODUCE DATOS DE COCHE QUE QUIERE MODIFICAR ");
           
            System.out.println("introduce el numero de matricula ");
            String mat = sc.nextLine();
           
            if (mat.length()== 7) {
 
            try {
                System.out.println("introduce la nueva marca ");
                String mar = sc.nextLine();
               
                System.out.println("introduce cuantas puertas tiene ");
                int puer = sc.nextInt();
                sc.nextLine();
                System.out.println("Es automatico? ");
                String respuesta = sc.nextLine();
               
                boolean aut;
                if (respuesta.equalsIgnoreCase("si")) {
                    aut = true;
                   
                } else {
                    aut = false;
                }
                Coche cochesModificar = new Coche(mat, mar, puer, aut);
               
                int update = modelo.modificarCar(cochesModificar);
               
                if (update == 0) {
                    System.err.println("no existe la matricula "+mat);
                 
                }else{
                    System.out.println("se han actualizado " + update + " coche");
                }
               
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
                   
                   
            }else{
                System.err.println("la matricula tiene que ser de 7 ");
            }
       
    }
    
    
    private void deleteCoche(CocheDAODB modelo){
        try {
            System.out.println("De cuantas puertas quieres eliminar los coches");
            int puerta = sc.nextInt();
            sc.nextLine();
            Coche eliminarCoche = new Coche(" ", " ", puerta, true);
            int cochePuertas = modelo.eliminarCoche(eliminarCoche);
            if (cochePuertas == 0) {
                System.err.println("ERROR, no existe esas puertas");
            }else{
                System.out.println("Se ha eliminado " + cochePuertas + " coches");
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private void consultaCoche(CocheDAODB modelo) {
        try {
            System.out.println("introduce el numero de matricula a buscar ");
            String mat = sc.nextLine();
            
            Coche buscado = modelo.consultaCocheMatricula(mat);
            if (buscado!=null)
            {
                System.out.println("Encontrado coche!");
                System.out.println(buscado);
            }
            else
            {
                System.err.println("No existe coche con la matricula " + mat);
            }
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
    }
    
}
