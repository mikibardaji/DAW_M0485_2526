/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Luchador;
import Modelo.LuchadorDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class VistaConsolaLuchador {
    Scanner sc = new Scanner(System.in);
    
    
    public void run()
    {   
       try {
            LuchadorDAO dao = new LuchadorDAO();
            int opcio;
            //EL MENU MILLOR EL QUE HEM TREBALLAT A CLASSE
            do {
                System.out.println("\n--- MENÚ POKÉMON ---");
                System.out.println("1. Listar Luchador\n2. Listar por categoria\n3. Alta Luchador\n4. Lucha\n5. Buscar por nombre\n0. Sortir");
                opcio = Integer.parseInt(sc.nextLine());

                switch (opcio) {
                    case 1 :
                        ListaLuchadorEficiencia(dao);
                        break;
                    case 2:
                        LuchadorCategoria(dao);
                        break;
                    case 3: 
                         AltaLuchador(dao);
                         break;
                    case 4:
                        Lucha(dao);
                        break;
                    case 5:
                        BusquedaPornombre(dao);
                        break;
                }
                System.out.println("Apreta enter per tornar al menú... ");
                sc.nextLine();
            } while (opcio != 0);
        } catch (SQLException e) {
            System.out.println("ERROR CRiTIC: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error amb els drivers: " + ex.getMessage());
        }
        
        System.out.println("? Saliendo del programa...");
        sc.close();
    }

    

    private void anyadirOpcionesMenu(Menu menuLuchador) {
      /*afegeixes opcio dle menú i marques quina es la sortida*/
    }

    private void ListaLuchadorEficiencia(LuchadorDAO dao) {
        try {
            List<Luchador> all = dao.getAllWrestlers();
            listado(all);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void LuchadorCategoria(LuchadorDAO dao) {
        System.out.print("Pon categoria que quieres? ");
        String category = sc.nextLine();
        try {
            List<Luchador> all = dao.getAllWrestlersCategory(category);
            listado(all);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void AltaLuchador(LuchadorDAO dao) {
        try {
            System.out.print("Escriu id lluitador");
            int id = sc.nextInt();
            sc.nextLine();
            Luchador l = dao.buscarPorId(id);
            if (l==null)
            {
                System.out.print("nombre:");
                String nombre = sc.nextLine();
                System.out.print("peso: ");
                double peso = sc.nextDouble();
                l = new Luchador(id, nombre, peso, 0, 0);
                int insert = dao.insertarLuchador(l);
                if (insert>0)
                {
                    System.out.println("Insertado");
                }
                else
                {
                    System.out.println("No insertado");
                }
            }
            else
            {
                System.out.print("peso: ");
                double peso = sc.nextDouble();
                String category = Luchador.getCategory(peso);
                int insert = dao.actualizarPeso(l,peso,category);
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(VistaConsolaLuchador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Lucha(LuchadorDAO dao) {
        try {
            System.out.print("Escriu luchador 1");
            int id = sc.nextInt();
            sc.nextLine();
            Luchador l1 = dao.buscarPorId(id);
            System.out.print("Escriu luchador 2");
            id = sc.nextInt();
            sc.nextLine();
            Luchador l2 = dao.buscarPorId(id);
            
            if (l2==null || l1 == null)
            {
                System.out.println("No hay lucha");
            }
            else
            {
                int min1 = l1.getWins();
                if (min1>50)
                {
                    min1 = 50;
                }
                int min2 = l1.getWins();
                if (min2>50)
                {
                    min2 = 50;
                }
                Random rd = new Random();
                int punts1 = rd.nextInt(min1, 101);
                int punts2 = rd.nextInt(min2, 101);
                
                if (punts1>=punts2)
                {
                    l1.setWeight(l1.getWins()+1);
                    System.out.println("Ganador 1");
                }
                if (punts2>=punts1)
                {
                    l2.setWeight(l2.getWins()+1);
                    System.out.println("Ganador 2");
                }
                l1.setTotalFights(l1.getTotalFights()+1);
                l2.setTotalFights(l1.getTotalFights()+1);
                
                dao.actualizarLuchas(l1.getId(),l1.getWins(),l1.getTotalFights());
                dao.actualizarLuchas(l2.getId(),l2.getWins(),l2.getTotalFights());
                /* mostrar resultado de lucha*/
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(VistaConsolaLuchador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void BusquedaPornombre(LuchadorDAO dao) {
        try {
            System.out.print("Pon nombre luchador? ");
            String nombre = sc.nextLine();
            Luchador encontrado = dao.selectByName(nombre);
            if(encontrado != null)
            {
                System.out.println(encontrado);
            }
            else
            {
                System.out.println("No existe luchador");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaConsolaLuchador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listado(List<Luchador> all) {
        if (all.size()==0)
        {
            System.out.println("No hay luchadores para listar");
        }
        else
        {
            for (Luchador luchador : all) {
                System.out.println(luchador);
            }
            System.out.println("Luchadores total: " + all.size());
        }
        System.out.println("aprieta enter para volver al menu");
        sc.nextLine();
        
    }
}
