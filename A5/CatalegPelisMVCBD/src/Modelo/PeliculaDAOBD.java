/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import PersistenciaModelo.DbConnect;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class PeliculaDAOBD implements InterfaceDAO{
    Connection conn=null;

    public PeliculaDAOBD() throws ClassNotFoundException {
        DbConnect.loadDriver();
    }
    
    
    
    

    @Override
    public boolean addPeli(Pelicula anyadir) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Pelicula> allPelis() { //throws SQLException
        List<Pelicula> all = new ArrayList<>();
        try {
            conn = DbConnect.getConnection(); //creo conexion a traves de la cual ejecutare 
            //las instruccioes sql
            if (conn!=null)
            {
                Statement stmt = conn.createStatement(); // import java.sql.Statement
                String query = "SELECT * FROM MOVIES"; 
                ResultSet rs = stmt.executeQuery(query); //resultat es una clase que
                //contendra todas las filas
                //List<Pelicula> all = new ArrayList<>();
                while(rs.next()) //si da true es que hay una siguiente
                {
                   int codiPelSaved = rs.getInt("codiPel");
                   String titolSaved = rs.getString("Titol");
                   String genereSaved = rs.getString("genere");
                   int duracionSaved = rs.getInt("duracion");
                   boolean segundaParteSaved = rs.getBoolean("segundaParte");
                   all.add(new Pelicula(codiPelSaved, titolSaved, genereSaved, duracionSaved, segundaParteSaved));
                }
                rs.close();
                stmt.close();
                conn.close();
                return all; //retorno la lista
            }
            else
                return all;
        } catch (SQLException ex) { //esto seria throws SQLEXCETPTION en la cabecera, 
            //pero el interface no deja
            System.out.println(ex.getMessage());
            return all; 
        }
    }

    @Override
    public List<Pelicula> AllPelisSecondPart(boolean segunda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean borrarPelicula(Pelicula fakeDelete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pelicula findPeli(Pelicula fakeSearch) throws InvalidIdPeliculaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pelicula> findPelisGenero(String generoSearch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pelicula> findPelisGenero2(Pelicula generoSearch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int borrarPeliculasNombre(String tituloDelete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
