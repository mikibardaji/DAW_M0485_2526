/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistencia.DbConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PokemonDAO {
    private Connection conn;
    private EvolucioDAO evolucioDAO; // Atribut de l'altre DAO

    public PokemonDAO() throws SQLException, ClassNotFoundException {
        DbConnect.loadDriver();
        this.conn = DbConnect.getConnection();
        this.evolucioDAO = new EvolucioDAO();
    }

    public int capturar(Pokemon p) throws SQLException {
        
                //conn = DbConnect.getConnection();
                String sql = "INSERT INTO pokemons " +
                        " (id, nom, tipus, nivell, capturats) " +
                        " VALUES (?, ?, ?, ?, ?)";

                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, p.getId());
                ps.setString(2, p.getNom());
                ps.setString(3, p.getTipus());
                ps.setInt(4, p.getNivell());
                ps.setInt(5, p.getCapturats());
                return ps.executeUpdate();

        }
    

    public List<Pokemon> llistarTots() throws SQLException {
        List<Pokemon> llista = new ArrayList<>();
        String sql = "SELECT * FROM pokemons";
        Statement st = conn.createStatement(); 
        ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                //int id = rs.getInt("id");
                //String nom = rs.getString("nom");
                //...
                //Pokemon add = new Pokemon(id, nom, nom, id, id);
                
                llista.add(new Pokemon(rs.getInt("id"), rs.getString("nom"), 
                           rs.getString("tipus"), rs.getInt("nivell"), rs.getInt("capturats")));
            }
        return llista;
    }

    public Pokemon buscarPerNom(String nom) throws SQLException {
        String sql = "SELECT * FROM pokemons WHERE UPPER(nom) = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nom.toUpperCase());
            ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    return new Pokemon(rs.getInt("id"), rs.getString("nom"), 
                               rs.getString("tipus"), rs.getInt("nivell"), rs.getInt("capturats"));
                }
        
        return null;
    }
    
    private int buscarIdMaxim() throws SQLException {
        String sql = "SELECT MAX(*) into idMax FROM pokemons ";
        PreparedStatement ps = conn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    return rs.getInt("idMax");
                }
                else 
                    return 0;
    }

    public boolean evolucionar(String nomBase, int quantitat) throws SQLException {
        String nomEvolucio = evolucioDAO.obtenirEvolucio(nomBase);
        if (nomEvolucio == null) 
            throw new SQLException("Aquest Pokémon no té evolució registrada.");

        Pokemon base = buscarPerNom(nomBase);
        if (base == null || 
                base.getCapturats() < quantitat) 
            throw new SQLException("No tens prou exemplars de " + nomBase);

        // 1. Restar al base la quantitat
        int update1 = actualitzarCapturats(nomBase, (-1) * quantitat);
        

        // 2. Sumar o insertar l'evolucionat
        Pokemon evolucio = buscarPerNom(nomEvolucio);
        if (evolucio != null) {
            int update = actualitzarCapturats(nomEvolucio, quantitat);
            return true; //true voldra dir que ja el tenies i estar actualitzar
            }
         else {
            
            int maximId = buscarIdMaxim(); //al no existir busco id lliure
            Pokemon nou = new Pokemon(maximId+1, nomEvolucio, base.getTipus(), base.getNivell(), quantitat);
            //reutilitzo metodes que ja tinc
            capturar(nou);
            
                return false; //es final correcte però vol dir que es
                //el primer que tens
            }
        }

//    public int actualitzatCapturats(String nom) throws SQLException {
//            String sql = "UPDATE pokemons " 
//                    + " SET capturats = capturats + 1 " + 
//                    " WHERE nom = ?";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, nom);
//            return ps.executeUpdate();
//    }

    public int actualitzarCapturats(String nomEvolucio, int quantitat) throws SQLException {
        String sqlUpdateEvo = "UPDATE pokemons " 
                    + " SET capturats = capturats + ? " 
                    + " WHERE nom = ?";
            PreparedStatement ps1 = conn.prepareStatement(sqlUpdateEvo);
                ps1.setInt(1, quantitat);
                ps1.setString(2, nomEvolucio);
               return  ps1.executeUpdate();
    }
}
