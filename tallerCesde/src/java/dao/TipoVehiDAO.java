/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.tipovehi;

/**
 *
 * @author freddy
 */
public class TipoVehiDAO {
    //  Metodo Insert
    public static  boolean insertartv (tipovehi tv){  
        try{
            Connection cone= conexionLib.conectarnosDB();
            String SQL = "INSERT INTO tipo_vehiculo(id,nomtv) VALUES(?,?)";            
            PreparedStatement ps= cone.prepareStatement(SQL);
            ps.setInt(1, tv.getIdtv());
            ps.setString(2, tv.getNomtv());
            
            return ps.executeUpdate() > 0;
        }catch(SQLException ex){
            return false;
        }
    } 
    // Metodo para listar tipos de vehiculos
   public static ArrayList<tipovehi> ListarTv(){       
        try {
            String sqlListarTv= "select * from tipo_vehiculo";
            Connection conex = conexionLib.conectarnosDB();
            PreparedStatement st=conex.prepareStatement(sqlListarTv);
            ResultSet resultado = st.executeQuery();
            ArrayList<tipovehi> listatv = new ArrayList<>();
            tipovehi TipoVehi;
            while(resultado.next()){
                TipoVehi = new tipovehi();
                TipoVehi.setIdtv(resultado.getInt("id")) ; 
                TipoVehi.setNomtv(resultado.getString("nomtv")); 
                listatv.add(TipoVehi);  
            }
            return listatv;
        } catch (SQLException ex) {
            return null;
        }
   }
}  
