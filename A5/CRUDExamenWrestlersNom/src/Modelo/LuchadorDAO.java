/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Persistencia.DbConnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class LuchadorDAO {
    private Connection conn;


    public LuchadorDAO() throws SQLException, ClassNotFoundException {
        DbConnect.loadDriver();
        this.conn = DbConnect.getConnection();

    }    

    public List<Luchador> getAllWrestlers() throws SQLException {
        List<Luchador> todos = new ArrayList<>();
        String sql = "SELECT * FROM LLUITADORS"; 
        
        PreparedStatement selectAll = conn.prepareStatement(sql);
        ResultSet rs = selectAll.executeQuery();
        while(rs.next())
        {
            int id = rs.getInt("id");
            String nom = rs.getString("name");
            double peso = rs.getDouble("weight");
            int wins = rs.getInt("wins");
            int total = rs.getInt("totalFights");
            Luchador w = new Luchador(id, nom, peso, wins, total);
            todos.add(w);
        }
        rs.close();
        selectAll.close();
        return todos;
    }

    public List<Luchador> getAllWrestlersCategory(String category) throws SQLException {
        List<Luchador> todos = new ArrayList<>();
        String sql = "SELECT * FROM LLUITADORS "
                + " where category = ? "
                + " order by wins desc"; 
        
        PreparedStatement selectAll = conn.prepareStatement(sql);
        selectAll.setString(1, category);
        ResultSet rs = selectAll.executeQuery();
        while(rs.next())
        {
            int id = rs.getInt("id");
            String nom = rs.getString("name");
            double peso = rs.getDouble("weight");
            int wins = rs.getInt("wins");
            int total = rs.getInt("totalFights");
            Luchador w = new Luchador(id, nom, peso, wins, total);
            todos.add(w);
        }
        rs.close();
        selectAll.close();
        return todos;
    }

    public Luchador selectByName(String nombre) throws SQLException {
        Luchador fight=null;
        String sql = "SELECT * FROM LLUITADORS "
                + " where nombre = ? ";
                
        
        PreparedStatement selectAll = conn.prepareStatement(sql);
        selectAll.setString(1, nombre);
        ResultSet rs = selectAll.executeQuery();
        while(rs.next())
        {
            int id = rs.getInt("id");
            String nom = rs.getString("name");
            double peso = rs.getDouble("weight");
            int wins = rs.getInt("wins");
            int total = rs.getInt("totalFights");
            fight = new Luchador(id, nom, peso, wins, total);            
        }
        rs.close();
        selectAll.close();
        return fight;
    }

    public Luchador buscarPorId(int id) throws SQLException {
        Luchador fight=null;
        String sql = "SELECT * FROM LLUITADORS "
                + " where id = ? ";

        PreparedStatement selectAll = conn.prepareStatement(sql);
        selectAll.setInt(1, id);
        ResultSet rs = selectAll.executeQuery();
        if(rs.next())
        {
            //int id1 = rs.getInt("id");
            String nom = rs.getString("nom");
            double peso = rs.getDouble("pes");
            int wins = rs.getInt("victories");
            int total = rs.getInt("total_lluites");
            fight = new Luchador(id, nom, peso, wins, total);            
        }
        rs.close();
        selectAll.close();
        return fight;
    }

    public int insertarLuchador(Luchador l) throws SQLException {
        String sql = "Insert into lluitadors"
                + "(id,nom,pes,categoria,victories,total_lluites)"
                + " values (?,?,?,?,?,?) ";
        PreparedStatement insert = conn.prepareStatement(sql);
            insert.setString(2, l.getName());
            insert.setDouble(3, l.getWeight());
            insert.setString(4, l.getCategory());
            insert.setInt(5, l.getWins());
            insert.setInt(6, l.getTotalFights());
            insert.setInt(1, l.getId());
            return insert.executeUpdate();
    }

    public int actualizarPeso(Luchador l, double peso, String category) {
        String updateSql = "UPDATE wrestlers "
                + "SET weight = ?, category = ? "
                + "WHERE id = ?";
        PreparedStatement updateStmt = null;
        /* 
        lo de siempre
        */
        return 0;
    }

    public int actualizarLuchas(int id, int wins, int totalFights) throws SQLException {
          String sql = "UPDATE wrestlers "
                + " SET wins = ?, total_fights = ? "
                + " WHERE id = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, wins);
            stmt.setInt(2, totalFights);
            stmt.setInt(3, id);
            return stmt.executeUpdate();
        } finally {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    }
}
