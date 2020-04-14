/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.TipoVehiculo;

/**
 *
 * @author freddy
 */
public class TipodeVehiculoDAO {
    
    //Metodo  insert 
    public static boolean insertartv(TipoVehiculo tv){
        try{
            Connection cone= conexionLib.conectarnosDB();
            String SQL = "INSERT INTO tipo_vehiculo(id,nomtv) VALUES(?,?)";
            
            PreparedStatement ps=cone.prepareStatement(SQL);
            ps.setInt(1, tv.getIdtv());
            ps.setString(2, tv.getNomtv());
            
            return ps.executeUpdate() > 0;
        } catch(SQLException ex){
            return false;
        }
    }
    
    
}
