/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistencia.DbConnect;

/**
 *
 * @author mabardaji
 */
public class CocheDAODB {
     Connection conn = null;
    public CocheDAODB() throws ClassNotFoundException {
        DbConnect.loadDriver();
    }

    public List<Coche> getLista() throws SQLException {
     conn = DbConnect.getConnection();
        if (conn != null) {
            List<Coche> tienda = new ArrayList<>();
            String query = "SELECT * FROM coches";
            System.out.println(query);
            PreparedStatement pepereina = conn.prepareStatement(query);
            ResultSet cursor =  pepereina.executeQuery();
            while(cursor.next()){
                String matricula = cursor.getString("matricula");
                String marca = cursor.getString("marca");
                int puerta = cursor.getInt("puertas");
                boolean automatico = cursor.getBoolean("automatico");
                Coche car = new Coche(matricula, marca, puerta, automatico);
                tienda.add(car);    
            } 
            cursor.close();
            pepereina.close();
            conn.close();
            return tienda;
                
            
        }else{
           throw new SQLException("Conexion fallida");
        }   
    }

    public int addCoche(Coche nuevo) throws SQLException {
    conn = DbConnect.getConnection();
    String query = "INSERT INTO coches (matricula, marca, puertas, automatico) VALUES(?,?,?,?)";
        
        if (conn != null) {
            System.out.println(query);
            PreparedStatement pepereina = conn.prepareStatement(query);
            pepereina.setString(1, nuevo.getMatricula());
            pepereina.setString(2, nuevo.getMarca());
            pepereina.setInt(3, nuevo.getPuertas());
            pepereina.setBoolean(4, nuevo.isAutomatico());
            int filas = pepereina.executeUpdate();
            pepereina.close();
            conn.close();
           
            return filas;
        }else{
           throw new SQLException("Conexion fallida");
        }  
        
    }
    
    
    public int modificarCar(Coche cochesModificar) throws SQLException {
        conn = DbConnect.getConnection();
     
        //verificar que exista
        boolean existe = existeCocheMatricula(cochesModificar.getMatricula());
       
        if (existe==true)
        {
                String queryDos ="UPDATE coches SET marca = ?    "
                        + ", puertas = ? "
                        + ", automatico = ?"
                        + " WHERE matricula = ?";

                //System.out.println(queryDos);
                PreparedStatement pepe = conn.prepareStatement(queryDos);
                pepe.setString(1, cochesModificar.getMarca());
                pepe.setInt(2,cochesModificar.getPuertas());
                pepe.setBoolean(3,cochesModificar.isAutomatico());
                pepe.setString(4,cochesModificar.getMatricula());

                int mod = pepe.executeUpdate();

                pepe.close();
                conn.close();
                return mod;
        }
        else
        {
            return 0; //no existe la matricula
        }
    }

    private boolean existeCocheMatricula(String matricula) throws SQLException {
        conn = DbConnect.getConnection();
       
        String query = "SELECT COUNT(*) AS 'Numero' FROM coches where matricula = ?";
        PreparedStatement pepe = conn.prepareStatement(query);
        pepe.setString(1, matricula);
        ResultSet rs  = pepe.executeQuery();
        int numero = 0;
        if (rs.next())
        {
            numero = rs.getInt("Numero");
        }
       
        return numero == 1; //si ha dado 1 es que existe sino false
    }
    
    
}
